package com.revature.loop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class A {
	B b;

	@Autowired
	public A(B b) {
		this.b = b;
	}
}
