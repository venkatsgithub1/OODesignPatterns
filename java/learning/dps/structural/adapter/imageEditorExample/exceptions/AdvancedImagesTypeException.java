package learning.dps.structural.adapter.imageEditorExample.exceptions;

public class AdvancedImagesTypeException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -319004309413238239L;

	public AdvancedImagesTypeException() {
		super("Supported image types are png and tiff");
	}
}
