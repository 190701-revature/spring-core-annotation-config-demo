package com.revature.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Roads {
	public Roads() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public Roads(Taxes taxes) {
		super();
		this.taxes = taxes;
	}

	private Taxes taxes;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((taxes == null) ? 0 : taxes.hashCode());
		return result;
	}
	
	

	public Taxes getTaxes() {
		return taxes;
	}

	public void setTaxes(Taxes taxes) {
		this.taxes = taxes;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Roads other = (Roads) obj;
		if (taxes == null) {
			if (other.taxes != null)
				return false;
		} else if (!taxes.equals(other.taxes))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Roads [taxes=" + taxes + "]";
	}
	
	
}
