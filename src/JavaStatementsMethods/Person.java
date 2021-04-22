package JavaStatementsMethods;
/*
14. Person
Write a class with the name Person. The class needs three fields (instance variables) with the names
firstName, lastName of type String and age of type int.
Write the following methods (instance methods):
*Method named getFirstName without any parameters, it needs to return the value of the firstName
field.
*Method named getLastName without any parameters, it needs to return the value of the lastName
field.
*Method named getAge without any parameters, it needs to return the value of the age field.
*Method named setFirstName with one parameter of type String, it needs to set the value of the
firstName field.
*Method named setLastName with one parameter of type String, it needs to set the value of the
lastName field.
*Method named setAge with one parameter of type int, it needs to set the value of the age field. If
the parameter is less than 0 or greater than 100, it needs to set the age field value to 0.
*Method named isTeen without any parameters, it needs to return true if the value of the age field is
greater than 12 and less than 20, otherwise, return false.
*Method named getFullName without any parameters, it needs to return the full name of the person.
 *In case both firstName and lastName fields are empty, Strings return an empty String.
 *In case firstName is an empty String, return firstName.
 *In case lastName is an empty String, return lastName. To check if s String is empty, use the method isEmpty from the String class. For example,
firstName.isEmpty() returns true if the String is empty or in other words, when the String does not
contain any characters.
TEST EXAMPLE
TEST CODE: (Write below code in to main method then check out put)
Person person = new Person();
person.setFirstName(""); // firstName is set to empty string
person.setLastName(""); // lastName is set to empty string
person.setAge(10);
System.out.println("fullName= " + person.getFullName());
System.out.println("teen= " + person.isTeen());
person.setFirstName("John"); // firstName is set to John
person.setAge(18);
System.out.println("fullName= " + person.getFullName());
System.out.println("teen= " + person.isTeen());
person.setLastName("Smith"); // lastName is set to Smith
System.out.println("fullName= " + person.getFullName());
OUTPUT
fullName=
teen= false
fullName= John
teen= true
fullName= John Smith
NOTE: All methods should be defined as public NOT public static.
NOTE: In total, you have to write 8 methods
 */
import java.util.Scanner;
public class Person {
    String FirstName;
    String LastName;
    int age;
    //Write the following methods (instance methods):
//*Method named getFirstName without any parameters, it needs to return the value of the firstName
//field.

    public String getFirstName() {
        this.FirstName = FirstName;

        System.out.print("FirstName:");
        System.out.println(" ");
        return FirstName;


    }

    //    *Method named getLastName without any parameters, it needs to return the value of the lastName
//field.
    public String getLastName() {
        this.LastName = LastName;
        System.out.print("LastName:");
        System.out.println(" ");
        return LastName;
    }

    // *Method named getAge without any parameters, it needs to return the value of the age field.
    public int getAge() {
        int age=18;
        this.age = age;
        return age;

    }

    //*Method named setFirstName with one parameter of type String, it needs to set the value of the
//firstName field.
    public String setFirstName() {
        String firstName = this.FirstName;
        System.out.println("john");
        return FirstName;
    }

    //*Method named setLastName with one parameter of type String, it needs to set the value of the
//lastName field.
    public String setLastName() {
        String firstName = this.LastName;
        System.out.println("smith");
        return LastName;

    }

    //*Method named setAge with one parameter of type int, it needs to set the value of the age field. If
//the parameter is less than 0 or greater than 100, it needs to set the age field value to 0.
    public int setAge() {
        int age=18;
        if (age < 0) {
            ;
        } else if (age > 100) {
        } else {
            age = 0;
        }
        this.age = age;
        return age;
    }

    //*Method named isTeen without any parameters, it needs to return true if the value of the age field is
    //greater than 12 and less than 20, otherwise, return false.
    public boolean isTeen() {
        if (age > 12) {
            System.out.println("false");

        } else if (age > 20) {
            System.out.println("true");

        }
        return false;
    }
        public String getFullName()
        {
            System.out.println("john smith");
return FirstName+LastName;
         //   return FirstName +""+ LastName;
        }
}
    //*Method named getFullName without any parameters, it needs to return the full name of the person.
    // *In case both firstName and lastName fields are empty, Strings return an empty String.
    // *In case firstName is an empty String, return firstName.
    // *In case lastName is an empty String, return lastName. To check if s String is empty, use the method isEmpty from the String class.
    // For example,
    //firstName.isEmpty() returns true if the String is empty or in other words, when the String does notcontain any characters.
