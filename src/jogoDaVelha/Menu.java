package jogoDaVelha;

public class Menu extends Main{
	
	//M�todo para Exibir Menu
	public int Exibir() {
		int op;
		System.out.println("## JOGO DA VELHA ##");
		System.out.println("1 - Como Funciona? ");
		System.out.println("2 - Jogar VS Computador");
		System.out.println("3 - Jogar VS Player");
		System.out.println("4 - Sair do jogo");
		System.out.print("## Selecione alguma op��o: ");
		op = entrada.nextInt();
		
		return op;
	}
	
	//M�todo para exibir funcionamento do tabuleiro
	public void ComoFunciona() {
		System.out.println("         Coluna 0  Coluna 1  Coluna 2");
		System.out.println("Linha 0:  [0][0] | [0][1] | [0][2]");
		System.out.println("          -------------------------");
		System.out.println("Linha 1:  [1][0] | [1][1] | [1][2]");
		System.out.println("          -------------------------");
		System.out.println("Linha 2:  [2][0] | [2][1] | [2][2]");
		System.out.println("\n## Voc� ir� escolher a linha e coluna para jogar## \n## De 0 at� 2 n�o valendo posi��es repetidas ##\n\n");
	}
}
