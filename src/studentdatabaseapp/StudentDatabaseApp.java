package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

    public static void main(String[] args) {

        // Ask how many users we want to add
        System.out.print("Enter number of new students to enroll: ");
        Scanner userInput = new Scanner(System.in);
        int numOfStudents = userInput.nextInt();
        Student[] students = new Student[numOfStudents];

        // Create number of new students
        for (int i = 0; i < numOfStudents; i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
        }

        // Show the info for the second student created
        students[1].showInfo();
    }
}