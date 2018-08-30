package br.jus.tre_pa.mesav.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import lombok.Getter;
import lombok.Setter;

/**
 * Classe com as propriedades do mesav.
 *
 */
@Component
@ConfigurationProperties(prefix = "mesav")
@Getter
@Setter
public class MesavConfig {

  private String buildTimestamp;

	private String projectVersion;

}
