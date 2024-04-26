package br.com.java.spring.javawithspring.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnssoportedMathOperationException extends RuntimeException {
    public UnssoportedMathOperationException(String ex) {
        super(ex);
    }

    public static final long serialVersionUID = 1L;
}
