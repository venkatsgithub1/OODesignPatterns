package learning.dps.structural.adapter.imageEditorExample.advanced;

import learning.dps.structural.adapter.imageEditorExample.exceptions.AdvancedImagesTypeException;
import learning.dps.structural.adapter.imageEditorExample.image.Image;

public interface AdvancedImageEditor {
	public void openTIFF(Image image) throws AdvancedImagesTypeException;

	public void openPNG(Image image) throws AdvancedImagesTypeException;
}
