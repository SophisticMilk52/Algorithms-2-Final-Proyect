package mundo;

import excepciones.PopularException;

import excepciones.SexualidadException;

import excepciones.SolitarioException;

public interface IEmparejable {

	public void emparejar(Usuario pareja) throws PopularException, SexualidadException, SolitarioException, NullPointerException;
}
