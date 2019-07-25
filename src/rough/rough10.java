package rough;


public class rough10  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="welcome to my javapoint";
		int l=s.length();
		int c=0;
		//char c=s.charAt(8);
		for (int i=0;i<=l-1;i++)
		{
			if(s.charAt(i)=='t')
			{
				c++;
		
			}
		}
		System.out.println("t"+" "+"is appearing"+" "+c+"times");

	}

}