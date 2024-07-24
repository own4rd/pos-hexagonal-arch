package br.com.lowlevel.pos_hexagonal_arch.config;

import br.com.lowlevel.pos_hexagonal_arch.adapters.out.FindCustomerByIdAdapter;
import br.com.lowlevel.pos_hexagonal_arch.application.core.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustomerByIdUseCase findCustomerByIdUseCase(FindCustomerByIdAdapter findCustomerByIdAdapter) {
        return new FindCustomerByIdUseCase(findCustomerByIdAdapter);
    }
}
