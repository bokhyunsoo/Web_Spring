package net.home.di;

public class HelloWorldMessageProvider implements MessageProvider {

	@Override
	public String getMessage() {
		return "hello world!";
	}

}
