package co.hodler.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties
public class DefaultValueConfig {
	@Value("${default.value:}")
	private String emptyAsDefault;

	public String getEmptyAsDefault() {
		return emptyAsDefault;
	}

	public void setEmptyAsDefault(String emptyAsDefault) {
		this.emptyAsDefault = emptyAsDefault;
	}
}
