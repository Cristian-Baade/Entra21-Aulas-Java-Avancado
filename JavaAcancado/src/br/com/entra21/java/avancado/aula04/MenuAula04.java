package br.com.entra21.java.avancado.aula04;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

import br.com.entra21.java.avancado.aula01.enuns.Enuns;
import br.com.entra21.java.avancado.aula01.wrappers.Wrappers;
import br.com.entra21.java.avancado.aula02.collections.list.AprenderList;
import br.com.entra21.java.avancado.aula03.annotations.datas.Aula03;

public class MenuAula04 {

	static Scanner entrada = new Scanner(System.in);

	public static void aprender() {

		byte opcao;
		do {
			System.out.println("Assuntos Aula 04");
			System.out.println("0 - Voltar");
			System.out.println("1 - Definir HashSet");
			System.out.println("2 - Gerenciar C.R.U.D");
			opcao = entrada.nextByte();

			switch (opcao) {
			case 0:
				System.out.println("Até a proxima!");
				break;
			case 1:
				aprenderHashSet();
				break;

			case 2:
				aprenderCRUD();
				break;

			default:
				System.out.println("Escolha uma opção válida para aprender um assunto avançado sobre JAVA");
				break;
			}

		} while (opcao != 0);
	}

	private static void aprenderHashSet() {

		HashSet<String> linguagens = new HashSet<>();
		System.out.println("Quantidade de itens na minha lista " + linguagens.size());
		System.out.println("Minha lista esta vazia? " + linguagens.isEmpty());
		System.out.println("Minha lista esta vazia? " + (linguagens.isEmpty() ? "sim" : "nao"));

	}

	private static void aprenderCRUD() {
		HashSet<String> linguagens = new HashSet<>();
		// CREATE
		System.out.println("---CREATE---");
		linguagens.add("Java");
		linguagens.add("C#");
		linguagens.add("Python");
		System.out.println(linguagens);
		linguagens.add("Java");
		linguagens.add("java");
		System.out.println(linguagens);

		HashSet<Integer> numeros = new HashSet<>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		numeros.add(1);
		System.out.println(numeros);

		for (Integer numero : numeros) {
			System.out.println(numero);

		}

		// read
		System.out.println("---READ---");
		for (String linguagem : linguagens) {
			System.out.println("Linguagem = " + linguagem);

		}
		System.out.println("Java existe na minha lista? " + linguagens.contains("Java"));
		System.out.println("Sql existe na minha lista? " + linguagens.contains("Sql"));
		// Read buscar

		String busca = null;
		for (String linguagem : linguagens) {
			if (linguagem.equals("C#")) {
				System.out.println("Encontrei ele :D");
				busca = linguagem;

				break;

			}
		}

		System.out.println(busca);

		// update
		System.out.println("---Update---");
		System.out.println("Lista antes " + linguagens);
		linguagens.remove("Java");
		linguagens.add("Java02");
		System.out.println("Lista depois " + linguagens);

		// delete
		System.out.println("---Delete---");
		System.out.println("Lista antes " + linguagens);
		linguagens.remove("Java03");
		System.out.println("Lista depois " + linguagens);

	}

}
