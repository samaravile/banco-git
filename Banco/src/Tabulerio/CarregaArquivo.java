package Tabulerio;

import java.io.File;
import java.util.ArrayList;

import TiposImoveis.Comercio;
import TiposImoveis.Hospital;
import TiposImoveis.Hotel;
import TiposImoveis.Imovel;
import TiposImoveis.Industria;
import TiposImoveis.Nulo;
import TiposImoveis.Residencia;

/**
 * 
 * @author Samara Vilefort
 * @author Aline Camargos
 * 
 * @see LerArquivo ler aquivo passado como referência.
 * @see Comercio objeto a ser adicionado no tabuleiro.
 * @see Hospital objeto a ser adicionado no tabuleiro.
 * @see Hotel objeto a ser adicionado no tabuleiro.
 * @see Imovel objeto a ser adicionado no tabuleiro.
 * @see Industria objeto a ser adicionado no tabuleiro.
 * @see Nulo objeto a ser adicionado no tabuleiro.
 * @see Residencia objeto a ser adicionado no tabuleiro.
 * @see CarregaArquivo retorna todo o tabuleiro.
 * 
 * <code>Tabuleiro</code>: é adicionado imoveis e jogadores para iniciar o jogo. 
 * Sua leitura são por objetos consumidores e a parte produtora as jogadas de 
 * casa jogador. É feito uma comparação seguindo uma regra para adicionar imoveis 
 * na sua posição correta. 
 */

public class CarregaArquivo {

	/**
	 * Instancia de imoveis no tabuleiro.
	 */
	
	private ArrayList<Imovel> listaImovel = new ArrayList<Imovel>();
	
	/**
	 * Tabuleiro como matriz.
	 */
	
	private int[][] Tabuleiro = new int[50][50];
	
	public int[][] getNumeroTabuleiro() {
		return Tabuleiro;
	}
	
	/**
	 * @author Samara Vilefort
	 * @author Aline Camargos
	 * 
	 * Inicia os imoveis e tabuleiro sendo o tabuleiro uma matriz passado pelo arquivo.
	 * Todas as comparações são feitas no if else até a coluna 3 onde referencia que começa, passa a vez e imovel
	 * para inicio e instancia dos jogadores.
	 */
	
	public void CriarTabuleiro() {
		File file = new File("tabuleiro1.txt");
		LerArquivo ler = new LerArquivo();
		ler.LerArquivo1(file);
		Tabuleiro = ler.getTabuleiro();
		int Imovel = 0;
		int tabuleiro = 1;
		int n = Tabuleiro[0][0];
		for (int i = 1; i <= n; i++) {
			if (Tabuleiro[i][3] == 1) {
				AddResidencia(tabuleiro, Imovel);
				Imovel++;
				tabuleiro++;

			} else if (Tabuleiro[i][3] == 2) {
				AddComercio(tabuleiro, Imovel);
				tabuleiro++;
				Imovel++;

			} else if (Tabuleiro[i][3] == 3) {
				AddIndustria(tabuleiro, Imovel);
				Imovel++;
				tabuleiro++;

			} else if (Tabuleiro[i][3] == 4) {
				AddHotel(tabuleiro, Imovel);
				Imovel++;
				tabuleiro++;

			} else if (Tabuleiro[i][3] == 5) {
				AddHospital(tabuleiro, Imovel);
				Imovel++;
				tabuleiro++;

			} else if (Tabuleiro[i][3] == 0) {
				AddVazio(tabuleiro, Imovel);
				Imovel++;
				tabuleiro++;

			}
		}
	}

	/**
	 * @author Samara Vilefort
	 * @author Aline Camargos
	 * 
	 * Para visualizar o tabuleiro com suas devidas instancias.
	 */
	
	public void verTabuleiro() {

		for (int i = 0; i < listaImovel.size(); i++) {
			System.out.println(listaImovel.get(i).getNome());
		}
	}
	
	/**
	 * @author Samara Vilefort
	 * @author Aline Camargos
	 * 
	 * Instanciando Residecia no tabuleiro.
	 * @param tabuleiro
	 * @param Imovel
	 */
	
	private void AddResidencia(int tabuleiro, int Imovel) {
		listaImovel.add(new Residencia());
		listaImovel.get(Imovel).setPreco(Tabuleiro[tabuleiro][4]);
		listaImovel.get(Imovel).setPosImovel(Tabuleiro[tabuleiro][2]);
		listaImovel.get(Imovel).setTaxa((Tabuleiro[tabuleiro][5] * Tabuleiro[tabuleiro][4]) / 100);

	}
	
	/**
	 * @author Samara Vilefort
	 * @author Aline Camargos
	 * 
	 * Instanciando Comercio no tabuleiro.
	 * @param tabuleiro
	 * @param Imovel
	 */

	private void AddComercio(int tabuleiro, int Imovel) {
		listaImovel.add(new Comercio());
		listaImovel.get(Imovel).setPreco(Tabuleiro[tabuleiro][4]);
		listaImovel.get(Imovel).setPosImovel(Tabuleiro[tabuleiro][2]);
		listaImovel.get(Imovel).setTaxa((Tabuleiro[tabuleiro][5] * Tabuleiro[tabuleiro][4]) / 100);
	}
	
	/**
	 * @author Samara Vilefort
	 * @author Aline Camargos
	 * 
	 * Instanciando Industria no tabuleiro.
	 * @param tabuleiro
	 * @param Imovel
	 */

	private void AddIndustria(int tabuleiro, int Imovel) {
		listaImovel.add(new Industria());
		listaImovel.get(Imovel).setPreco(Tabuleiro[tabuleiro][4]);
		listaImovel.get(Imovel).setPosImovel(Tabuleiro[tabuleiro][2]);
		listaImovel.get(Imovel).setTaxa((Tabuleiro[tabuleiro][5] * Tabuleiro[tabuleiro][4]) / 100);
	}
	
	/**
	 * @author Samara Vilefort
	 * @author Aline Camargos
	 * 
	 * Instanciando Hotel no tabuleiro.
	 * @param tabuleiro
	 * @param Imovel
	 */

	private void AddHotel(int tabuleiro, int Imovel) {
		listaImovel.add(new Hotel());
		listaImovel.get(Imovel).setPreco(Tabuleiro[tabuleiro][4]);
		listaImovel.get(Imovel).setPosImovel(Tabuleiro[tabuleiro][2]);
		listaImovel.get(Imovel).setTaxa((Tabuleiro[tabuleiro][5] * Tabuleiro[tabuleiro][4]) / 100);
	}
	
	/**
	 * @author Samara Vilefort
	 * @author Aline Camargos
	 * 
	 * Instanciando Hospital no tabuleiro.
	 * @param tabuleiro
	 * @param Imovel
	 */

	private void AddHospital(int tabuleiro, int Imovel) {
		listaImovel.add(new Hospital());
		listaImovel.get(Imovel).setPreco(Tabuleiro[tabuleiro][4]);
		listaImovel.get(Imovel).setPosImovel(Tabuleiro[tabuleiro][2]);
		listaImovel.get(Imovel).setTaxa((Tabuleiro[tabuleiro][5] * Tabuleiro[tabuleiro][4]) / 100);
	}
	
	/**
	 * @author Samara Vilefort
	 * @author Aline Camargos
	 * 
	 * Instanciando Vazio no tabuleiro.
	 * @param tabuleiro
	 * @param Imovel
	 */

	private void AddVazio(int k, int Imovel) {
		listaImovel.add(new Nulo());
		listaImovel.get(Imovel).setPosImovel(Tabuleiro[k][2]);
	}

}
