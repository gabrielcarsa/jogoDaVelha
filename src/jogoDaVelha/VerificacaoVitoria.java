package jogoDaVelha;

public class VerificacaoVitoria extends Main{
	//Método para confirmar vitória
	public void verificarVitoria() {
		//Verificar vitória do Jogador 1
		if(p[0][0] == "X" && p[0][1] == "X" && p[0][2] == "X") {//1º coluna horizontal
			vitoriaPlayer1 =  true;
			System.out.println("\n## Vitória Jogador 1 ##\n\n");
		}else if(p[1][0] == "X" && p[1][1] == "X" && p[1][2] == "X") {//2º coluna horizontal
			vitoriaPlayer1 =  true;
			System.out.println("\n## Vitória Jogador 1 ##\n\n");
		}else if(p[2][0] == "X" && p[2][1] == "X" && p[2][2] == "X") {//3º coluna horizontal
			vitoriaPlayer1 =  true;
			System.out.println("\n## Vitória Jogador 1 ##\n\n");
		}else if(p[0][0] == "X" && p[1][0] == "X" && p[2][0] == "X") {//1º coluna vertical
			vitoriaPlayer1 =  true;
			System.out.println("\n## Vitória Jogador 1 ##\n\n");
		}else if(p[0][1] == "X" && p[1][1] == "X" && p[2][1] == "X") {//2º coluna vertical
			vitoriaPlayer1 =  true;
			System.out.println("\n## Vitória Jogador 1 ##\n\n");
		}else if(p[0][2] == "X" && p[1][2] == "X" && p[2][2] == "X") {//3º coluna vertical
			vitoriaPlayer1 =  true;
			System.out.println("\n## Vitória Jogador 1 ##\n\n");
		}else if(p[0][0] == "X" && p[1][1] == "X" && p[2][2] == "X") {//1º diagonal
			vitoriaPlayer1 =  true;
			System.out.println("\n## Vitória Jogador 1 ##\n\n");
		}else if(p[0][2] == "X" && p[1][1] == "X" && p[2][0] == "X") {//2º diagonal
			vitoriaPlayer1 =  true;
			System.out.println("\n## Vitória Jogador 1 ##\n\n");
		}		
		
		//Verificar vitória do Jogador 2
		if(p[0][0] == "O" && p[0][1] == "O" && p[0][2] == "O") {//1º coluna horizontal
			vitoriaPlayer2 =  true;
			System.out.println("\n## Vitória Jogador 2 ##\n\n");
		}else if(p[1][0] == "O" && p[1][1] == "O" && p[1][2] == "O") {//2º coluna horizontal
			vitoriaPlayer2 =  true;
			System.out.println("\n## Vitória Jogador 2 ##\n\n");
		}else if(p[2][0] == "O" && p[2][1] == "O" && p[2][2] == "O") {//3º coluna horizontal
			vitoriaPlayer2 =  true;
			System.out.println("\n## Vitória Jogador 2 ##\n\n");
		}else if(p[0][0] == "O" && p[1][0] == "O" && p[2][0] == "O") {//1º coluna vertical
			vitoriaPlayer2 =  true;
			System.out.println("\n## Vitória Jogador 2 ##\n\n");
		}else if(p[0][1] == "O" && p[1][1] == "O" && p[2][1] == "O") {//2º coluna vertical
			vitoriaPlayer2 =  true;
			System.out.println("\n## Vitória Jogador 2 ##\n\n");
		}else if(p[0][2] == "O" && p[1][2] == "O" && p[2][2] == "O") {//3º coluna vertical
			vitoriaPlayer2 =  true;
			System.out.println("\n## Vitória Jogador 2 ##\n\n");
		}else if(p[0][0] == "O" && p[1][1] == "O" && p[2][2] == "O") {//1º diagonal
			vitoriaPlayer2 =  true;
			System.out.println("\n## Vitória Jogador 2 ##\n\n");
		}else if(p[0][2] == "O" && p[1][1] == "O" && p[2][0] == "O") {//2º diagonal
			vitoriaPlayer2 =  true;
			System.out.println("\n## Vitória Jogador 2 ##\n\n");
		}
	}
}
