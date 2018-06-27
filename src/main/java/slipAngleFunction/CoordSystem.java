package slipAngleFunction;

import java.util.ArrayList;
import java.util.List;

import processing.core.PApplet;

public class CoordSystem {

	private static final int RIGHT_X = 90;

	private static final int LEFT_X = -90;

	private static final float WIDTH_PERCENTAGE = 0.5f;

	private static final float HEIGHT_PERCENTAGE = 0.75f;

	private static final float X_SCALE = 8;

	private static final float Y_SCALE = 700;

	private static final float BOTTOM_Y = 0;

	private static final float TOP_Y = 1;

	PApplet parent;

	private float originX;
	private float originY;

	private List<Function> functions;

	public CoordSystem(PApplet parent) {
		this.parent = parent;
		functions = new ArrayList<>();
		originX = parent.width * WIDTH_PERCENTAGE;
		originY = parent.height * HEIGHT_PERCENTAGE;

	}

	public void draw() {
		drawCoordSystem();
		for (Function f : functions) {
			drawFunction(f, LEFT_X, RIGHT_X);
		}
	}

	private void drawFunction(Function function, float startX, float endX) {
		float resolution = 0.01f;
		for (float x = startX; x <= endX; x += resolution) {
			parent.ellipse(originX + x * X_SCALE, originY - function.f(x)
					* Y_SCALE, 3, 3);
		}
	}

	private void drawCoordSystem() {
		parent.ellipse(originX, originY, 3, 3);
		parent.line(0, originY, parent.width, originY);
		parent.line(originX, 0, originX, parent.height);

		parent.fill(12, 200, 12);

		// x
		for (float x = LEFT_X; x <= RIGHT_X; x += 10) {
			parent.text("" + x, originX + x * X_SCALE, originY);
		}
		// y
		for (float y = BOTTOM_Y; y <= TOP_Y; y += 0.2) {
			parent.text("" + y, originX, originY - y * Y_SCALE);
		}
	}

	public void addFunction(Function f) {
		functions.add(f);
	}

}
