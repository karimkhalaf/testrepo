
/*
ID: your_id_here
LANG: JAVA
TASK: ride
*/
import java.io.*;
import java.util.*;

class gift1 {
  public static void main (String [] args) throws IOException {
    // Use BufferedReader rather than RandomAccessFile; it's much faster
   BufferedReader f = new BufferedReader(new FileReader("C:\\Users\\kouki\\workspace\\ACM\\gift1.in"));
                                                  // input file name goes above
  PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));
   String [] arr =new String [Integer.parseInt(f.readLine())];
int [] amount= new int [arr.length];
			  
   
for(int i=0;i<amount.length;i++)
{
	arr[i]=f.readLine();

}


   
    




    
    
  
  
  }
  }