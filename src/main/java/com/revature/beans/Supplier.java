package com.revature.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Supplier {
	private Trucks trucks;

	public Trucks getTrucks() {
		return trucks;
	}

	@Autowired
	/*
	 * Setter Injection (autowiring)
	 * Autowires the dependency Trucks using the setter.
	 * This requirse less reflection as the method is already public.
	 * It's also easier to manage when doing other activities with the 
	 * codebase, such as testing.
	 * 
	 * This is an okay way of autowiring.
	 */
	public void setTrucks(Trucks trucks) {
		this.trucks = trucks;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((trucks == null) ? 0 : trucks.hashCode());
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
		Supplier other = (Supplier) obj;
		if (trucks == null) {
			if (other.trucks != null)
				return false;
		} else if (!trucks.equals(other.trucks))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Supplier [trucks=" + trucks + "]";
	}

	public Supplier(Trucks trucks) {
		super();
		this.trucks = trucks;
	}

	public Supplier() {
		super();
		// TODO Auto-generated constructor stub
	}

}
