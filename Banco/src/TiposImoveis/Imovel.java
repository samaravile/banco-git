package TiposImoveis;

import com.sun.accessibility.internal.resources.accessibility;

/** 
* @author Samara Vilefort
*@author Aline Camargos
*
*<code>Imovel</code> identifica tudo o que o Imovel possui com referência nas variáveis. 
*Apresenta um elo entre os consumidores e produtores de informação. Os consumidores leem a 
*informação do arquivo para fazer o processamento e as produtoras compartilham a informação.
*
*/

public class Imovel {
	
	private String nome;
	private double preco;
	private double taxa;
	private int posImovel;
	
	public String getNome() {
		return nome;
	}

	
	public double getPreco() {
		return preco;
	}

	
	public double getTaxa() {
		return taxa;
	}

	
	public int getPosImovel() {
		return posImovel;
	}

	
	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public void setPreco(double preco) {
		this.preco = preco;
	}

	
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	
	public void setPosImovel(int posImovel) {
		this.posImovel = posImovel;
	}
	
}	

