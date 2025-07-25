package student;

import hide.study;
import java.util.Scanner;

public class access {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter course: ");
        String course = scanner.nextLine();
        
        System.out.print("Enter attendance percentage: ");
        int attendance = scanner.nextInt();
        
        System.out.print("Enter marks: ");
        int marks = scanner.nextInt();
        
        study student = new study(name, course, attendance, marks);
        

        System.out.println(student.getName());
        System.err.println(student.getCourse());
        System.out.println(student.getAttendance());
        System.out.println(student.getMarks());
        System.out.println(student.getId());

        System.out.println("Student Details:");

        student.studentDetails();
        student.eligibility();

        System.out.println("what to change student details");
        String change = scanner.next();
        
        if(change.equalsIgnoreCase("yes")) {
            System.out.print("Enter new name: ");
            String newName = scanner.next();
            student.setName(newName);
            
            System.out.print("Enter new course: ");
            String newCourse = scanner.next();
            student.setCourse(newCourse);
            
            System.out.print("Enter new attendance percentage: ");
            int newAttendance = scanner.nextInt();
            student.setAttendance(newAttendance);
            
            System.out.print("Enter new marks: ");
            int newMarks = scanner.nextInt();
            student.setMarks(newMarks);
            
            student.studentDetails();
            student.eligibility();
        }
        
        scanner.close();
    }
}