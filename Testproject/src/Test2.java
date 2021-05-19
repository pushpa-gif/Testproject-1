public class Test2 {
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
class Test
{    public static void main(String[] args) {
		 
	Test2 s1=new Test2();
	Test2 s2=new Test2();
		
		s1.insertRecord(113, "push");
		s2.insertRecord(114, "pallu");
		
	    s1.displayInfo();
	    s2.displayInfo();
}}


