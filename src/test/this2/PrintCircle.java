package test.this2;

public class PrintCircle {

		public static void print(Circle c) {
			System.out.printf("������ %d���� ���� �ѷ��� %.2f���̴�. \n", c.getR(), c.getCircum());
			System.out.printf("������ %d���� ���� �ѷ��� %.2f���̴�. \n", c.getR(), c.getArea());
		}
		
	public static void main(String[] args) {
		Circle c = new Circle(7);
		c.showInfo();
		
		Circle c2 = new Circle(15);
		c2.showInfo();
	}

}
