package com.revature.loop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class B {
	A a;

	@Autowired
	public B(A a) {
		super();
		this.a = a;
	}
}
