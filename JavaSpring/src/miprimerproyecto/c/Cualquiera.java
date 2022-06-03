package miprimerproyecto.c;

import java.util.ArrayList;
import java.util.List;

public class Cualquiera {

	public static void main(String[] args) {
		List<String> persons = new ArrayList<String>();

		String[] employee = { "Alex", "Thomas", "Bob", "Yohan" };

		for (int i = 0; i < employee.length; i++) {
			persons.add(employee[i]);
		}

		System.out.println(persons);
	}
}
