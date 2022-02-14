package jogoDaVelha;

public class PlayerVsPlayer extends Main{
	//Método que recebe a posição que irá ser jogada
	public void Posicao(int player) {
		//Variável para verificar se está tudo OK
		boolean verifica = false;
		
		do {
			if(player == 1) {
				System.out.print("\nJOGADOR 1 - Insira a linha de 0 a 2 para jogar: ");		
				linha = entrada.nextInt();
				
				System.out.print("\nJOGADOR 1 - Insira a coluna de 0 a 2 para jogar: ");		
				coluna = entrada.nextInt();
				
				if(coluna > 2 || coluna < 0 || linha > 2 || linha < 0) {//Verifica se jogador está jogando em campos válidos
					verifica = false;
					System.out.println("Posição Inválida! Jogue novamente");
				}else if(p[linha][coluna] == "X" || p[linha][coluna] == "O"){//Verifica se jogador está jogando em campos ainda não preenchidos
					verifica = false;
					System.out.println("Posição já usada!");
				}else {
					verifica = true;
				}
			}else {
				System.out.print("\nJOGADOR 2 - Insira a linha de 0 a 2 para jogar: ");		
				linha = entrada.nextInt();
				
				System.out.print("\nJOGADOR 2 - Insira a coluna de 0 a 2 para jogar: ");		
				coluna = entrada.nextInt();
				
				if(coluna > 2 || coluna < 0 || linha > 2 || linha < 0) {//Verifica se jogador está jogando em campos válidos
					verifica = false;
					System.out.println("Posição Inválida! Jogue novamente");
				}else if(p[linha][coluna] == "X" || p[linha][coluna] == "O"){//Verifica se jogador está jogando em campos ainda não preenchidos
					verifica = false;
					System.out.println("Posição já usada!");
				}else {
					verifica = true;
				}
			}
			
		}while(verifica == false);//Enquanto for falsa continuará dentro do loop
	
	}
	
	//Método que irá marcar posições e exibir o tabuleiro do Player 1
		public void JogadaPlayer1() {
			//Laço para exibir tabuleiro
	        for(int i = 0; i < 3; i++) {
	        	for(int j = 0; j < 3; j++) {
	        		//Armazena a jogada marcando o campo
	            	if(linha == i && coluna == j) {
	            		p[i][j] = "X";
	            	}
	            	
	            	//Se o campo estiver marcado...
	            	if(p[i][j] == "X") {
	            		System.out.print(" X |");
	            	}else if(p[i][j] == "O"){
	            		System.out.print(" O |");
	            	}else {
	            		System.out.print("   |");
	            	}
				}
	        	//Exibe linha horizontais do tabuleiro
	        	System.out.println("\n-------------");
	        }
			
		}
		
		//Método que irá marcar posições e exibir o tabuleiro do Player 2
		public void JogadaPlayer2() {
			//Laço para exibir tabuleiro
			for(int i = 0; i < 3; i++) {
	        	for(int j = 0; j < 3; j++) {
	        		//Armazena a jogada marcando o campo
	            	if(linha == i && coluna == j) {
	            		p[i][j] = "O";
	            	}
	            	
	            	//Se o campo estiver marcado...
	            	if(p[i][j] == "X") {
	            		System.out.print(" X |");
	            	}else if(p[i][j] == "O"){
	            		System.out.print(" O |");
	            	}else {
	            		System.out.print("   |");
	            	}
				}
	        	//Exibe linha horizontais do tabuleiro
	        	System.out.println("\n-------------");
	        }
		}
}
