package br.com.lowlevel.pos_hexagonal_arch.config;

import br.com.lowlevel.pos_hexagonal_arch.adapters.out.FindAddressByZipCodeAdapter;
import br.com.lowlevel.pos_hexagonal_arch.adapters.out.InsertCustomerAdapter;
import br.com.lowlevel.pos_hexagonal_arch.adapters.out.SendCpfValidationAdapter;
import br.com.lowlevel.pos_hexagonal_arch.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter,
            SendCpfValidationAdapter sendCpfValidationAdapter
    ) {
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter, sendCpfValidationAdapter);
    }
}
