package learning.dps.structural.adapter.imageEditorExample.exceptions;

public class AllImagesTypeException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6008579113151591574L;

	public AllImagesTypeException() {
		super("Supported image types are jpeg, png and tiff");
	}
}
