package constructurs;

public class Subject {
	
	private int subID,maxMarks,marksObtained;
	private String subName;
	
	public int getSubID()
	{
		return subID;
	}
	
	public int getMaxMarks()
	{
		return maxMarks;
	}
	
	public int getMarksObtained()
	{
		return marksObtained;
	}
	
	public String getSubjectName()
	{
		return subName;
	}
	public void setMarksObtained(int marksObtained)
	{
		this.marksObtained=marksObtained;
	}
	Subject(int subID, String subName)
	{
		this.subID=subID;
		this.subName=subName;
	}
	
	Subject(int subID, String subName, int maxMarks, int marksObtained)
	{
		this.subID=subID;
		this.subName=subName;
		this.maxMarks=maxMarks;
		this.marksObtained=marksObtained;
	}
	
	Subject(int subID, String subName, int maxMarks)
	{
		this.subID=subID;
		this.subName=subName;
		this.maxMarks=maxMarks;
	}

}
