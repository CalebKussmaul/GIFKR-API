package filter.base;

import java.awt.Color;
import java.awt.image.BufferedImage;

public abstract class TextFilter extends ImageFilter {

	
	/**
	 * Gets the character to be drawn given the color in the original image at the same location and index of the character
	 * 
	 * @param color ARGB color at position to draw character
	 * @param count index of character drawn (i.e. count == 5 means that it is asking for the 5th character to be drawn in the image)
	 * @return character to be drawn
	 */
	public abstract char getChar(int color, int count);

	/**
	 * Gets the color to be drawn given the color in the original image at the same location and index of the character
	 * 
	 * @param color ARGB color at position to draw character
	 * @param count index of character drawn (i.e. count == 5 means that it is asking for the 5th character to be drawn in the image)
	 * @return color to be drawn
	 */
	public abstract Color getColor(int color, int count);
	
	@Override
	protected final BufferedImage apply(BufferedImage img) {
		return null;
	}
}
