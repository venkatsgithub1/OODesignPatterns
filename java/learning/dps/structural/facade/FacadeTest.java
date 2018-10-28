package learning.dps.structural.facade;

public class FacadeTest {

	public static void main(String[] args) {
		ShapeMaker s = new ShapeMaker();
		s.drawCircle();
		s.drawRectangle();
		s.drawSquare();
	}

}
