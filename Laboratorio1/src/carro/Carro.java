package carro;

import Maquinaria.IMaquinaria;

public abstract class Carro implements IMaquinaria {

	//Inmutable
	public final void print() {
		System.out.println(tipo());
	}
}
