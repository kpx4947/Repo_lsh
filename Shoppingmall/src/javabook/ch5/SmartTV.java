package javabook.ch5;

public class SmartTV extends Product {
	String resolution; // 해상도

	public SmartTV(String pname, int price, String resolution) {
		this.pname = pname;
		this.price = price;
		this.resolution = resolution;
	}
	@Override
	public void printExtra() {
		// TODO Auto-generated method stub
		System.out.println("해상도 : " + resolution);

	}

}
