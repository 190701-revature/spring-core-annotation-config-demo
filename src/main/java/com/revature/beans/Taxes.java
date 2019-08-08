package com.revature.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Taxes {
	private Store store;

	public Store getStore() {
		return store;
	}

	@Autowired
	public void setStore(Store store) {
		this.store = store;
	}

	public Taxes(Store store) {
		super();
		this.store = store;
	}

}
