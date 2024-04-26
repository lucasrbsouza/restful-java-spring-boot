package br.com.java.spring.javawithspring.operacoes;

public class Operacoes {
    public Double sum(Double numberOne,
                      Double numberTwo){

        return numberOne + numberTwo;
    }

    public Double sub(Double numberOne,
                      Double numberTwo) {
        return numberOne - numberTwo;
    }
    public Double mult(Double numberOne,
                       Double numberTwo) {
        return numberOne * numberTwo;
    }
    public Double div(Double numberOne,
                       Double numberTwo) {
        return numberOne / numberTwo;
    }
    public Double media(Double numberOne,
                       Double numberTwo) {
        return (numberOne + numberTwo)/2;
    }
    public Double sqrt(Double numberOne) {
        return Math.sqrt(numberOne);
    }

}

