package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Data {
	
	private Integer id;
	private String name;
	private Double salary;
	
	List<Data> data = new ArrayList<>();
	
	public Data() {
		
	}

	public Data(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return id + ", " + name + ", " + salary;
	}
	
	
}
