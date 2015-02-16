
/*
ID: your_id_here
LANG: JAVA
TASK: ride
*/
import java.io.*;
import java.util.*;

class ride {
  public static void main (String [] args) throws IOException {
    // Use BufferedReader rather than RandomAccessFile; it's much faster
   BufferedReader f = new BufferedReader(new FileReader("ride.in"));
                                                  // input file name goes above
  PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
   String st =f.readLine();
			  
   int x=1;
    
    for(int i=0;i<st.length();i++)
    {
    	 x*= st.charAt(i)-64;
    	 
       	
    }
    
    st=f.readLine();
   
   
    
    int y=1;

    for(int i=0;i<st.length();i++)
    {
    	 y*= st.charAt(i)-64;
    	 
       	
    }
    
    
    if(x%47==y%47)
    	out.println("GO");
    else
    	out.println("STAY");

   out.close();                                  // close the output file
    System.exit(0);                               // don't omit this!
  }
  
  
  
}