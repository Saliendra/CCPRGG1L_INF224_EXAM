public class App {
    public static void main(String[] args) {
      
      //Student Class
      
      Student Ace = new Student ();
      
      Ace.surname = "Saliendra";
      Ace.firstName = "Ace";
      Ace.middleInitial = 'V';
      Ace.dateOfBirth = "09/25/2003";
      Ace.studentNumber = "2022105043";
      Ace.studentEmailAddress = "saliendraav@students.national-u.edu.ph";
      Ace.IAmAwesome = true;
      
      // print method
      
      Ace.sayMysurname ();
      Ace.sayMyfirstName ();
      Ace.sayMymiddleInitial ();
      Ace.sayMydateOfBirth ();
      Ace.sayMystudentNumber ();
      Ace.sayMystudentEmailAddress ();
      Ace.amIAwesome ();
        
    }
      
}
      
