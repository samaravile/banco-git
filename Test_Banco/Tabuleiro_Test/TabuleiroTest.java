package Tabuleiro_Test;
import static org.junit.Assert.*;
import java.io.*;

import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Tabulerio.CarregaArquivo;
import Tabulerio.LerArquivo;
import Jogadas.Jogadas;

public class TabuleiroTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void VerificaPosicoes() {
		File file = new File("tabuleiro1.txt");
		LerArquivo ler = new LerArquivo();
		ler.LerArquivo1(file);
		int[][] Tabuleiro = new int[50][50];
		Tabuleiro = ler.getTabuleiro();
		if(Tabuleiro != null){
			assertTrue(true);
		} else {
			assertTrue(false);
		}
	}
	
	@Test
	public void VerificaTamanho() {
		File file = new File("tabuleiro1.txt");
		LerArquivo ler = new LerArquivo();
		ler.LerArquivo1(file);
		int[][] Tabuleiro = new int[50][50];
		for (int i = 1; i > 2501; i++) {
			assertTrue(false);
		}
	}
}
