package jogoDaVelha;

public class VerificacaoVitoria extends Main{
	//M�todo para confirmar vit�ria
	public void verificarVitoria() {
		//Verificar vit�ria do Jogador 1
		if(p[0][0] == "X" && p[0][1] == "X" && p[0][2] == "X") {//1� coluna horizontal
			vitoriaPlayer1 =  true;
			System.out.println("\n## Vit�ria Jogador 1 ##\n\n");
		}else if(p[1][0] == "X" && p[1][1] == "X" && p[1][2] == "X") {//2� coluna horizontal
			vitoriaPlayer1 =  true;
			System.out.println("\n## Vit�ria Jogador 1 ##\n\n");
		}else if(p[2][0] == "X" && p[2][1] == "X" && p[2][2] == "X") {//3� coluna horizontal
			vitoriaPlayer1 =  true;
			System.out.println("\n## Vit�ria Jogador 1 ##\n\n");
		}else if(p[0][0] == "X" && p[1][0] == "X" && p[2][0] == "X") {//1� coluna vertical
			vitoriaPlayer1 =  true;
			System.out.println("\n## Vit�ria Jogador 1 ##\n\n");
		}else if(p[0][1] == "X" && p[1][1] == "X" && p[2][1] == "X") {//2� coluna vertical
			vitoriaPlayer1 =  true;
			System.out.println("\n## Vit�ria Jogador 1 ##\n\n");
		}else if(p[0][2] == "X" && p[1][2] == "X" && p[2][2] == "X") {//3� coluna vertical
			vitoriaPlayer1 =  true;
			System.out.println("\n## Vit�ria Jogador 1 ##\n\n");
		}else if(p[0][0] == "X" && p[1][1] == "X" && p[2][2] == "X") {//1� diagonal
			vitoriaPlayer1 =  true;
			System.out.println("\n## Vit�ria Jogador 1 ##\n\n");
		}else if(p[0][2] == "X" && p[1][1] == "X" && p[2][0] == "X") {//2� diagonal
			vitoriaPlayer1 =  true;
			System.out.println("\n## Vit�ria Jogador 1 ##\n\n");
		}		
		
		//Verificar vit�ria do Jogador 2
		if(p[0][0] == "O" && p[0][1] == "O" && p[0][2] == "O") {//1� coluna horizontal
			vitoriaPlayer2 =  true;
			System.out.println("\n## Vit�ria Jogador 2 ##\n\n");
		}else if(p[1][0] == "O" && p[1][1] == "O" && p[1][2] == "O") {//2� coluna horizontal
			vitoriaPlayer2 =  true;
			System.out.println("\n## Vit�ria Jogador 2 ##\n\n");
		}else if(p[2][0] == "O" && p[2][1] == "O" && p[2][2] == "O") {//3� coluna horizontal
			vitoriaPlayer2 =  true;
			System.out.println("\n## Vit�ria Jogador 2 ##\n\n");
		}else if(p[0][0] == "O" && p[1][0] == "O" && p[2][0] == "O") {//1� coluna vertical
			vitoriaPlayer2 =  true;
			System.out.println("\n## Vit�ria Jogador 2 ##\n\n");
		}else if(p[0][1] == "O" && p[1][1] == "O" && p[2][1] == "O") {//2� coluna vertical
			vitoriaPlayer2 =  true;
			System.out.println("\n## Vit�ria Jogador 2 ##\n\n");
		}else if(p[0][2] == "O" && p[1][2] == "O" && p[2][2] == "O") {//3� coluna vertical
			vitoriaPlayer2 =  true;
			System.out.println("\n## Vit�ria Jogador 2 ##\n\n");
		}else if(p[0][0] == "O" && p[1][1] == "O" && p[2][2] == "O") {//1� diagonal
			vitoriaPlayer2 =  true;
			System.out.println("\n## Vit�ria Jogador 2 ##\n\n");
		}else if(p[0][2] == "O" && p[1][1] == "O" && p[2][0] == "O") {//2� diagonal
			vitoriaPlayer2 =  true;
			System.out.println("\n## Vit�ria Jogador 2 ##\n\n");
		}
	}
}
