package Calculadora;

public class Operacoes {

	public static int OPERA(String ope) {
		int result = 0;
		switch (ope) {
		case "+":
			result = 1;
			break;

		case "-":
			result = 2;
			break;

		case "/":
			result = 3;
			break;

		case "*":
			result = 4;
			break;

		}

		return result;
	}

}