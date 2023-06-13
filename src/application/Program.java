package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.Person;

public class Program {

	public static void main(String[] args) throws ParseException {
	
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Person> list = new ArrayList<>();
		
		Date b1 = sdf.parse("11/05/1984");
		Person p1 = new Person("Ana", b1);
		Date b2 = sdf.parse("12/06/1984");
		Person p2 = new Person("José", b2);
		Date b3 = sdf.parse("13/07/1984");
		Person p3 = new Person("Maria", b3);
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		for (Person obj : list) {
			System.out.println(obj + "\n");
		}
	}
}
