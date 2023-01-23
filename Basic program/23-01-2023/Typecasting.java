package basicprogram;

public class Typecasting {

	public static void main(String[] args) {
		System.out.println("Widening type casting");
		int x=7;
		float y=x;//widening type casting
		System.out.println("before type casting: "+x);
		System.out.println("After type casting: "+y);
		double d=166.76;
		System.out.println("===================");
		System.out.println("narrowing typecasting");
		System.out.println("before type casting: "+d);
		int i=(int)d;//narrowing type casting
		System.out.println("after typecasting: "+i);

	}

}
