package learning.dps.structural.adapter.imageEditorExample.imageEditorAdapter;

import learning.dps.structural.adapter.imageEditorExample.advanced.AdvancedImageEditor;
import learning.dps.structural.adapter.imageEditorExample.advanced.PNGEditor;
import learning.dps.structural.adapter.imageEditorExample.advanced.TIFFEditor;
import learning.dps.structural.adapter.imageEditorExample.basic.ImageEditor;
import learning.dps.structural.adapter.imageEditorExample.exceptions.AdvancedImagesTypeException;
import learning.dps.structural.adapter.imageEditorExample.exceptions.GenericException;
import learning.dps.structural.adapter.imageEditorExample.image.Image;

public class ImageAdapter implements ImageEditor {

	AdvancedImageEditor imageEditor;

	public ImageAdapter(Image image) throws GenericException {

		if (image.getType() == null) {
			throw new GenericException("Image type cannot be null or blank");
		}
		if (image.getType().equalsIgnoreCase("tiff")) {
			imageEditor = new TIFFEditor();
		} else if (image.getType().equalsIgnoreCase("png")) {
			imageEditor = new PNGEditor();
		}
	}

	@Override
	public void openImage(Image image) throws AdvancedImagesTypeException {
		if (image.getType().equalsIgnoreCase("tiff")) {
			imageEditor.openTIFF(image);
		} else if (image.getType().equalsIgnoreCase("png")) {
			imageEditor.openPNG(image);
		}
	}

}
