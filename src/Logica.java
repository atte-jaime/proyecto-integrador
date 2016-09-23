import java.util.ArrayList;
import java.io.File;
import processing.core.PApplet;

public class Logica {

	PApplet app;
	private ArrayList<Lista> listas;
	private ArrayList<Image> imagenes;
	private String[] path;
	private File file;

	Logica(PApplet app) {
		listas = new ArrayList<Lista>();
		imagenes = new ArrayList<Image>();
		this.app = app;

		file = new File("data/Images");
		path = file.list();
		for (int i = 0; i < path.length; i++) {
			System.out.println(path[i]);
		}
	}

	public void pintar() {

	}

	public void cargar() {

	}

	public void pressed() {

	}
}
