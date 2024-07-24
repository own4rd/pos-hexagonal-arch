package br.com.lowlevel.pos_hexagonal_arch.application.ports.in;

import br.com.lowlevel.pos_hexagonal_arch.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    Customer find(String id);

}
