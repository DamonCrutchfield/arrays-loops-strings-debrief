package com.example.MSGrades;
// import the java util ArrayList class module
import java.util.*;

public class MSGrades {

    final private String[] teachers = {"Ms. Smith", "Mr. Johnson", "Mrs. Doe"};
    
    // Create 4 ArrayLists below all private constant properties (final)

        // 1. a new instance of a students ArrayList storing strings
        final private ArrayList<String> students= new ArrayList<String>();
        // 2. a new instance of a math grades ArrayList storing integers
        final private ArrayList<Integer> mathGrades= new ArrayList<Integer>();
        // 3. a new instance of a science grades ArrayList storing integers
        final private ArrayList<Integer> scienceGrades= new ArrayList<Integer>();
        // 4. a new instance of a math grades ArrayList storing integers
        final private ArrayList<Integer> englishGrades = new ArrayList<Integer>();


    public MSGrades(){
        // Add some students and their grades to the ArrayLists

            // add two students to the students ArrayList
            students.add("Damon");
            students.add("Elizabeth");
            // add two corresponding values for the two students to the math grades ArrayList
            mathGrades.add(100);
            mathGrades.add(100);
            // add two corresponding values for the two students to the science grades ArrayList
            scienceGrades.add(100);
            scienceGrades.add(100);
            // add two corresponding values for the two students to the english grades ArrayList
            englishGrades.add(100);
            englishGrades.add(100);

    }

    public void printStudents(){
        // loop thru the students ArrayList with a For Each loop
            // print each students name on a new line as output
        for (String student: students) {
            System.out.println(student);
        }
    }

    // Make a method that prints an individual students grades
    // It will be public, not have a return value,
    // and have one int type parameter that is a students index
    public void printStudentGrades(int studentIndex) {

        System.out.println(students.get(studentIndex));
        System.out.println("Math: " + mathGrades.get(studentIndex));
        System.out.println("Science: " + scienceGrades.get(studentIndex));
        System.out.println("English: " + englishGrades.get(studentIndex));
    }


    public static void main(String[] args) {

        // create a new instance of MSGrades class and store in a variable
        MSGrades msgrades = new MSGrades();
        // look up how to print an empty new line
        System.out.println();
        System.out.println("Middle School Roster");
        System.out.println("====================");

        // invoke or run the printStudents method on our class instance
        msgrades.printStudents();
        // Print another empty line if desired for readability
        System.out.println();
        // Use a for loop to loop thru the given teachers array on the class instance
        for (int teacher = 0; teacher < msgrades.teachers.length; teacher++) {
            System.out.println("Teacher: " + msgrades.teachers[teacher]);
        }


        System.out.println("\nStudent Grades:\n");

        // Use a for loop to loop thru students ArrayList on the class instance
        for (int student = 0; student < msgrades.students.size(); student++) {

            msgrades.printStudentGrades(student);

        }


    }
}
