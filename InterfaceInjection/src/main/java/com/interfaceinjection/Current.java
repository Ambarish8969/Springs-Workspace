package com.interfaceinjection;

import org.springframework.stereotype.Component;

@Component
public class Current implements Account {
	@Override
	public void withdraw() {
		System.out.println("withdraw method in Current");
	}

	@Override
	public void deposit() {
		System.out.println("deposit method in Current");
	}
}
