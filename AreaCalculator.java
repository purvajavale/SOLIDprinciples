package solids;

import java.util.List;

public class AreaCalculator {

	public int sum(List<Shape> lstShapes) {
		// TODO Auto-generated method stub
		
		int iSum = 0;
		for (int i = 0; i < lstShapes.size() ; i++) {
			
			Shape objShape = lstShapes.get(i);
			iSum += objShape.area();
						
		}
		return iSum;
	}

}
