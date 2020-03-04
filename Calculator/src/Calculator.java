
public class Calculator {
	public int add(int num1, int num2)
	{
		int r = num1 + num2;
		return r;
		
	}
	public int sub(int num1, int num2)
	{
		int r = num1 - num2;
		return r;
		
	}
	
	public int mul(int num1, int num2)
	{
		int r = num1 * num2;
		return r;
	}
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int a = cal.add(2,4);
		int b = cal.sub(4,2);
		int c = cal.mul(5, 6);
	 System.out.println("Adding two numbers:" +a);
	 System.out.println("Subtracting two numbers:" +b);
	 System.out.println("Multipliying two numbers:"+c);
	 
	}
}



