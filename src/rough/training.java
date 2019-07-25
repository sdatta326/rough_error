package rough;
import parent_package.parent_class.*;

class parent_class
{
 private int i=10;
 parent_class()
{
	System.out.println("hello parent con"+i);
}
  private void show()
{
	System.out.println("hello world");
	
}
  public void show1()
  {
	show();
  }


  

}

//how to print private method?

class training 
{
	public static void main(String args[])
	{
		
		parent_class d=new parent_class();
		//System.out.println(d.i);
		//d.show();
		d.show1();
		
		
		
	}
	
}
//importent access modifier