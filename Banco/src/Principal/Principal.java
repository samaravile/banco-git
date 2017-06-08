package Principal;

import Execucao.Jogar;
import Jogadas.Jogadas;
import Tabulerio.CarregaArquivo;


/**

 * @author Samara Vilefort
 * @author Aline Camargos
 * 
 * @version 1.1
 * @since 1.0
 * 
 * <code>Principal</code> é responsável pela execução do objetivo principal do programa 
 * proposto. Sendo assim, possui uma ligação com demais objetos para o foco principal.
 * 
 * @see Jogar função com as funções para iniciar o jogo.
 * 
 */

public class Principal {

	public static void main(String[] args) {
		
		Jogar x = new Jogar();
		x.start();		
		
	}
}
