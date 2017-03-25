package br.edu.unicesumar.teste;
import org.junit.Assert;
import org.junit.Test;

import br.edu.unicesumar.Calculadora;


public class CalculadoraTeste {

		@Test
		public void validaParTest() {
			Calculadora calculadora = new Calculadora();
			Assert.assertEquals("É Par", calculadora.verificaSeEPar(4));
			Assert.assertEquals("", calculadora.verificaSeEPar(5));
			Assert.assertFalse(calculadora.verificaSeEPar(4).isEmpty());
		}
		
		@Test
		public void validaImparTest() {
			Calculadora calculadora = new Calculadora();
			Assert.assertEquals("É Impar", calculadora.verificaSeEImpar(5));
			Assert.assertEquals("", calculadora.verificaSeEImpar(4));
		}		
}
