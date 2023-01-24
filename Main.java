package solids;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AreaCalculator objAreaCalculator = new AreaCalculator();
		Circle objCircle = new Circle(10);
		Square objSquare = new Square(10);
		Cube objCube = new Cube();
		//NoShape objNoShape = new NoShape();
		//Shape objNoShape = new NoShape();
		
		List<Shape> lstShapes = new ArrayList<>();
		lstShapes.add(objCircle);
		lstShapes.add(objSquare);
		lstShapes.add(objCube);
		//lstShapes.add(objNoShape);
		
		//List.of(objCircle, objSquare);
		
		ShapesPrinter objShapesPrinter = new ShapesPrinter();
		int iSum = objAreaCalculator.sum(lstShapes);
		System.out.print(objShapesPrinter.json(iSum));
		System.out.print(objShapesPrinter.csv(iSum));
		
	}

}
