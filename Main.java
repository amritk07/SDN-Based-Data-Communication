package datacommunication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.SecureRandom;

public class Main {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub

		  
		   System.out.println("Enter no. of nodes");
		   BufferedReader input = new BufferedReader(new InputStreamReader(System.in) );
		   SecureRandom random =new SecureRandom();
           int vertex = Integer.parseInt(input.readLine());
           
           Network network = new Network(vertex);
          
          int range = (vertex*((vertex-1)))/2;
          for(int j =0;j<range;j++)
          {
         	 int u = random.nextInt(vertex+1);
         	 int v = random.nextInt(vertex+1);
         	 
         	 if(u!=v)
         	 {
         		 
         		 network.addEdge(u, v);
         		
         		 
         	 }
          }
          network.printList();
	}

}
