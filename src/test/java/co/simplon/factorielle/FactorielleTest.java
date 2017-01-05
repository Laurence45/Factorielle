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

}
