package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {

	// Esse formato será compartilhado com todos os objetos.
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String name;
	private Date birth; 
	
	public Person() {
	}

	public Person(String name, Date birth) {
		this.name = name;
		this.birth = birth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}	
	
	public String toString() {
		return "Nome:\n"
				+ name
				+ "\nData de nascimento:\n"
				+ sdf.format(birth);				
	}
}
