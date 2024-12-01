package com.campusdual.classroom;

public class Person {
	protected String name;
	protected String surname;

	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public void getDetails() {
		System.out.println("Nombre completo: " + this.name + " " + this.surname);
	}//Nas clases hijas, sobrescribiremos este metodo, e añadiremos as diferentes propiedades que as compoñen.
	//(area para Teacher, squad para PoliceOfficer e specialization para Doctor) a maiores do name , surname.
}
