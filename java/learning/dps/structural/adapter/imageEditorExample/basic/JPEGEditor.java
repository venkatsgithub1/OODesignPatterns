package learning.dps.structural.adapter.imageEditorExample.basic;

import learning.dps.structural.adapter.imageEditorExample.exceptions.AdvancedImagesTypeException;
import learning.dps.structural.adapter.imageEditorExample.exceptions.GenericException;
import learning.dps.structural.adapter.imageEditorExample.image.Image;
import learning.dps.structural.adapter.imageEditorExample.imageEditorAdapter.ImageAdapter;

public class JPEGEditor implements ImageEditor {

	ImageAdapter adapterInstance;

	@Override
	public void openImage(Image image) throws GenericException, AdvancedImagesTypeException {

		if (image.getType() == null || image.getType().trim().equals("")) {
			throw new GenericException("Image type cannot be null or blank");
		}

		if (image.getType().equalsIgnoreCase("jpeg")) {
			System.out.println("opening jpeg image");
		} else {
			if (image.getType().equalsIgnoreCase("tiff") || image.getType().equalsIgnoreCase("png")) {
				adapterInstance = new ImageAdapter(image);
				adapterInstance.openImage(image);
			} else {
				throw new AdvancedImagesTypeException();
			}
		}
	}

}
