
public class Student {
     int rollno;
     String name;
     void insertRecord(int r, String n)
     {
    	 rollno=r;
    	 name=n;
     }
     void displayInfo()
     {
       System.out.println(rollno +""+ name);
     }
}
class Teststudent
{    public static void main(String[] args) {
		 
		Student s1=new Student();
		Student s2=new Student();
		
		s1.insertRecord(113, "push");
		s2.insertRecord(114, "pallu");
		
	    s1.displayInfo();
	    s2.displayInfo();
}}


