package Company;

import java.util.Scanner;

public class Staircase {
	public static int stairs(int n) {
        if(n==0||n==1){
            return n;
        }
        int firstnum= 1, secondnum= 1;
        int result= 0;
        for(int i=1;i<n;i++){
            result = firstnum+secondnum;
            firstnum = secondnum;
            secondnum = result;
        }
        return result;
    }

public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("n = ");
		int n=sc.nextInt();
		System.out.println("There are "+stairs(n)+" ways to climb to the top.");
		sc.close();

	}

}
