package hide;
public class study {
    private String name;
    private String course;
    private int attendance;
    private int marks;
    private int id;

    public study(String name, String course, int attendance, int marks) {
        this.name = name;
        this.course = course;
        this.attendance = attendance;
        this.marks = marks;
        this.id = (int) (Math.random() * 10000); 
    }
    public String getName() {
        return name;
    }
    public String getCourse() {
        return course;
    }
    public int getAttendance() {
        return attendance;
    }
    public int getMarks() {
        return marks;
    }
    public int getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
    public void studentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Attendance: " + attendance + "%");
        System.out.println("Marks: " + marks);
        System.out.println("ID: " + id);
    }
    public void eligibility() {
        if (attendance >= 70 && marks >= 40) {
            System.out.println(name + " is eligible for the exam.");
        } else {
            System.out.println(name + " is not eligible for the exam.");
        }
    }


    
}