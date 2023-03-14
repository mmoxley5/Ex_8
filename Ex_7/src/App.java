

/* Write a program that includes a class representing contact information 
for a person including their name and email address. 
This class should include a method for displaying the contact's name and email address. 

The program should also include a class for business contacts that extends the contact class 
and stores the contact's phone number. 
The business contact class should override 
the base class's method that displays the name and email address so that it displays 
the phone number in addition to the name and email address. Create instances of both 
classes to demonstrate functionality. */

public class App {
    public static void main(String[] args) throws Exception {
        Contact con1 =new Contact("Mya", "mmoxley5@yahoo.com");
       // System.out.println(con1);
        
        BusinessContact bus1 =new BusinessContact("mia", "mia@gmail.com", 1235675436);
        //System.out.println(bus1);

        Contactcollections col = new Contactcollections();
        col.add(con1);
        col.add(bus1);
        col.display();
       







    }
}
