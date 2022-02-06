package mainpro;

public class Calaculator {
	public int addition(int a, int b) {
		int sum = a+b;
		return sum;
		
	}
	public int subtraction(int a, int b) {
		int sub = a-b;
		return sub;
	}
	public int multiplication(int a, int b) {
		int mul = a*b;
		return mul;
	}
	public int division(int a, int b) {
		int division = a/b;
		return division;
	}
	public int modulus(int a, int b) {
		int mod = a%b;
		return mod;
	}
	public static void main(String[] args) {
		int num1=25;
		int num2=15;
		Calaculator obj =new Calaculator();
		int result = obj.addition(num1,num2);
		int result2 = obj.subtraction(num1, num2);
		int result3 = obj.multiplication(num1, num2);
		int result4 = obj.division(num1, num2);
		int result5 = obj.modulus(num1,num2);
		System.out.println("sum is:"+result);
		System.out.println("sub is:"+result2);
		System.out.println("mul is:"+result3);
		System.out.println("div is:"+result4);
		System.out.println("mod is:"+result5);
	}
}

