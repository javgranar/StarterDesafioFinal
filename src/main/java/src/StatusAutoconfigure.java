package src;

import java.util.Optional;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(Status.class)
@EnableConfigurationProperties(StatusProperties.class)
public class StatusAutoconfigure {
	
	private final StatusProperties properties;
	
	StatusService statusService = new StatusService();
	
	StatusBuilder statusBuilder = new StatusBuilder();
	
	public StatusAutoconfigure(StatusProperties properties) {
		this.properties= properties;
	}
	
	@Bean
	public Optional<Status> saludo() {
		System.out.println("Properties " + properties.getCounter());
		statusBuilder.withStatus("Inicial");
		Integer id = statusService.save(statusBuilder.build());
		return statusService.get(id);
	}

}
