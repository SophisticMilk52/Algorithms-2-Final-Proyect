package hilos;

import interfaz.Principal;
import mundo.Cuadrito;

public class HiloMueve extends Thread {
private Principal  pri;
private Cuadrito c;
	public HiloMueve(Principal fi, Cuadrito c) {
		this.c=c;
		pri=fi;
	
}
	public void run() {
		while (true) {
			try {
				c.moverse(5);
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
