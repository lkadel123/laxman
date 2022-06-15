import java.util.*;
public class DemoSt{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter any number");
		a=sc.nextInt();
		System.out.println("Enter any number");
		b=sc.nextInt();
		c=a+b;
		System.out.println("the sum of"+a+"and"+b+"is"+c);
		if(c%2==0){
		System.out.println("the number"+c+"is even");
		}
		else{
		System.out.println("the number"+c+"is odd");
		}
	}
}
		
		