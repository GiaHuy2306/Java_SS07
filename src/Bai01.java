class Students {
    private int id;
    private String fullname;

    private static int totalStudents = 0;

    public Students(int id, String fullname) {
        this.id = id;
        this.fullname = fullname;

        totalStudents++;
    }

    public void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + fullname);
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }
}

public class Bai01 {
    public static void main(String[] args) {
        Students s1 = new Students(1, "Huy");
        Students s2 = new Students(2, "Tuấn");
        Students s3 = new Students(3, "Huy");

        s1.display();
        s2.display();
        s3.display();

        Students.displayTotalStudents();
    }
}
