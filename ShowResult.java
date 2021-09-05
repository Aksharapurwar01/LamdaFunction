package lamda;

public class ShowResult {
	
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