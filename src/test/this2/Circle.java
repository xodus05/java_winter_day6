package test.this2;

public class Circle {
	private int r;
	private double circum, area;
	
	public Circle(int r) {
		this.r = r;
	}

	public int getR() {
		return r;
	}

	public double getCircum() {
		return circum;
	}

	public double getArea() {
		return area;
	}
	
// 반지름이 r인 원의 둘레계산하는 메소드
	public void calcCircum() {
		circum = 2 * Math.PI * r;
	}

}
