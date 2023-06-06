package assignment1;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Manohar Reddy");
        String name = student.getName();
        System.out.println("Name: " + name);
        student.setName("Manohar Yatelli");
        name = student.getName();
        System.out.println("Name: " + name);
    }
}
