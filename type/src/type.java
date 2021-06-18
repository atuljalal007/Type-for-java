import java.lang.*;
public class type {
	
	public static void main(String []args)
	{
	String str="sdf df ";
	int as= 12;
	char sd = 'a';
	float df= 0.6f;
	String []arr=new String[5];
	boolean  r = true;
	System.out.println(str.getClass().getSimpleName());
	System.out.println(arr.getClass().getSimpleName());
	//to get the type of int,bool & floatneed to cast it to object first
	System.out.println(((Object)as).getClass().getSimpleName());
	System.out.println(((Object)df).getClass().getSimpleName());
	System.out.println(((Object)df).getClass().getSimpleName());
	System.out.println(((Object)r).getClass().getSimpleName());
	}

}
