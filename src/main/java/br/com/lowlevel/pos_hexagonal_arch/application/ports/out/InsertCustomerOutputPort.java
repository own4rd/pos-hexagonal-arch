package br.com.lowlevel.pos_hexagonal_arch.application.ports.out;

import br.com.lowlevel.pos_hexagonal_arch.application.core.domain.Customer;

public interface InsertCustomerOutputPort {

    void insert(Customer customer);

}
