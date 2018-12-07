package learning.dps.structural.adapter.imageEditorExample.advanced;

import learning.dps.structural.adapter.imageEditorExample.image.Image;

public class PNGEditor implements AdvancedImageEditor {

	@Override
	public void openTIFF(Image image) {
	}

	@Override
	public void openPNG(Image image) {
		System.out.println("opening png image");
	}

}
