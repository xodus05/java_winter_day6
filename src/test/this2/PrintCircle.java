package test.this2;

public class PrintCircle {

		public static void print(Circle c) {
			System.out.printf("반지름 %d㎝인 원의 둘레는 %.2f㎝이다. \n", c.getR(), c.getCircum());
		}
		
	public static void main(String[] args) {
		Circle c = new Circle(7);

	}

}
