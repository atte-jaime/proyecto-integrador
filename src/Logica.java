import java.util.ArrayList;
import java.io.File;
import processing.core.PApplet;
import processing.core.PImage;

public class Logica {

	PApplet app;
	private ArrayList<Lista> listas;
	private ArrayList<Image> imagenes;
	private String[] list;
	private String folder;
	private File file;
	private PImage[] images;

	Logica(PApplet app) {
		listas = new ArrayList<Lista>();
		imagenes = new ArrayList<Image>();
		this.app = app;
		
		file = new File("data/images");
		list = file.list();
		folder = file.getPath();
		images = new PImage[list.length];
		//System.out.println(folder);
		//System.out.println(list.length);
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
			images[i]=this.app.loadImage(folder+"/"+list[i]);
		}
	}

	public void pintar() {

	}

	public void cargar() {

	}

	public void pressed() {

	}
}
