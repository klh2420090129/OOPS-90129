package Task_3;
class Studentinfo {
    String name;
    long rollNumber;
    String department;
    Studentinfo(String name,long rollNumber,String department) {
        this.name=name;
        this.rollNumber=rollNumber;
        this.department=department;
    }
    void showDetails() {
        System.out.println("Name: " +this.name);
        System.out.println("Roll Number: "+this.rollNumber);
        System.out.println("Department: "+this.department);
    }
}
public class Keywords {
	public class Main {
	    public static void main(String[] args) {
	        Studentinfo s1 = new Studentinfo("Deepak", 2420090153L, "CSIT");
	        Studentinfo s2 = new Studentinfo("Shiva Ganesh", 2420030035L, "CSE");

	        s1.showDetails();
	        s2.showDetails();
	    }
	}
}
