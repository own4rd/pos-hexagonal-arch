package br.com.lowlevel.pos_hexagonal_arch.adapters.in.controller;

import br.com.lowlevel.pos_hexagonal_arch.adapters.in.controller.mapper.CustomerMapper;
import br.com.lowlevel.pos_hexagonal_arch.adapters.in.controller.request.CustomerRequest;
import br.com.lowlevel.pos_hexagonal_arch.adapters.in.controller.response.CustomerResponse;
import br.com.lowlevel.pos_hexagonal_arch.application.core.domain.Customer;
import br.com.lowlevel.pos_hexagonal_arch.application.ports.in.DeleteCustomerByIdInputPort;
import br.com.lowlevel.pos_hexagonal_arch.application.ports.in.FindCustomerByIdInputPort;
import br.com.lowlevel.pos_hexagonal_arch.application.ports.in.InsertCustomerInputPort;
import br.com.lowlevel.pos_hexagonal_arch.application.ports.in.UpdateCustomerInputPort;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    private InsertCustomerInputPort insertCustomerInputPort;

    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private FindCustomerByIdInputPort findCustomerByIdInputPort;

    @Autowired
    private UpdateCustomerInputPort updateCustomerInputPort;

    @Autowired
    private DeleteCustomerByIdInputPort deleteCustomerByIdInputPort;


    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest customerRequest) {
        var customer = customerMapper.toCustomer(customerRequest);
        insertCustomerInputPort.insert(customer, customerRequest.getZipCode());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> findById(@PathVariable final String id) {
        var customer = findCustomerByIdInputPort.find(id);
        var customerResponse = customerMapper.toCustomerResponse(customer);
        return ResponseEntity.ok().body(customerResponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable final String id, @Valid @RequestBody CustomerRequest customerRequest) {
        Customer customer = customerMapper.toCustomer(customerRequest);
        customer.setId(id);
        updateCustomerInputPort.update(customer, customerRequest.getZipCode());
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        deleteCustomerByIdInputPort.delete(id);
        return ResponseEntity.noContent().build();
    }
}
