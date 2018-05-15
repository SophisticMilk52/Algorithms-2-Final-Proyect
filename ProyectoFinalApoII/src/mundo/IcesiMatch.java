package mundo;

import java.util.Comparator;

public class IcesiMatch implements Comparator<Usuario>{
	
	private Usuario[] inicios;
	private Usuario actual;
	private Usuario pareja;
	
	public IcesiMatch() {
		inicios = new Usuario[3];
	}

	public Usuario[] getInicios() {
		return inicios;
	}

	public void setInicios(Usuario[] inicios) {
		this.inicios = inicios;
	}

	public Usuario getActual() {
		return actual;
	}

	public void setActual(Usuario actual) {
		this.actual = actual;
	}

	public Usuario getPareja() {
		return pareja;
	}

	public void setPareja(Usuario pareja) {
		this.pareja = pareja;
	}

	public Usuario buscar(int cual, Usuario actual, String quien) {
		return null;
	}

	@Override
	public int compare(Usuario u1, Usuario u2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
