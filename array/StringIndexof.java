/*index of string found or not*/
class StringIndexof{
	public static void main(String x[])
	{
		String s="good morning india good morning pune";
		int index=s.indexOf("morning");
		if(index!=-1)
		{
			System.out.println("Data found");
		}
		else
		{
			System.out.println("Not found");
		}
	}

}