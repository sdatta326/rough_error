package rough;

import java.util.Arrays;

public class stringr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr=new String[] {"a","b","c"};
		String[] arr1={"a","b","c"};
		System.out.println(arr.equals(arr1));
		System.out.println(Arrays.toString(arr).equals(Arrays.toString(arr1)));
		
		if(arr.equals(arr1))
		{
			System.out.println("not equal for objects diff return false");
		}
		if(Arrays.toString(arr).equals(Arrays.toString(arr1)))
		{
			System.out.println("check for value equal for values return true");
		}
		

	}

}
