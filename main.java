
public class main {
	public static void main(String[] args) {
		ImageViewer Image1 = new ImageViewerProxy("Allman foto");
		System.out.println(" Image1 [" + Image1 + "] calling displayImage once");
		Image1.displayImage();
		System.out.println(" Image1 [" + Image1 + "] calling displayImage once");
		Image1.displayImage();
	}

}
