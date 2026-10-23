
public class Main {
    public static void main(String[] args) {
        f1 s1 = new f1(101, "Ankita", "Java");

        System.out.println("Student Management System");
        System.out.println("Student Details:"+s1.id+s1.name+s1.course);
        s1.display();
    }
}
