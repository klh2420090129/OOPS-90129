package Task_3;
class Details {
    String name;
    long rollNumber;
    String department;
    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Department: " + department);
    }
}
public class Objects {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="Deepak";
        s1.rollNumber=2420090153L;
        s1.department="CSIT";
        s1.showDetails();
        
        Student s2=new Student();
        s2.name="Shiva Ganesh";
        s2.rollNumber=2420030035L;
        s2.department="CSE";
        s2.showDetails();
    }
}
