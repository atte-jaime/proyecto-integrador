import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.File;
import processing.core.PApplet;
import processing.core.PImage;

public class Logica {

	PApplet app;
	private ArrayList<Lista> listas;
	private ArrayList<Image> imagenes;
	private String[] list;
	private String[] separar;
	private String folder;
	private File file;
	private PImage[] images;
	private Image selectedImg;

	Logica(PApplet app) {
		listas = new ArrayList<Lista>();
		imagenes = new ArrayList<Image>();
		this.app = app;
		file = new File("data/images");
		list = file.list();
		folder = file.getPath();
		images = new PImage[list.length];

		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);

			separar = list[i].split("\\.");
			listas.add(new Lista(separar[0]));
			images[i] = this.app.loadImage(folder + "/" + list[i]);
		}
		// System.out.println(separar.length);
	}

	public void pintar() {
		for (int i = 0; i < listas.size(); i++) {
			listas.get(i).pintar(app, 20, 20 + (20 * i));
		}
		// JAime se encarga de terminar la clase de imagenes
		for (int i = 0; i < imagenes.size(); i++) {
		}
	}

	// cuando se de click en el botón de actualizar, la lista cambiará si se ha
	// agragado una nueva imagen a la carpeta images

	public void actualizar() {

	}

	public void cargar() {

	}

	public void pressed() {

	}
}
