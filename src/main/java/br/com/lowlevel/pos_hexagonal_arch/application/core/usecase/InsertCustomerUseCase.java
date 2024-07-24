package br.com.lowlevel.pos_hexagonal_arch.application.core.usecase;

import br.com.lowlevel.pos_hexagonal_arch.application.core.domain.Customer;
import br.com.lowlevel.pos_hexagonal_arch.application.ports.in.InsertCustomerInputPort;
import br.com.lowlevel.pos_hexagonal_arch.application.ports.out.FindAddressByZipCodeOutputPort;
import br.com.lowlevel.pos_hexagonal_arch.application.ports.out.InsertCustomerOutputPort;
import br.com.lowlevel.pos_hexagonal_arch.application.ports.out.SendCpfForValidationOutput;

public class InsertCustomerUseCase implements InsertCustomerInputPort {

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;
    private final InsertCustomerOutputPort insertCustomerOutputPort;

    private final SendCpfForValidationOutput sendCpfForValidationOutputPort;

    public InsertCustomerUseCase(FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort, InsertCustomerOutputPort insertCustomerOutputPort, SendCpfForValidationOutput sendCpfForValidationOutput) {
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
        this.sendCpfForValidationOutputPort = sendCpfForValidationOutput;
    }

    @Override
    public void insert(Customer customer, String zipCode) {
        var address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        insertCustomerOutputPort.insert(customer);
        sendCpfForValidationOutputPort.send(customer.getCpf());
    }
}
