package Company;

import java.util.HashSet;
import java.util.Scanner;

public class LongestPalindrome {
	public static int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int countNumber = 0;
        if(s == null || s.length() == 0){
            return 0;
        }
        for( int i=0 ; i<s.length();i++){
            if(set.contains(s.charAt(i))){
                set.remove(s.charAt(i));
                countNumber++;
            }else{
                set.add(s.charAt(i));
            }
        }
        if(set.isEmpty()){
            return countNumber*2;
    }else{
    	return countNumber*2+1;
        }
  }

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("s = ");
		String s=sc.nextLine();
		System.out.println(longestPalindrome(s));
		sc.close();

	}

}
