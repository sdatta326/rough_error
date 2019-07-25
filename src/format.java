
public class format {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		String s1=String.format("name is %s",s);
		String s2=String.format("value is %f",32.40);
		String s3=String.format("value is 32.12%f",32.40);
		System.out.println(s1);  
		System.out.println(s2);  
		System.out.println(s3);  

	}

}
