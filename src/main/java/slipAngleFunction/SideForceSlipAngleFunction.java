package slipAngleFunction;

/**
 * expects input from -90 to 90
 */
public class SideForceSlipAngleFunction implements Function {

	public float f(float x) {
		return (float) (0.7185511f / (1f + Math.pow(x / 47.07638f, 1.798005f)));
	}
}
