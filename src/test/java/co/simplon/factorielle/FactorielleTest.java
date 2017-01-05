package co.simplon.factorielle;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FactorielleTest {


	@Test
	public void factorielle_de_1_doit_renvoyer_1() { //calculerfactorielle
		
		//etant donné = given
		Factorielle factorielle = new Factorielle();
		long entier = 1; //resultat attendu
		
		//executer = when
		long resultat = factorielle.calculer(entier);
		
		//verifier = then
		assertEquals(1, resultat);
		
	}
	
	@Test
	public void factorielle_de_2_doit_renvoyer_2() {
		
		Factorielle factorielle = new Factorielle() ; 
		long entier = 2;
		
		long resultat = factorielle.calculer(entier);
		
		assertEquals(2, resultat);
	
	}

	@Test
	public void factorielle_de_0_doit_renvoyer_1() {
	
		Factorielle factorielle = new Factorielle() ;
		long entier = 0;
		
		long resultat = factorielle.calculer(entier);
		
		assertEquals(1, resultat);
	
}
	@Test
	public void factorielle_de_3_doit_renvoyer_6() {
	
		Factorielle factorielle = new Factorielle() ; //méthode plus rapide
	

		assertEquals(6, factorielle.calculer(3));
	
}
}
