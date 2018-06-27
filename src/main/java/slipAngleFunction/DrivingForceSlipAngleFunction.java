package slipAngleFunction;

/**
 * expects input from -90 to 90
 */
public class DrivingForceSlipAngleFunction implements Function {

	// fitted with mycurvefit.com from the image
	public float f(float x) {
		// Quartic Regression (4th order polynomial)
		// return (float) (-0.003368051f + 0.09946034f * x - 0.003502362f
		// * Math.pow(x, 2) + 0.00004868238f * Math.pow(x, 3) - 0.0000002364072f
		// * Math
		// .pow(x, 4));

		// Quintic Regression (5th order polynomial)
		return (float) (-0.003875009f + 0.1026378f * x - 0.003929356f
				* Math.pow(x, 2) + 0.00006644634f * Math.pow(x, 3)
				- 0.0000005227118f * Math.pow(x, 4) + 0.000000001561114f * Math
				.pow(x, 5));
	}

}
