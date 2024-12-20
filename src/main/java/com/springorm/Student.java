package com.springorm;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Override
	public String toString() {
		return "Student [st_id=" + st_id + ", st_name=" + st_name + ", st_city=" + st_city + "]";
	}

	@Id
	private int st_id;
	
	private String st_name;
	
	private String st_city;

	public int getSt_id(int i) {
		return st_id;
	}

	public void setSt_id(int st_id) {
		this.st_id = st_id;
	}

	public String getSt_name() {
		return st_name;
	}

	public void setSt_name(String st_name) {
		this.st_name = st_name;
	}

	public String getSt_city() {
		return st_city;
	}

	public void setSt_city(String st_city) {
		this.st_city = st_city;
	}
	

}
