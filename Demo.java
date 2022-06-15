import java.util.Scanner;
public class Demo{
	public static void main(String[] args){
		int a;
		System.out.println("Enter any number");
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		if(a%2==0){
			System.out.println("the number "+a+" is even");
		}
		else{
			System.out.println("the number"+a+" is odd");
		}
	}
}