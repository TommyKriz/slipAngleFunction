package slipAngleFunction;

import processing.core.PApplet;

public class Main extends PApplet {

	public static void main(String[] args) {
		PApplet.main("slipAngleFunction.Main");
	}

	private CoordSystem coordSystem;

	@Override
	public void settings() {
		size(1800, 1000);
	}

	@Override
	public void setup() {
		fill(44, 44, 44);
		coordSystem = new CoordSystem(this);
		coordSystem.addFunction(new DrivingForceSlipAngleFunction());
		coordSystem.addFunction(new SideForceSlipAngleFunction());
	}

	@Override
	public void draw() {
		coordSystem.draw();
	}

}
