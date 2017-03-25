package br.edu.unicesumar;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculadora {

	static Integer num = 31;
	
	public static void main(String[] args) {
		
		System.out.println(verificaSeEImpar(num));
		Logger logger = LogManager.getLogger("Calculadora");
		logger.info("mensagem de teste do log");
		System.out.println(verificaSeEPar(num));
		verificaSeEPar(num);
		verificaSeEImpar(num);

	}
	
	public static String verificaSeEPar(Integer num) {
		if(num % 2 == 0) {
			return "É Par";
		}
		return "";
	}
	
	public static String verificaSeEImpar(Integer num) {
		if(num % 2 != 0) {
			return "É Impar";
		}
		return "";
	}
}
