package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("How many numbers do you want to include?");
		
		int totalNums = in.nextInt();
		
		boolean[] nums = new boolean [totalNums+1];
		
		for(int i=2; i<=totalNums; i++) {
			for(int j=2; j<=totalNums/i ; j ++) {
				nums[i*j]=true;
			}

		}
		
		for (int h=2; h<=totalNums; h++) {
			if (nums[h]==false) {
				System.out.println(h);
				
			}
		}
		
		

	}

}
