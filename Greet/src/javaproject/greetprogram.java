package javaproject;
import java.util.Scanner;

public class greetprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scan=new Scanner(System.in);
				System.out.println("Enter Your Name");
				String name=scan.nextLine();
				greet(name);
				}
				public static void greet(String name)
				{
				System.out.println("Hello "+name+" How Are You...?");

	}

}
