import java.util.ArrayList;
import java.util.HashMap;


public class DBass {

	static int count=1;
	static HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();
static int [] array = {1,3,5,8,9,2,6,7,6,8,9};
	

public static void main(String[] args) {
	
	
	System.out.println("DP is kkkkkkkkkkkkkkkkkkkkkkkkkkkkk " +  Dp(0));
	System.out.println("recursion is   "+rec(0));
	
}



public static int Dp(int index)
{
	if( cache.get(index)!=null)
		return cache.get(index);
	
	else
		{ if(index >= array.length-1)
		
			return 0;
	  
	
	else
	{ 		int value=array[index]; 

		cache.put(index,dphelp(index,value));
	return dphelp(index,value);
	}	
		}
}

public static int dphelp(int index, int value)

{
	
	if(value==0)
	  return 0;
  
  else
	  dphelp (index,value-1);
 return 1 +	 Dp(index+value);



}




public static int rec ( int index)
  {
//System.out.println(index);
	if(index >= array.length-1)
	{
		return 0;
  }
	
   
	else{	
		
		
		int value=array[index]; 
		return  rechelp(index,value);
 
	}
	
	
	
	}


public static int rechelp(int index, int value )
{  
	
	
	if(value==0)
	  return 0;
  
  else
	  rechelp (index,value-1);
 return 1 +	 rec(index+value);

}
}
