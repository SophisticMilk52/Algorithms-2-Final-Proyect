package hilos;

import mundo.IcesiMatch;

public class Popularinometro extends Thread{
	
	private IcesiMatch aplicacion;
	private int cual;
	
	public Popularinometro(IcesiMatch aplicacion, int cual) {
		this.aplicacion = aplicacion;
		this.cual = cual;
	}
	
	public void run() {
		aplicacion.popularidad(cual, aplicacion.getActual());
	}
}
