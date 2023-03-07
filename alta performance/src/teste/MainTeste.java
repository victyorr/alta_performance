package teste;

import pilhas.PilhasInt;

public class MainTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PilhasInt pilha = new PilhasInt();
		
		pilha.init();
		
		pilha.push(10);
		pilha.push(12);
		
		System.out.println("Valor retirado da pilha "+pilha.pop());
		System.out.println("Valor retirado da pilha "+pilha.pop());

		
		
	}

}
