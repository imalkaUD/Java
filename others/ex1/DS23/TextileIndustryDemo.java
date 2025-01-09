package DS23;

public class TextileIndustryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        DesignSelector japaneseRobot = new JapaneseRobot();
		        japaneseRobot.setDrawableLines(DashLines.getInstance());
		        japaneseRobot.designLines();
		        
		        japaneseRobot.setDrawableLines(DottedLines.getInstance());
		        japaneseRobot.designLines();
		        
		        japaneseRobot.setDrawableLines(StraightLines.getInstance());
		        japaneseRobot.designLines();

		        japaneseRobot.setDrawableShapes(CircleShapes.getInstance());
		        japaneseRobot.designShapes();

		        japaneseRobot.setDrawableShapes(SquareShapes.getInstance());
		        japaneseRobot.designShapes();

		        DesignSelector chineseRobot = new ChineseRobot();
		        chineseRobot.setDrawableShapes(CircleShapes.getInstance());
		        chineseRobot.designShapes();

		        chineseRobot.setDrawableShapes(SquareShapes.getInstance());
		        chineseRobot.designShapes();

		        chineseRobot.setDrawableShapes(TriangleShapes.getInstance());
		        chineseRobot.designShapes();
		    }
		}
		
		

	}

}


