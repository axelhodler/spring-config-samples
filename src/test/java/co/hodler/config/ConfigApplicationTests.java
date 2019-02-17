package co.hodler.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConfigApplicationTests {

	@Autowired
	FirstConfig firstConfig;
	@Autowired
	SecondConfig secondConfig;
	@Autowired
	NestedConfig nestedConfig;
	@Autowired
	DefaultValueConfig defaultValueConfig;

	@Test
	public void properties_are_present() {
		assertThat(firstConfig.getLabel()).isEqualTo("production");
		assertThat(secondConfig.getComposite()).isEqualTo("compositeValue");
		assertThat(nestedConfig.getText()).isEqualTo("outer");
		assertThat(nestedConfig.getInner().getInnerText()).isEqualTo("inner");
		assertThat(defaultValueConfig.getEmptyAsDefault()).isEmpty();
	}

}

