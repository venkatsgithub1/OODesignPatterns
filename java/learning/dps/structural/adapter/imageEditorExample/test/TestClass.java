package learning.dps.structural.adapter.imageEditorExample.test;

import learning.dps.structural.adapter.imageEditorExample.basic.JPEGEditor;
import learning.dps.structural.adapter.imageEditorExample.exceptions.AdvancedImagesTypeException;
import learning.dps.structural.adapter.imageEditorExample.exceptions.GenericException;
import learning.dps.structural.adapter.imageEditorExample.image.Image;

public class TestClass {
	public static void main(String[] args) {
		JPEGEditor j = new JPEGEditor();

		Image i = new Image();
		i.setType("png");

		Image i2 = new Image();
		i2.setType("jpeg");

		try {
			j.openImage(i);
			j.openImage(i2);
		} catch (GenericException | AdvancedImagesTypeException e) {
			e.printStackTrace();
		}
	}
}
