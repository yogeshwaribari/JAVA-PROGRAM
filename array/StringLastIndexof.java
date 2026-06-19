/*last index of string found or not*/
class StringLastIndexof{
	public static void main(String x[])
	{
		String s="good morning india good morning pune";
		int index=s.lastIndexOf("morning");
		if(index!=-1)
		{
			System.out.println("Data found"+index);
		}
		else
		{
			System.out.println("Not found");
		}
	}

}