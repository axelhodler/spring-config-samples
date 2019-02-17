package co.hodler.config;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class PrintConfig implements ApplicationRunner {

	private final FirstConfig firstConfig;
	private final SecondConfig secondConfig;
	private final DefaultValueConfig defaultValueConfig;

	public PrintConfig(FirstConfig firstConfig, SecondConfig secondConfig, DefaultValueConfig defaultValueConfig) {
		this.firstConfig = firstConfig;
		this.secondConfig = secondConfig;
		this.defaultValueConfig = defaultValueConfig;
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println(this.firstConfig.getLabel());
		System.out.println(this.secondConfig.getComposite());
		System.out.println(this.defaultValueConfig.getEmptyAsDefault());
	}
}
