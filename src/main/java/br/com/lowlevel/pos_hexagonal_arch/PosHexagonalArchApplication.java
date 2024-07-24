package br.com.lowlevel.pos_hexagonal_arch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class PosHexagonalArchApplication {

	public static void main(String[] args) {
		SpringApplication.run(PosHexagonalArchApplication.class, args);
	}

}
