import javax.swing.ImageIcon;

public class ConcreteImageViewer implements ImageViewer {

	private String filename = null;
	public ConcreteImageViewer(final String FILENAME) {
		filename = FILENAME;
		loadImageFromDisk();
	}
	private void loadImageFromDisk() {
		// TODO Auto-generated method stub
		System.out.println("Loading " + filename);
	}
	public void displayImage() {
		System.out.println("Displaying " + filename + "\n");
	}
}