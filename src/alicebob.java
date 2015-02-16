
public class alicebob {
	
	
	public static int bob(int x,String a,String b,String w)
	
	{ System.out.println(x+"  "+a);
		
		if(x<=0)
		return 0;
		
		
		if(x==1 && b==w)
			return 0;
		if(x==2 && b==w)
			return 0;
		if(x==3 && b==w)
		{System.out.println("win 2");
			return 2;}
		if(x==4 && b==w)
			return 0;
		
		if(x==1 &&a==w){
			System.out.println("win");
			return 1;	}
		
		if(x==2&&a==w)
		{System.out.println("win");
			return 1;}
		if(x==3&&a==w)
			return  0;
		if(x==4&&a==w)
		{System.out.println("win ");
			return 1;}
		
		
		
		
		
		
		//System.out.println("Expand");
		return bob(x-1,b,a,w) +bob(x-2,b,a,w) + bob(x-4,b,a,w);

		
	}
	public static void main(String []args)
	
	{
	
	//System.out.println(bob(3,"A","B","B"));
	
	System.out.println(bob(7,"A","B","A")+"  result");
//	System.out.println(bob(35,"A","B","A"));
//	System.out.println(bob(30,"B","A","B"));
	

		
		
	}
	

}
