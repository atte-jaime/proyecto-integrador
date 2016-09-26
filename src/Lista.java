import processing.core.PApplet;

public class Lista {

	private int posX, posY;
	private String name;

	public Lista(String name) {
		this.name = name;
	}

	public void pintar(PApplet app, int x, int y) {
		posX = x;
		posY = y;
		app.fill(0);
		app.text(name, posX, posY);
		app.noFill();
		selected(app, posX, posY);
	}

	public void selected(PApplet app, int posX, int posY) {
		app.fill(0);
		app.ellipse(posX - 10, posY - 5, 5, 5);
		app.noFill();
	}

	public void cargar() {

	}
}
