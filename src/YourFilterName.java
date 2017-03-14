import java.awt.Color;
import java.awt.image.BufferedImage;

import filter.base.ImageFilter;

public class YourFilterName extends ImageFilter {

	public int exampleInt = 0;
	public float exampleFloat = .5f;
	public Color exampleColor = Color.BLACK;
	
	@Override
	protected BufferedImage apply(BufferedImage img) {
		return img;
	}

}
