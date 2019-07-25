
class p implements Cloneable{
	int i;
	p(int i)
	{
	this.i=i;	
	}
	public int get(int k)
	{
		return i+k;
	}
	
	 public Object clone()throws CloneNotSupportedException{  
			return (p)super.clone();  
		   }
}
public class j {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
p d=new p(10);
try
{
p d1=(p)d.clone();

System.out.println(d.get(10));
System.out.println(d1.get(20));
	}
catch(CloneNotSupportedException e)
{
e.printStackTrace();
}

}
}
