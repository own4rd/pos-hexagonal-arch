package br.com.lowlevel.pos_hexagonal_arch.application.core.usecase;

import br.com.lowlevel.pos_hexagonal_arch.application.core.domain.Customer;
import br.com.lowlevel.pos_hexagonal_arch.application.core.exceptions.CustomerNotFoundException;
import br.com.lowlevel.pos_hexagonal_arch.application.ports.in.FindCustomerByIdInputPort;
import br.com.lowlevel.pos_hexagonal_arch.application.ports.out.FindCustomerByIdOutputPort;

public class FindCustomerByIdUseCase implements FindCustomerByIdInputPort {

    private final FindCustomerByIdOutputPort findCustomerByIdOutputPort;

    public FindCustomerByIdUseCase(FindCustomerByIdOutputPort findCustomerByIdOutputPort) {
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
    }

    @Override
    public Customer find(String id) {
        return findCustomerByIdOutputPort.find(id).orElseThrow(() -> new CustomerNotFoundException("Customer Not Found"));
    }
}
