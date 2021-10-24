package model.entities;

public class Person implements IPerson{
	
	private String name;
	private Double salaryMonth;
	private Double count;
	
	public Person() {
		
	}
	
	public Person(String name, Double salaryMonth, Double count) {
		this.name = name;
		this.salaryMonth = salaryMonth;
		this.count = count;
	}

	@Override
	public double salary(double salaryMonth, double count) {
		double salary = salaryMonth * count;
		return salary;
	}	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalaryMonth() {
		return salaryMonth;
	}

	public void setSalaryMonth(Double salaryMonth) {
		this.salaryMonth = salaryMonth;
	}

	public Double getCount() {
		return count;
	}

	public void setCount(Double count) {
		this.count = count;
	}

	public String toString() {
		return "O salário total de " + name + " no período é de: R$" + salary(salaryMonth, count);
	}

}
