import java.util.Scanner;
public class Program1{
	public static void main(String[] args){
		float r,si;
		int p,t;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principle Amount");
		p=sc.nextInt();
		System.out.println("Enter time period");
		t=sc.nextInt();
		System.out.println("Enter Rate amount");
		r=sc.nextFloat();
		si=(p*t*r)/100;
		System.out.println("simple intrest is"+si);
	}
}

