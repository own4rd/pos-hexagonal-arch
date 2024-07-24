package br.com.lowlevel.pos_hexagonal_arch.application.core.exceptions;

public class CustomerNotFoundException extends RuntimeException{
    public CustomerNotFoundException(String message) {
        super(message);
    }
}
