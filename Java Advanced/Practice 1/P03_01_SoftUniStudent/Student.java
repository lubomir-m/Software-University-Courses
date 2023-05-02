package JavaAdvanced.z_Practice.DefiningClassesExercise.P03_01_SoftUniStudent;

public class Student {
    private String firstName;
    private String lastName;
    private String bestCourse;

   public Student(String firstName, String lastName, String bestCourse) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.bestCourse = bestCourse;
   }

   public String getFirstName() {
       return this.firstName;
   }

   public void setFirstName(String firstName) {
       this.firstName = firstName;
   }

   public String getLastName() {
       return this.lastName;
   }

   public void setLastName(String lastName) {
       this.lastName = lastName;
   }

   public String getBestCourse() {
       return this.bestCourse;
   }

   public void setBestCourse(String bestCourse) {
       this.bestCourse = bestCourse;
   }

   @Override
   public String toString() {
       return String.format("Student: %s %s, Best Course = %s", this.firstName, this.lastName, this.bestCourse);
   }
}
