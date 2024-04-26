package br.com.java.spring.javawithspring.controllers;

import br.com.java.spring.javawithspring.exception.UnssoportedMathOperationException;
import br.com.java.spring.javawithspring.operacoes.Operacoes;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

import static br.com.java.spring.javawithspring.conversaoNumeracao.Converte.converToDouble;
import static br.com.java.spring.javawithspring.conversaoNumeracao.Converte.isNumeric;

@RestController
public class MathController {

    private final AtomicLong counter = new AtomicLong();

    private Operacoes math = new Operacoes();


    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sum(@PathVariable(value = "numberOne")String numberOne,
                      @PathVariable(value = "numberTwo")String numberTwo)throws Exception {

        if (!isNumeric(numberOne) || !isNumeric(numberTwo)){
            throw new UnssoportedMathOperationException("Please set a numeric value");
        }
        return math.sum(converToDouble(numberOne), converToDouble(numberTwo));
    }
    @RequestMapping(value = "/sub/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sub(@PathVariable(value = "numberOne")String numberOne,
                      @PathVariable(value = "numberTwo")String numberTwo)throws Exception {

        if (!isNumeric(numberOne) || !isNumeric(numberTwo)){
            throw new UnssoportedMathOperationException("Please set a numeric value");
        }
        return math.sub(converToDouble(numberOne), converToDouble(numberTwo));
    }
    @RequestMapping(value = "/mult/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double mult(@PathVariable(value = "numberOne")String numberOne,
                      @PathVariable(value = "numberTwo")String numberTwo)throws Exception {

        if (!isNumeric(numberOne) || !isNumeric(numberTwo)){
            throw new UnssoportedMathOperationException("Please set a numeric value");
        }
        return math.mult(converToDouble(numberOne), converToDouble(numberTwo));
    }
    @RequestMapping(value = "/div/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double div(@PathVariable(value = "numberOne")String numberOne,
                      @PathVariable(value = "numberTwo")String numberTwo)throws Exception {

        if (!isNumeric(numberOne) || !isNumeric(numberTwo)){
            throw new UnssoportedMathOperationException("Please set a numeric value");
        }
        return math.div(converToDouble(numberOne), converToDouble(numberTwo));
    }
    @RequestMapping(value = "/media/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double media(@PathVariable(value = "numberOne")String numberOne,
                      @PathVariable(value = "numberTwo")String numberTwo)throws Exception {

        if (!isNumeric(numberOne) || !isNumeric(numberTwo)){
            throw new UnssoportedMathOperationException("Please set a numeric value");
        }
        return math.media(converToDouble(numberOne), converToDouble(numberTwo));

    }
    @RequestMapping(value = "/sqrt/{number}", method = RequestMethod.GET)
    public Double sqrt(@PathVariable(value = "number")String number){
        if (!isNumeric(number)){
            throw new UnssoportedMathOperationException("Please set a numeric value");
        }
        return math.sqrt(converToDouble(number));
    }
}




