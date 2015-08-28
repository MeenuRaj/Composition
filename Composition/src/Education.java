
public class Education {
 private String[] school = new String[10];
	public String[] getSchool() {
	return school;
}
public void setSchool(String[] school) {
	this.school = school;
}
	public Education()
	{
		
		school[0] = "Spring";
		school[1] = "Floral";
		school[2] = "Johnsons";
		school[3] = "Whitmore";
		school[4] = "Oakland";
		school[5] = "Gensis";
		school[6] = "Prescott";
		school[7] = "Deermont";
		school[8] = "Breckenridge";
		school[9] = "Dunley";
	}
	public String toString()
	{
		String atendsch = "";
		for (int i=0; i<10; i++)
		{
			atendsch += " " +school[i] + "\n";
		}
		return atendsch;
	}
}

