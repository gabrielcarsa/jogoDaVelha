package jogoDaVelha;

import java.util.Scanner;
import java.util.Random;

public class Main {
	//Criando nova vari�vel de entrada
	public static Scanner entrada = new Scanner(System.in);
	
	//inst�ncia um objeto da classe Random usando o construtor padr�o
	public static Random gerador = new Random();
	
	//Receber� a posi��o que o jogador ir� jogar
	public static int linha, coluna;
	
	//Vari�vel que verifica vit�ria
	public static boolean vitoriaPlayer1 = false, vitoriaPlayer2 = false;
	
	//Vetor para marcar as posi��es jogadas
	public static String p[][] = new String[3][3];
	
	//Chamando Classe Menu
	public static Menu menuJogo = new Menu();
	
	//Chamando Classe PlayerVsComputador
	public static PlayerVsComputador P1VsPC = new PlayerVsComputador();
	
	//Chamando Classe PlayerVsComputador
	public static PlayerVsPlayer P1VsP2 = new PlayerVsPlayer();
	
	//Chamando Classe para VerificarVitoria
	public static VerificacaoVitoria verificar = new VerificacaoVitoria();
	
	//M�todo para limpar valores de vari�veis
	public static void limparValores() {
		//Reiniciando Vari�veis ap�s fim de jogo
		vitoriaPlayer1 = false;
		vitoriaPlayer2 = false;

		for(int i = 0; i < 3; i++) {
	       for(int j = 0; j < 3; j++) {
	        	p[i][j] = "";
	       }
	    }
	}
	
	public static void main(String[] args) {
		
		int player, i = 0, op;	
		
		do {
			op = menuJogo.Exibir();
			switch(op) {
				case 1: 
					menuJogo.ComoFunciona();
					break;
				case 2:
					//Jogo: Player VS Computados
					do{
						//Sempre Player 1 come�a
						if(i%2 == 0) {
							player = 1;
							P1VsPC.Posicao(player);//Chamando m�todo para pegar posi��o
							P1VsPC.JogadaPlayer1();//Chamando m�todo para jogar na posi��o
						}else {
							System.out.println("\nJOGADOR 2 - Jogando... ");	
							player = 2;
							P1VsPC.Posicao(player);
							P1VsPC.JogadaPlayer2();
						}
						//Verificar sempre aos fins de jogadas poss�veis vit�rias
						verificar.verificarVitoria();
						
						i++;
					}while(vitoriaPlayer1 == false && vitoriaPlayer2 == false && i < 9);
					
					//Verifica se deu Velha
					if(vitoriaPlayer1 == false && vitoriaPlayer2 == false) {
						System.out.println("\n## Deu Velha ##\n");
					}
					
					limparValores();
					i = 0;
					break;
				case 3:
					//Jogo: Player VS Player
					do{
						//Sempre Player 1 come�a
						if(i%2 == 0) {
							player = 1;
							P1VsP2.Posicao(player);//Chamando m�todo para pegar posi��o
							P1VsP2.JogadaPlayer1();//Chamando m�todo para jogar na posi��o
						}else {
							player = 2;
							P1VsP2.Posicao(player);
							P1VsP2.JogadaPlayer2();
						}
						//Verificar sempre aos fins de jogadas poss�veis vit�rias
						verificar.verificarVitoria();
						
						i++;
					}while(vitoriaPlayer1 == false && vitoriaPlayer2 == false && i < 9);
					
					//Verifica se deu Velha
					if(vitoriaPlayer1 == false && vitoriaPlayer2 == false) {
						System.out.println("\n## Deu Velha ##\n");
					}
					
					limparValores();
					i = 0;
					break;
				case 4:
					System.out.println("\n ## Saindo... ##\n");
					break;
				default:
					System.out.print("## Op��o Inv�lida... ## \n ## Menu ser� exibido novamente ##");
					op = menuJogo.Exibir();
					break;
			}
		}while(op != 4);
		
		System.out.println("Fim!");
	}

}
