//10/12 Who are you? See comments. Nice work overall!
// ****************************************************************
//   Grades.java
//
//   Use Student class to get test grades for two students
//   and compute averages
//          
// ****************************************************************
public class Grades
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Mary");
        Student student2 = new Student("Mike");

        student1.inputGrades();
        System.out.println("The average for "
            + student1.getName() + " is "
            + student1.getAverage() + ".");
            
        System.out.println();

        student2.inputGrades();
        System.out.println("The average for "
            + student2.getName() + " is "
            + student2.getAverage() + ".");
            
        System.out.println();
        System.out.println(student1);
        System.out.println(student2);
    }
}