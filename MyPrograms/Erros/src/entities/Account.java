package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account {
	
	private String name;
	private Date birthDate;
	private Integer login;
	private Integer password;
	
	List<Account> accounts = new ArrayList<>();
	
	public Account() {
		
	}

	public Account(String name, Date birthDate, Integer login, Integer password) {
		this.name = name;
		this.birthDate = birthDate;
		this.login = login;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Integer getLogin() {
		return login;
	}

	public void setLogin(Integer login) {
		this.login = login;
	}

	public Integer getPassword() {
		return password;
	}

	public void setPassword(Integer password) {
		this.password = password;
	}

	public List<Account> getAccount() {
		return accounts;
	}
	
	public void addAccount(Account account) {
		accounts.add(account);
	}
	public void addRemove(Account account) {
		accounts.remove(account);
	}
	public String toString(){
		return "Name:" + login + ", " + password + name;
	}
	
	

}
