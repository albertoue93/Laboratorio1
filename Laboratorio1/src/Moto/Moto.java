package Moto;

import Maquinaria.IMaquinaria;

public abstract class Moto implements IMaquinaria {

	public final void print() {
		System.out.println(tipo());
	}

}
