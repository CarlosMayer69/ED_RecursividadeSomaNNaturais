package controller;

public class SomaNaturaisController {

	public SomaNaturaisController() {
		super();
		
	}

	public int somaNaturais(int limite) {
		//Condi��o de Parada
		//if(limite == 0) {Conforme enunciado do exerc�cio, tem que mudar!
		//Por causa dos negativos! Digitou 0 ou negativo, segue o jogo!
		  if(limite <= 0) {
			return 0;
		} else {
			int proximo = limite - 1;	
			return limite + somaNaturais(proximo);
		}
	}
}
