package software.ulpgc.katas;

import java.time.LocalDate;

public class Main {
    static void main(String[] args) {
        Person person = new Person(
                "Carlos",
                LocalDate.of(2005, 4, 15)
        );

        System.out.println("Nombre: " + person.name());
        System.out.println("Nacimiento: " + person.birthday());
        System.out.println("Edad: " + person.getAge());
    }
}