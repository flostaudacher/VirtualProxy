public class ImageViewerProxy implements ImageViewer {

    private ConcreteImageViewer image = null;
    private String filename = null;
    
    public ImageViewerProxy(final String FILENAME) {
    	filename = FILENAME;
    }
    public void displayImage() {
    	if (image == null ) {
    		image = new ConcreteImageViewer(filename);
    	}
    	image.displayImage();
    }
}