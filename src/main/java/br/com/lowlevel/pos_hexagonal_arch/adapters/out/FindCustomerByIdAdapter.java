package br.com.lowlevel.pos_hexagonal_arch.adapters.out;

import br.com.lowlevel.pos_hexagonal_arch.adapters.out.repository.CustomerRepository;
import br.com.lowlevel.pos_hexagonal_arch.adapters.out.repository.mapper.CustomerEntityMapper;
import br.com.lowlevel.pos_hexagonal_arch.application.core.domain.Customer;
import br.com.lowlevel.pos_hexagonal_arch.application.ports.out.FindCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindCustomerByIdAdapter implements FindCustomerByIdOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public Optional<Customer> find(String id) {
        var customerEntity = customerRepository.findById(id);
        return customerEntity.map(entity -> customerEntityMapper.toCustomer(entity));
    }
}
