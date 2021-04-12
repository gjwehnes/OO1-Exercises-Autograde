
public class TriangleClassifier {
	
	public static boolean isValidTriangle(int angleA, int angleB, int angleC)
	{
		boolean isValid = true;
		
		if ((angleA + angleB + angleC) != 180)
		{
			isValid = false;
		}
		else if ((angleA + angleB + angleC) == 180)
		{
			if ((angleA + angleB >= 180) || (angleB + angleC >= 180) || (angleA + angleC >= 180))
			{
				isValid = false;
			}
			else
			{
				isValid = true;
			}
		}
		return isValid;
	}
	
	public static String classifyByAngle(int angleA, int angleB, int angleC)
	{
		String classificationByAngle = "";
		if (angleA > 90 || angleB > 90 || angleC > 90)
		{
			classificationByAngle = "obtuse";
		}
		else if (angleA == 90 || angleB == 90 || angleC == 90)
		{
			classificationByAngle = "right";
		}
		else if (angleA < 90 || angleB < 90 || angleC < 90)
		{
			classificationByAngle = "acute";
		}
		return classificationByAngle;
	}
	
	public static String classifyBySide(int sideA, int sideB, int sideC)
	{
		String classificationBySide = "";
		if(sideA == 60 && sideB == 60 && sideC == 60)
		{
			classificationBySide = "equilateral";
		}
		else if(sideA == sideB || sideA == sideC || sideB == sideC)
		{
			classificationBySide = "isosceles";
		}
		else if ((sideA != sideB) && (sideA != sideC) && (sideB != sideC))
		{
			classificationBySide = "scalene";
		}
		return classificationBySide;
	}
	
	public static String getClassification(int angle1, int angle2, int angle3)
	{
		String finalClassification;
		
		if (TriangleClassifier.isValidTriangle(angle1, angle2, angle3) == false)
		{
			finalClassification = "INVALID";
		}
		else
		{
			if ((TriangleClassifier.classifyBySide(angle1, angle2, angle3)).equals("equilateral"))
			{
				finalClassification = "equilateral";
			}
			else
				{
					finalClassification = TriangleClassifier.classifyByAngle(angle1, angle2, angle3)
					+ " " +
					TriangleClassifier.classifyBySide(angle1, angle2, angle3);
				}
		}
		return finalClassification;
		
	}
}
