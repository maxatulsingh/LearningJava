package classAndObject;

public class Student {
	
	int rollNumber;
	String name,course;
	float m1,m2,m3;
	
	public float total()
	{
		return m1+m2+m3;
	}
	
	public float average()
	{
		return total()/3;
	}
	
	public char grade()
	{
		if (average()>=60) 
		{
			return 'A';
		}
		else return 'B';
		
	}
	
	public String details()
	{
		return "Roll Number="+rollNumber+"\n" +
				"Name ="+name+"\n" +
				"Average ="+average()+"\n"+
				"Grade="+grade()+"\n"+
				"Course="+course+"\n";
		
	}

}
