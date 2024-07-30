package br.com.lowlevel.pos_hexagonal_arch.application.ports.out;

public interface SendCpfForValidationOutputPort {
    void send(String cpf);
}
