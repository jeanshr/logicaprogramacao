package beeCrowd;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class TesteHackerRank {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
	      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	        int N = Integer.parseInt(bufferedReader.readLine().trim());
	        Integer multiplicationLimitVar = 10;
	        
	        for(int i = 1; i <= multiplicationLimitVar; i++) {
	        	
	        	Integer doMultiplication = N * i;
	        	System.out.println(N + " x " + i + " = " + doMultiplication);
	        	
	        }

	        bufferedReader.close();
	        
	}

}
