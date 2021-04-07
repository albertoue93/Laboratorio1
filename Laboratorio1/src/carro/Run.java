package carro;

import Moto.Ducati;
import Moto.Moto;
import Moto.Ninja;

public class Run {

	public static void main(String[] args) {
		new Carretera(createCarFactory(CarType.SEDAN)).runMaquinaria();
		new Carretera(createCarFactory(CarType.PICKUP)).runMaquinaria();
		new Carretera(createMotoFactory(MotoType.NINJA)).runMaquinaria();
		new Carretera(createMotoFactory(MotoType.DUCATI)).runMaquinaria();
	}
	
	//single responsability 
	public static Carro createCarFactory(CarType type) {
		if (type.equals(CarType.SEDAN)) {
			return new Sedan();
		}
		return new Pickup();
	}
	
	public static Moto createMotoFactory(MotoType type) {
		if (type.equals(MotoType.NINJA)) {
			return new Ninja();
		}
		return new Ducati();
	}
	
	private enum CarType{
		SEDAN,
		PICKUP
	}
	
	private enum MotoType{
		NINJA,
		DUCATI
	}

}
