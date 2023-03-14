

public class BusinessContact extends Contact{
   public BusinessContact(String name, String email) {
      super(name, email);
      
   }

   //override display
   private int phone;

   public BusinessContact(String name, String email, int phone) {
      super(name, email);
      this.phone = phone;
   }

   public int getPhone() {
      return phone;
   }

   public void setPhone(int phone) {
      this.phone = phone;
   }

   @Override
   public String toString() {
      return "BusinessContact [Phone= " + phone + " Email= "+ super.getEmail() +" Name= "+ super.getName() +"]";
   }

   
   

   
}
