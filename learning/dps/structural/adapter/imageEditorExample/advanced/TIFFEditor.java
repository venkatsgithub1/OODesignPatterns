package learning.dps.structural.adapter.imageEditorExample.advanced;

import learning.dps.structural.adapter.imageEditorExample.image.Image;

public class TIFFEditor implements AdvancedImageEditor {

	@Override
	public void openTIFF(Image image) {
		System.out.println("opening tiff image");
	}

	@Override
	public void openPNG(Image image) {
	}

}
