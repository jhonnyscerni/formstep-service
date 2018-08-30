package br.jus.tre_pa.mesav;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import br.jus.tre_pa.mesav.config.property.ApiProperty;

@SpringBootApplication
@EnableConfigurationProperties(ApiProperty.class)
public class MesavApplication {

	public static void main(String[] args) {
		SpringApplication.run(MesavApplication.class, args);
	}
}
