package solids;

public class Circle implements Shape{

	private int jRadius;
	
	public Circle(int jRadius) {
		this.jRadius = jRadius;
	}

	public int getRadius() {
		// TODO Auto-generated method stub
		return jRadius;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(getRadius(), 2);
	}

}
