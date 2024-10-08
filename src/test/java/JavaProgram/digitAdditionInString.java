package JavaProgram;

public class digitAdditionInString {

	public static void main(String[] args) {
		
		String str = "st456ring43791";
		int sum = 0;
		for(int i=0;i<str.length();i++)
		{
			char temp = str.charAt(i);
			if(Character.isDigit(temp))
			{
				int b = Integer.parseInt(String.valueOf(temp));
				sum = sum + b;
			}
		}
		System.out.println(sum);
	}
}
