package test.static1;

public class TV {
	private String producer; //Ŭ���� ���� ���������� �� 1���� �Ҵ��
	private int size; // �ν��Ͻ����� ��ü ������ �� ���� ������ ��� �ʵ�� �Ҵ��
	private String color; // �ν��Ͻ�����
	
	public TV(int size, String color) {
		this.size = size;
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public String getColor() {
		return color;
	}
	
	
	
}
