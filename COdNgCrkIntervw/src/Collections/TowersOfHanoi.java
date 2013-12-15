package Collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TowersOfHanoi {

	/**
	 * @param args
	 */
	 public  void TowerSwap(int n, int s,int b, int d) {
		    if (n== 0){
		      return; 
		    }
		    TowerSwap(n-1, s,d, b);
		    System.out.println("Move " +n + " from " + s + " to " +d);
		    TowerSwap(n-1, b,s, d);
		  }
		  
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		TowersOfHanoi th=new TowersOfHanoi();
		System.out.println("entern the number of disks we need");
		
		int k=Integer.parseInt((new BufferedReader( new InputStreamReader(System.in))).readLine());
		
		th.TowerSwap(k,1,2,3);
	}

}
