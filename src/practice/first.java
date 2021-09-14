package practice;

import java.util.Scanner;

public class first {
	
	public static int sum(int a, int b){
		return a+b;
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		System.out.println("This is the first java program");
		System.out.println("Enter a name");
		
		String name = sc.nextLine();
		
		System.out.println("Hello " + name+ "!");
		System.out.println("Age please");
		
		int age = sc1.nextInt();
		
		System.out.println("Age: "+age);
		
		System.out.println("Age + 10 is " + sum(age, 10));
		
		
		
	}
}
