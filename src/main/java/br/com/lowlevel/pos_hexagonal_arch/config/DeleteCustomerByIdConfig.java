package br.com.lowlevel.pos_hexagonal_arch.config;

import br.com.lowlevel.pos_hexagonal_arch.adapters.out.DeleteCustomerByIdAdapter;
import br.com.lowlevel.pos_hexagonal_arch.application.core.usecase.DeleteCustomerByIdUseCase;
import br.com.lowlevel.pos_hexagonal_arch.application.ports.in.FindCustomerByIdInputPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    public DeleteCustomerByIdUseCase deleteCustomerByIdUseCase(
            FindCustomerByIdInputPort findCustomerByIdInputPort,
            DeleteCustomerByIdAdapter deleteCustomerByIdAdapter
    ) {
        return new DeleteCustomerByIdUseCase(findCustomerByIdInputPort, deleteCustomerByIdAdapter);
    }
}
