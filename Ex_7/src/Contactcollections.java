import java.util.ArrayList;

public class Contactcollections{
   private ArrayList<Contact> myList = new ArrayList<Contact>();

   public Contactcollections() {
      
      
   }
   public void display(){
      for(Contact person: myList ){
         System.out.println(person);
      }
   }
   public void add(Contact a){
      myList.add(a);
   }
   



}