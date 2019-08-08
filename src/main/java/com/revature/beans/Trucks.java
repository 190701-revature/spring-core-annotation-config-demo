package com.revature.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Trucks {
	private Roads roads;

	/**
	 * Constructor Injection (Autowiring)
	 * Autowires dependencies using the constructor. This requires somewhat
	 * less reflection, due to it not requring the change in access modifier.
	 * 
	 * This is an okay form of injection.
	 */
	@Autowired
	public Trucks(Roads roads) {
		super();
		this.roads = roads;
	}
	
	public Roads getRoads() {
		return roads;
	}

	public void setRoads(Roads roads) {
		this.roads = roads;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((roads == null) ? 0 : roads.hashCode());
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
		Trucks other = (Trucks) obj;
		if (roads == null) {
			if (other.roads != null)
				return false;
		} else if (!roads.equals(other.roads))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Trucks [roads=" + roads + "]";
	}

	

	public Trucks() {
		super();
		// TODO Auto-generated constructor stub
	}

}
