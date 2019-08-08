package com.revature.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Lazy
//@Scope
//@Primary
public class Product {
	
	/*
	 * Field autowiring - Not recommended, but it works.
	 * Uses reflection to make the field non-private and assign to it.
	 */
	@Autowired
	private Supplier supplier;

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((supplier == null) ? 0 : supplier.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (supplier == null) {
			if (other.supplier != null)
				return false;
		} else if (!supplier.equals(other.supplier))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Product [supplier=" + supplier + "]";
	}

	public Product(Supplier supplier) {
		super();
		this.supplier = supplier;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

}
