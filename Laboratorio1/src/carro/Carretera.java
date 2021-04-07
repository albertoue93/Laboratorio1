package carro;

import Maquinaria.IMaquinaria;

public class Carretera {
	
	/*private Carro carro;
	
	public Carretera(Carro carro) {
		this.carro = carro;
	
	public void runCar() {
		System.out.println("Autopista del Sol corre solo carros tipo: ");
		carro.print();
	}}*/
	
	private final IMaquinaria maquinaria;
	
	public Carretera(IMaquinaria maquinaria) {
		this.maquinaria = maquinaria;
		
	}
	
	public void runMaquinaria() {
		System.out.print("Autopista del Sol circula maquinarias de tipo: ");
		System.out.println(maquinaria.getMachineName());
	}
}
