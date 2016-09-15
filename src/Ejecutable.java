import processing.core.PApplet;

public class Ejecutable extends PApplet {

	public static void main(String[] args) {
		Ejecutable.main("Ejecutable");

	}

	Logica log;

	public void settings() {
		fullScreen();
	}

	public void setup() {
		log = new Logica(this);
	}

	public void draw() {
		background(255);
		log.pintar();
	}

	public void mousePressed() {
		log.pressed();
	}
}
