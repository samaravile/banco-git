package Jogadas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.BufferedReader;

import Jogo.Jogador;
import Tabulerio.CarregaArquivo;
import TiposImoveis.Imovel;

/**
 * 
 * @author Samara Vilefort
 * @author Aline Camargos
 * 
 * @see LerArquivo
 *
 *<code>Jogadas</code> inicia o tabuleiro conforme cada jogada tendo consumidores para 
 *leitura do arquivo de jogadas. 
 *
 */

public class Jogadas {

	private int[][] Tabuleiro = new int[50][50];
	private int[][] Jogadas = new int[50][50];
	
	/**
	 * @author Samara Vilefort
	 * @author Aline Camargos
	 * Metodo para leitura do arquivo jogadas.
	 *
	 */
	
	public void lerjogadas() {
		
		
		File file = new File("jogadas4.txt");
		LerArquivo ler = new LerArquivo();
		ler.LerArquivo1(file);
		setJoggadas(ler.getTabuleiro());		
		System.out.println(Jogadas[1][2]);

	}

	
	public void setJoggadas(int[][] jogadas) {
		Jogadas = jogadas;
	}


	public void setTabuleiro(int[][] tabuleiro) {
		Tabuleiro = tabuleiro;
	}	
	
}
