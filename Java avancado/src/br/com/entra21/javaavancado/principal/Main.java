package br.com.entra21.javaavancado.principal;

import java.util.Scanner;

import br.com.entra21.principal.enums.PersonagemJogo;

public class Main {

	static Scanner input = new Scanner(System.in);

	public enum DiasSemana {
		SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO
	}

	public static void main(String[] args) {

		byte option;

		do {

			System.out.println(exibirMenu());
			option = input.nextByte();

			switch (option) {
			case 0:

				System.out.println("Saindo");
				break;
			case 1:
				aprenderWrapper();
				break;
			case 2:
				aprenderEnum();
				break;

			default:
				System.out.println("Opção Invalida");
				break;

			}

		} while (option != 0);

	}

	private static String exibirMenu() {

		String menu = "Vamos aprender sobre conceitos avançados em Java";
		menu += "0 - Sair";
		menu += "1 - Wrapper";
		menu += "2 - ENUM";
		menu += " Escolha uma das Opções";

		return null;
	}

	private static void aprenderWrapper() {

		char letra = Character.valueOf('C');
		boolean verdade = Boolean.parseBoolean("TRUE");
		boolean verdade1 = Boolean.parseBoolean("tRue");
		boolean verdade2 = Boolean.parseBoolean("true");
		boolean falso = Boolean.parseBoolean("t");

		byte inteiroUm = Byte.parseByte("127");
		short inteiroDois = Short.parseShort("128");
		int inteiroTres = Integer.parseInt("10000");
		long inteiroQuatro = Long.parseLong("100000");

		float decimalUm = Float.parseFloat("1000.10");
		double decinalDois = Double.parseDouble("2000.20");

	}

	public static void aprenderEnum() {

		System.out.println("Testando Enum: " + DiasSemana.TERCA);
		boolean hoje = DiasSemana.DOMINGO == DiasSemana.SEGUNDA;
		System.out.println(hoje ? "sim" : "não");

		for (int dia = 0; dia < DiasSemana.values().length; dia++) {
			System.out.println((dia + 1) + " - " + DiasSemana.values()[dia]);
		}
		System.out.println("Gosto desse tipo de personagem: " + PersonagemJogo.DRUIDA);
		System.out
				.println("Geralmente a classe " + PersonagemJogo.DRUIDA + "tem HP= " + PersonagemJogo.DRUIDA.getVIDA());
		System.out.println("Veja a caracteristica mais comum dele " + PersonagemJogo.DRUIDA.getDESCRICAO());
		System.out.println("Veja a descrição completa do " + PersonagemJogo.MAGO + " Sua vida é "
				+ PersonagemJogo.MAGO.getVIDA() + "e sua habilidade principal " + PersonagemJogo.MAGO.getDESCRICAO());

		System.out.println(PersonagemJogo.BARBARO.getDetails());

		System.out.println("");
		for (int personagem = 0; personagem < PersonagemJogo.values().length; personagem++) {

			System.out.println(
					"Contador = " + personagem + " posicao do Enum = " + PersonagemJogo.values()[personagem].ordinal());
			System.out.println("O personagem " + PersonagemJogo.values()[personagem].name());
			System.out.println(PersonagemJogo.values()[personagem].getVIDA());
			System.out.println(PersonagemJogo.values()[personagem].getDESCRICAO());
			System.out.println("-----------------------------------------");
		}

		for (PersonagemJogo variavel : PersonagemJogo.values()) {
			System.out.println(variavel.ordinal() + " - " + variavel.getDetails());
		}
		System.out.println("");
		System.out.println("O Druida esta na posicao " + PersonagemJogo.DRUIDA.ordinal());
	}
}
