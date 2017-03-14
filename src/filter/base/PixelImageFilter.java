package filter.base;

import java.awt.image.BufferedImage;

public abstract class PixelImageFilter extends ImageFilter {

	
	/**
	 * Applies a filter to an ARGB color.
	 * @param color is an integer representing a color in the format 0xAARRGGBB where AA are bytes representing alpha, RR red, GG green, and BB blue. 
	 * @return int representing color after it has been filtered
	 */
	public abstract int apply(int color);
	
	
	/**
	 * Angle controls are disabled by default, as pixel/algorithmic filters are not really affected by rotating, filtering, and unrotating
	 */
	@Override
	protected boolean angleControls() {
		return false;
	}
	
	@Override
	protected final BufferedImage apply(BufferedImage img) {
		return null;
	}
}
