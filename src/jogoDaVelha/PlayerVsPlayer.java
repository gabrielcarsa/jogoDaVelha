package jogoDaVelha;

public class PlayerVsPlayer extends Main{
	//M�todo que recebe a posi��o que ir� ser jogada
	public void Posicao(int player) {
		//Vari�vel para verificar se est� tudo OK
		boolean verifica = false;
		
		do {
			if(player == 1) {
				System.out.print("\nJOGADOR 1 - Insira a linha de 0 a 2 para jogar: ");		
				linha = entrada.nextInt();
				
				System.out.print("\nJOGADOR 1 - Insira a coluna de 0 a 2 para jogar: ");		
				coluna = entrada.nextInt();
				
				if(coluna > 2 || coluna < 0 || linha > 2 || linha < 0) {//Verifica se jogador est� jogando em campos v�lidos
					verifica = false;
					System.out.println("Posi��o Inv�lida! Jogue novamente");
				}else if(p[linha][coluna] == "X" || p[linha][coluna] == "O"){//Verifica se jogador est� jogando em campos ainda n�o preenchidos
					verifica = false;
					System.out.println("Posi��o j� usada!");
				}else {
					verifica = true;
				}
			}else {
				System.out.print("\nJOGADOR 2 - Insira a linha de 0 a 2 para jogar: ");		
				linha = entrada.nextInt();
				
				System.out.print("\nJOGADOR 2 - Insira a coluna de 0 a 2 para jogar: ");		
				coluna = entrada.nextInt();
				
				if(coluna > 2 || coluna < 0 || linha > 2 || linha < 0) {//Verifica se jogador est� jogando em campos v�lidos
					verifica = false;
					System.out.println("Posi��o Inv�lida! Jogue novamente");
				}else if(p[linha][coluna] == "X" || p[linha][coluna] == "O"){//Verifica se jogador est� jogando em campos ainda n�o preenchidos
					verifica = false;
					System.out.println("Posi��o j� usada!");
				}else {
					verifica = true;
				}
			}
			
		}while(verifica == false);//Enquanto for falsa continuar� dentro do loop
	
	}
	
	//M�todo que ir� marcar posi��es e exibir o tabuleiro do Player 1
		public void JogadaPlayer1() {
			//La�o para exibir tabuleiro
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
		
		//M�todo que ir� marcar posi��es e exibir o tabuleiro do Player 2
		public void JogadaPlayer2() {
			//La�o para exibir tabuleiro
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
