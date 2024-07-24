package br.com.lowlevel.pos_hexagonal_arch.adapters.out.repository.mapper;

import br.com.lowlevel.pos_hexagonal_arch.adapters.out.repository.entity.CustomerEntity;
import br.com.lowlevel.pos_hexagonal_arch.application.core.domain.Customer;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);

}