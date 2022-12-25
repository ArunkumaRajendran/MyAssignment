package week1.day1;

public class Calculator {
	
	public void sub()
	{
		int a=10;
		int b=20;
		int c=b-a;
		System.out.println(c);	
	}
	public int mul(int a,int b)
	{
	return a*b;
	
}
	public static void main(String[] args) {
		
		Calculator CalObj= new Calculator();
		CalObj.sub();
		int mul = CalObj.mul(05, 10);
		System.out.println(mul);
	
	}
}
