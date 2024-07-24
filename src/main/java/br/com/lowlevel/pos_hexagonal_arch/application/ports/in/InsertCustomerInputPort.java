package br.com.lowlevel.pos_hexagonal_arch.application.ports.in;

import br.com.lowlevel.pos_hexagonal_arch.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);
}
