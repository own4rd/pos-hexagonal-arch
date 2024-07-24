package br.com.lowlevel.pos_hexagonal_arch.config;

import br.com.lowlevel.pos_hexagonal_arch.adapters.out.FindAddressByZipCodeAdapter;
import br.com.lowlevel.pos_hexagonal_arch.adapters.out.FindCustomerByIdAdapter;
import br.com.lowlevel.pos_hexagonal_arch.adapters.out.UpdateCustomerAdapter;
import br.com.lowlevel.pos_hexagonal_arch.application.core.usecase.FindCustomerByIdUseCase;
import br.com.lowlevel.pos_hexagonal_arch.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            UpdateCustomerAdapter updateCustomerAdapter
    ) {
        return new UpdateCustomerUseCase(findCustomerByIdUseCase, findAddressByZipCodeAdapter, updateCustomerAdapter);
    }
}
