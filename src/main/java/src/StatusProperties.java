package src;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="cnt")
public class StatusProperties {
	
	private Integer counter = 0;

	public Integer getCounter() {
		return counter;
	}

	public void setCounter(Integer counter) {
		this.counter = counter;
	}

}