package br.com.lowlevel.pos_hexagonal_arch.adapters.out;

import br.com.lowlevel.pos_hexagonal_arch.adapters.out.repository.CustomerRepository;
import br.com.lowlevel.pos_hexagonal_arch.application.ports.out.DeleteCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteCustomerByIdAdapter implements DeleteCustomerByIdOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void delete(String id) {
        customerRepository.deleteById(id);
    }
}
