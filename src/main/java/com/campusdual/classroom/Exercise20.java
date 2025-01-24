package com.campusdual.classroom;


import java.util.ArrayList;
import java.util.List;

public class Exercise20 {

    public static List<Person> getPeopleList() {

        //Crear una colección de tipo List e inicializarla como ArrayList en el metodo getPeopleList()
        List<Person> personList = new ArrayList<>(4);//inicializamos o ArrayList ca capacidade 4 para que entren os elementos que vamos crear,

        //Luego poblar la lista con diferentes elementos de tipo Person y sus clases hijas
        personList.add(new Person("John", "Smith"));
        personList.add(new Teacher("María", "Montessori", "Educación"));
        personList.add(new PoliceOfficer("Jake", "Peralta", "B-99"));
        personList.add(new Doctor("Gregory", "House", "Nefrología e infectología"));

        return personList;//y devolver la lista creada.


    }

    public static void showPeopleDetails(List<Person> personList) {
        //Usar el metodo showPeopleDetails() para recorrer cada elemento de la lista y acceder al metodo que muestra por pantalla los detalles de cada uno --> getDetails().
        for (Person person : personList) {
            person.getDetails();//Utilizamos o polimorfismo, ainda que person sea de tipo Person, pode ser calquer objeto dunha clase hija de Person.
        }


    }

    public static void main(String[] args) {
        //List<Person> personList = getPeopleList();//chama a getPeopleList para obter a personList
        //showPeopleDetails(personList);//chama a showPeopleDetails para que mostre os detalles das persoas na personList.

        //Refactorizado
        showPeopleDetails(getPeopleList());
    }


}
