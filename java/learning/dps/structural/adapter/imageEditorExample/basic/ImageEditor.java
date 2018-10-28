package learning.dps.structural.adapter.imageEditorExample.basic;

import learning.dps.structural.adapter.imageEditorExample.exceptions.AdvancedImagesTypeException;
import learning.dps.structural.adapter.imageEditorExample.exceptions.GenericException;
import learning.dps.structural.adapter.imageEditorExample.image.Image;

public interface ImageEditor {
	public void openImage(Image image) throws GenericException, AdvancedImagesTypeException;
}
