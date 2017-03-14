package filter.base;

import java.awt.image.BufferedImage;

public abstract class ConvoutionFilter extends ImageFilter {

	
	/**
	 * Define a kernel convolution matrix as a 2D array of floats. More info: https://en.wikipedia.org/wiki/Kernel_(image_processing)
	 * 
	 * @return 2D array representing kernel convolution
	 */
	public abstract float[][] getMatrix();
	
	/**
	 * Scales matrix so that the sum of all elements equals 1. This feature is accessible to the user via the "normalize" checkbox, but it may also come in handy in
	 * your getMatrix() method.
	 * @param matrix
	 */
	protected final void normalize(float[][] matrix) {
		
	}
	
	@Override
	public final BufferedImage apply(BufferedImage img) {
		return null;
	}
}
