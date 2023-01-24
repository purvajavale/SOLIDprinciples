package solids; 

public class Square implements Shape{

	private int jLength;
	
	public Square(int jLength) {
		this.jLength = jLength;
	}
	
	public double getLength() {
		// TODO Auto-generated method stub
		return jLength;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.pow(getLength(), 2); 
	}

}
