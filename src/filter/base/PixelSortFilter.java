package filter.base;

import java.awt.Color;
import java.awt.image.BufferedImage;

public abstract class PixelSortFilter extends ImageFilter {

	public float threshold;
	public Fill fill = Fill.STANDARD;
	public Color gradientColor = Color.black;
	public Comparator comparator = Comparator.TOTAL_RGB;

	
	/*
	 * If you would like to make your own pixel sorting based image filter, override the apply() method from the ImageFilter superclass and utilize the variables
	 * and methods here
	 */
	
	
	
	protected int getComparator(int color) {
		return comparator.getComparator(color);
	}

	@Override
	public String getCategory() {
		return "Pixel sort";
	}

	public static enum Comparator {TOTAL_RGB, MAX_RGB, HUE, SATURATION; 

		public int getComparator(int color) {
			return 0;
		}
	}

	public static enum Fill {STANDARD, SOLID, GRADIENT;

	}

	/**
	 * "sorts" pixels in line between x0 and x1 based on the filter's fill and comparator variables
	 * 
	 * @param img image to be modified
	 * @param x0 x-coord of first point
	 * @param x1 x-coord of last point
	 * @param y y-coord of line
	 */
	protected void line(BufferedImage img, int x0, int x1, int y) {

	}

	/**
	 * sorts pixels in line according to comparator
	 * 
	 * @param img image to be modified
	 * @param x0 x-coord of first point
	 * @param x1 x-coord of last point
	 * @param y y-coord of line
	 */
	protected void lineSort(BufferedImage img, int x0, int x1, int y) {
	
	}

	/**
	 * fills line of pixels with first color in line
	 * 
	 * @param img image to be modified
	 * @param x0 x-coord of first point
	 * @param x1 x-coord of last point
	 * @param y y-coord of line
	 */
	protected void lineFill(BufferedImage img, int x0, int x1, int y) {

	}
	
	/**
	 * fills line of pixels with gradient between first color in line and gradientColor
	 * 
	 * @param img image to be modified
	 * @param x0 x-coord of first point
	 * @param x1 x-coord of last point
	 * @param y y-coord of line
	 */
	protected void lineGradient(BufferedImage img, int x0, int x1, int y) {
		
	}
}
