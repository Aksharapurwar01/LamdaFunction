package lamda;

@FunctionalInterface
interface IMathFunction {
	
	int calculate(int a, int b);
	
	static void printResult(int a, int b, String function, IMathFunction fobj ) {
		System.out.println("Result of " + function + "is " + fobj.calculate(a, b));
	}
}

public class MathOperation {
	
	public static void main(String[] args) {
		
		IMathFunction add = (x, y) -> x + y;
		IMathFunction subtract = (x, y) -> x - y;
		IMathFunction multiply = (x, y) -> x * y;
		IMathFunction divide = (x, y) -> x / y;


		System.out.println("Addtion is " + add.calculate(56 ,86));
		System.out.println("Subtraction is " + subtract.calculate(84, 53));
		System.out.println("Multiplication is " + multiply.calculate(54, 84));
		System.out.println("Division is " + divide.calculate(84, 44));
	}
}