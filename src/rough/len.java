package rough;

//import string_java.lang.Object;

public class len extends Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello world";
		if(s.length()>0)
		{
			System.out.println("string is not empty"
					+s.length());
		}
		s="";
		if(s.length()==0)
		{
			System.out.println("string is  empty"
					+s.length());	
		}
	}


}


