package com.interfaceinjection;

import org.springframework.stereotype.Component;

@Component
public class Savings implements Account {
	@Override
	public void withdraw() {
		System.out.println("withdraw method in Savings");
	}

	@Override
	public void deposit() {
		System.out.println("deposit method in Savings");
	}
}
