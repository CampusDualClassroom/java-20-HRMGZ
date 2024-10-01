package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;

public class Exercise20 {

    public static List<Person> getPeopleList() {
        Person p1 = new Person("John", "Smith");
        Teacher t1 = new Teacher("María"," Montessori","Educacion");
        PoliceOfficer po1 = new PoliceOfficer("Jake","Peralta","B-99");
        Doctor d1 = new Doctor("Gregory","House","Nefrología e infectología");
        List<Person> lista = new ArrayList<>();
        lista.add(p1);
        lista.add(t1);
        lista.add(po1);
        lista.add(d1);
        return lista;
    }

    public static void showPeopleDetails(List<Person> stringList) {
        for (Person person : stringList){
            person.getDetails();
        }
    }

    public static void main(String[] args) {
        List<Person> stringList = getPeopleList();
        showPeopleDetails(stringList);
    }



}
