package br.com.lowlevel.pos_hexagonal_arch.adapters.in.consumer.mapper;

import br.com.lowlevel.pos_hexagonal_arch.adapters.in.consumer.message.CustomerMessage;
import br.com.lowlevel.pos_hexagonal_arch.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMessageMapper {

    @Mapping(target = "address", ignore = true)
    Customer toCustomer(CustomerMessage customerMessage);

}
