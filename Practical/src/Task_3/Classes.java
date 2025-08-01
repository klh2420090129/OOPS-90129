package Task_3;

class Student {
    String name;
     long rollNumber;
    String department;
    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Department: " + department);
    }
}
public class Classes {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Deepak";
        s1.rollNumber =242090153;
        s1.department = "CSIT";
        s1.showDetails();
    }

}
