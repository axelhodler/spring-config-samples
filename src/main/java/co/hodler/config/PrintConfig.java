package co.hodler.config;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class PrintConfig implements ApplicationRunner {

	private final FirstConfig firstConfig;
	private final SecondConfig secondConfig;

	public PrintConfig(FirstConfig firstConfig, SecondConfig secondConfig) {
		this.firstConfig = firstConfig;
		this.secondConfig = secondConfig;
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println(this.firstConfig.getLabel());
		System.out.println(this.secondConfig.getComposite());
	}
}
