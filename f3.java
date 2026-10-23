class f3
{
    public static void main(String args[])
    {
        f1 s1 = new f1(101, "John", "Java");
        f1 s2 = new f1(102, "Alice", "Python");
        f1 s3 = new f1(103, "Bob", "C++");
        f1 s4 = new f1(104, "Eve", "JavaScript");

        System.out.println("Student 1: ID=" + s1.id + ", Name=" + s1.name + ", Course=" + s1.course);
        System.out.println("Student 2: ID=" + s2.id + ", Name=" + s2.name + ", Course=" + s2.course);
        System.out.println("Student 3: ID=" + s3.id + ", Name=" + s3.name + ", Course=" + s3.course);
        System.out.println("Student 4: ID=" + s4.id + ", Name=" + s4.name + ", Course=" + s4.course);
    }
}