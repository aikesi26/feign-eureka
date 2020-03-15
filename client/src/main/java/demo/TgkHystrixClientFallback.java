package demo;

import org.springframework.stereotype.Component;

import demo.HelloClientApplication.HelloClient;

@Component
public class TgkHystrixClientFallback implements HelloClient {

	@Override
	public String hello() {

		System.err.println(" 我们约会吧 。。。");
		return null;
	}

	
}
