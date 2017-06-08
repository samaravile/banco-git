package Jogo;

import com.sun.accessibility.internal.resources.accessibility;

/**
 * 
 *@author Samara Vilefort
 *@author Aline Camargos
 *
 *<code>Jogador</code> identifica tudo o que o jogador possui com referência nas variáveis. 
 *Apresenta um elo entre os consumidores e produtores de informação. Os consumidores leem a 
 *informação do arquivo para fazer o processamento e as produtoras compartilham a informação.
 *
 */

public class Jogador {
	
	public int identificador;
	public String nome;
	public int quantidade = 5;
	public double saldo = 20000.00;
	public int posicao; 
	
	public Jogador () {
		/**
		 * Construtor.
		 */
	}

	
	public double getSaldo() {
		return saldo;
	}

	
	public String getNome() {
		return nome;
	}

	
	public int getQuantidade() {
		return quantidade;
	}

	
	public int getIdentificador() {
		return identificador;
	}

	
	public int getPosicao() {
		return posicao;
	}

	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}	


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}	


	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}


	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}

}
