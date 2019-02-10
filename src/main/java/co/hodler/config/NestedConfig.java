package co.hodler.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

@ConfigurationProperties(prefix = "outer")
public class NestedConfig {

	private String text;

	@NestedConfigurationProperty
	private Inner inner;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Inner getInner() {
		return inner;
	}

	public void setInner(Inner inner) {
		this.inner = inner;
	}

	public static class Inner {
		private String innerText;

		public String getInnerText() {
			return innerText;
		}

		public void setInnerText(String innerText) {
			this.innerText = innerText;
		}
	}
}
