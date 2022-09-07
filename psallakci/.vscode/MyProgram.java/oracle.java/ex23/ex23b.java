public class ex23b {
   public static void main(String[] args) {
   }

   public String name = "Pelin";
   public String surname = "Sallakci";
   public int classNumber = 12;
   public String classTeacher = " Jane Hopper";
   public String course;
   public String mail;
   public boolean homework;

   public void homeworkCompleted() {
      System.out.println("Homework is submitted: " + homework);
   }

   public void displayTeacher() {
      System.out.println("Your teacher is " + classTeacher);
   }

   public void setCourse() {
      System.out.println("Your current course is: " + course);
   }

}
