package JavaProgram;

public class splitString {

	public static void main(String[] args) {
		
		String str = "Java Selenium";
		String [] s = str.split(" ");
		String rev = "";
		for(String w:s)
		{
			String revs = " ";
			for(int i=w.length()-1;i>=0;i--)
			{
				revs = revs+w.charAt(i);
			}
			rev = rev+revs;
		}
		System.out.println(rev);
	}
}
