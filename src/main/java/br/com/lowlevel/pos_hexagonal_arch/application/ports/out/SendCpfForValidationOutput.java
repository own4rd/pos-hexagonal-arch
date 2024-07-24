package br.com.lowlevel.pos_hexagonal_arch.application.ports.out;

public interface SendCpfForValidationOutput {
    void send(String cpf);
}
