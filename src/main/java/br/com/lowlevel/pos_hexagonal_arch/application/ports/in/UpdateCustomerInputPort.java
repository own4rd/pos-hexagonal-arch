package br.com.lowlevel.pos_hexagonal_arch.application.ports.in;

import br.com.lowlevel.pos_hexagonal_arch.application.core.domain.Customer;

public interface UpdateCustomerInputPort {
    void update(Customer customer, String zipCode);
}
