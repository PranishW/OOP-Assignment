
import java.lang.Math;
import java.util.*;
class Complex
{
	float a,b;
	Complex(float a,float b)
	{
		this.a = a;
		this.b = b;
	}
	public void Addition (Complex c2)
	{
		Complex c = new Complex(a,b);
		c.a = this.a + c2.a;
		c.b = this.b + c2.b;
		System.out.println("After addition , the complex no obtained is :-");
		c.display();
	}
	public void Subtraction (Complex c2)
	{
		Complex c = new Complex(a,b);
		c.a = this.a - c2.a;
		c.b = this.b - c2.b;
		System.out.println("After subtraction , the complex no obtained is :-");
		c.display();
	}
	public void Multiplication (Complex c2)
	{
		Complex c = new Complex(a,b);
		c.a = this.a*c2.a - this.b*c2.b ;
		c.b = this.a*c2.b + this.b*c2.a;
		System.out.println("After multiplication , the complex no obtained is :-");
		c.display();
	}
	public void Division(Complex c2)
	{
		Complex c = new Complex(a,b);
		c.a =(float) ((this.a*c2.a + this.b*c2.b)/(Math.pow(c2.a,2)+Math.pow(c2.b,2)));
		c.b =(float) ((this.b*c2.a - this.a*c2.b)/(Math.pow(c2.a,2)+Math.pow(c2.b,2)));
		System.out.println("After division , the complex no obtained is :-");
		c.display();
	}
	public void display()
	{
		System.out.println(a+" + "+ b+"i");
	}
}
public class complex_nos {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the real and imaginery parts of the complex no 1 :-");
		a = sc.nextInt();
		b = sc.nextInt();
		Complex c1 = new Complex(a,b);
		System.out.println("Enter the real and imaginery parts of the complex no 2 :-");
		a = sc.nextInt();
		b = sc.nextInt();
		Complex c2 = new Complex(a,b);
		System.out.println("Complex no 1 is :-");
		c1.display();
		System.out.println("Complex no 2 is :-");
		c2.display();
		c1.Addition(c2);
		c1.Subtraction(c2);
		c1.Multiplication(c2);
		c1.Division(c2);
	}

}
