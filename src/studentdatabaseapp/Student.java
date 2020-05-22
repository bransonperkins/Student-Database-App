package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    // Constructor - prompt user to enter student's name and year
    public Student() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = userInput.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = userInput.nextLine();

        System.out.print("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = userInput.nextInt();

        setStudentID();
        //System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
    }

    // Generate an ID
    private void setStudentID() {
        // Grade level + ID
        id++;
        this.studentID = gradeYear + "" + id;
    }

    // Enroll in courses
    public void enroll() {
        // Get inside a loop, user hits 0

        do {
            System.out.println("Enter course to enroll (Q to quit): ");
            Scanner userInput = new Scanner(System.in);
            String course = userInput.next();

            if (!course.equals("Q")) {
                courses = courses + "\n  " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;
            }
        } while (true);
        // System.out.println("Enrolled in: " + courses);
    }

    // View balance
    public void viewBalance() {
        System.out.println("Your balance is : $" + tuitionBalance);
    }

    // Pay tuition
    public void payTuition() {
        viewBalance();
        System.out.print("Enter your payment amount: $");
        Scanner userInput = new Scanner(System.in);
        int payment = userInput.nextInt();

        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    // Show account status - using void method instead of overriding toString
    public void showInfo() {
        System.out.println("Name: " + firstName + " " + lastName +
                "\nGrade Level: " + gradeYear +
                "\nStudent ID" + studentID +
                "\nCourses enrolled: " + courses +
                "\nYour remaining balance is $" + tuitionBalance);
    }
}