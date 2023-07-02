package basics;
import java.util.Scanner;
public class AreaTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
double area,base,height;
System.out.println("enter the base and height of the traingle");
base=sc.nextDouble();
height=sc.nextDouble();
area=0.5*base*height;
System.out.println("The area of the traingle is "+area);

	}

}
