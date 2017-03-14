package filter.base;

import java.awt.image.BufferedImage;

public abstract class AlgebraicImageFilter extends ImageFilter {

	/**
	 * Defines a function to apply to each RGB channel of every pixel in an image. 
	 * 
	 * @param channel: Number between 0 and 255 representing the red, green, or blue channel of a pixel. 
	 * @return number representing the new r/g/b value of a pixel. Values exceeding 255 will behave as the number modulus 255.
	 */
	public abstract int apply(int channel);
	
	/**
	 * Tells superclass whether to use lookup table to increase performance when filtering image. Override this to return true IFF your filter does not use any non-deterministic (random) input
	 * 
	 * @return boolean representing whether or not to use a lookup table when computing values
	 */
	protected boolean useLookupTable() {
		return false;
	}
	
	
	
	
	
	
	@Override
	protected boolean angleControls() {
		return false;
	}

	@Override
	protected final BufferedImage apply(BufferedImage img) {
		return null;
	}
	
	@Override
	public String getCategory() {
		return "Algebraic";
	}
}
