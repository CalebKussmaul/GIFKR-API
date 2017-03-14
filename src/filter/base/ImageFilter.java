package filter.base;

import java.awt.image.BufferedImage;
import java.util.Random;

public abstract class ImageFilter implements Comparable<ImageFilter> {


	protected Random rand;
	
	/**
	 * Defines a basic image filter by taking an unfiltered image img, and returning a filtered image
	 * @param img
	 * @return filtered image which may or may not be the same as the input
	 */
	protected abstract BufferedImage apply(BufferedImage img);
	
	/**
	 * Override this and return false to hide random controls in your filter if they are not necessary
	 */
	protected boolean randomControls() {
		return true;
	}
	

	/**
	 * Override this and return false to hide angle controls in your filter if they are not necessary
	 */
	protected boolean angleControls() {
		return true;
	}
	
	/**
	 * 
	 * @return category of filters this image filter belongs to. Feel free to override this.
	 */
	public String getCategory() {
		return null;
	}


	/**
	 * Function called before image is filtered. Feel free to override this if you need to.
	 */
	protected void beforeFilter() {

	}

	/**
	 * Function called after image is filtered. Feel free to override this if you need to.
	 */
	protected void afterFilter() {
		
	}
	
	
	/**
	 * Do not try to be clever and try to override this 
	 */
	@Override
	public final int compareTo(ImageFilter o) {
		return 0;
	}
}
