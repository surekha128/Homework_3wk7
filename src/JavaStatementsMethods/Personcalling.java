package JavaStatementsMethods;

import java.util.Scanner;

public class Personcalling
{
    public static void main(String[] args) {

        Person p = new Person();
        p.getFirstName();
        p.getLastName();
        p.getAge();
        p.setFirstName();
        p.setLastName();
        p.setAge();
        System.out.println("fullName= " + p.getFullName());

    }
}
