package br.com.lowlevel.pos_hexagonal_arch.adapters.in.consumer;

import br.com.lowlevel.pos_hexagonal_arch.adapters.in.consumer.mapper.CustomerMessageMapper;
import br.com.lowlevel.pos_hexagonal_arch.adapters.in.consumer.message.CustomerMessage;
import br.com.lowlevel.pos_hexagonal_arch.application.ports.in.UpdateCustomerInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveValidatedCpfConsumer {

    @Autowired
    private CustomerMessageMapper customerMessageMapper;

    @Autowired
    private UpdateCustomerInputPort updateCustomerInputPort;

    @KafkaListener(topics = "tp-cpf-validated", groupId = "khexagonal")
    public void receive(CustomerMessage customerMessage) {
        var customer = customerMessageMapper.toCustomer(customerMessage);
        updateCustomerInputPort.update(customer, customerMessage.getZipCode());
    }
}
