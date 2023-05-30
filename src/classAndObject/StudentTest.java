package classAndObject;

public class StudentTest {

	public static void main(String[] args) {
		
		Student s=new Student();
		s.rollNumber=1;
		s.name="Jessica";
		s.course="Class 12";
		s.m1=75; s.m2=80;s.m3=90;
		
		System.out.println("Total Marks= "+s.total());
		System.out.println("Average= "+s.average());
		System.out.println("Grade= "+s.grade());
		
		System.out.println(s.details());
	}

}
