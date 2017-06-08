package Execucao;

import Jogadas.Jogadas;
import Tabulerio.CarregaArquivo;


/**
 * 
 * @author Samara Vilefort
 * @author Aline Camargos
 * 
 * @see CarregaArquivo
 * @see Jogadas
 *
 *<code>Jogar</code> invoca outras funções com informações necessárias como: jogadas e jogadores.
 *Verifica o arquivo de posições e de jogadores para formar o tabuleiro.
 */

public class Jogar {
	
	/**
	 * Inicia todo o jogo, lendo os arquivos tabuleiro e jogadas.
	 * @author Samara Vilefort
	 * @author Aline Camargos
	 * 
	 * @see CarregaArquivo arquivo instanciado do tabuleiro.
	 * @see Jogadas arquivo instanciado das jogadas.
	 */
	
	public void start() {
		CarregaArquivo c = new CarregaArquivo();
		c.CriarTabuleiro();
		c.verTabuleiro();		
		Jogadas j = new Jogadas();
		j.lerjogadas();
	}

}
