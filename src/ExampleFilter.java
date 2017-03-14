import java.awt.image.BufferedImage;

import filter.base.ImageFilter;

public class ExampleFilter extends ImageFilter {

	@Override
	protected BufferedImage apply(BufferedImage img) {
		return img;
	}
	
	@Override
	public String getCategory() {
		return "External";
	}

}
