package br.com.entra21.java.avancado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import br.com.entra21.java.avancado.aula01.enuns.Enuns;
import br.com.entra21.java.avancado.aula01.wrappers.Wrappers;
import br.com.entra21.java.avancado.aula02.collections.list.AprenderList;
import br.com.entra21.java.avancado.aula03.annotations.datas.Aula003;
import br.com.entra21.java.avancado.aula03.annotations.datas.Aula03;
import br.com.entra21.java.avancado.aula04.MenuAula04;
import br.com.entra21.java.avancado.aula05.Aula05;
import br.com.entra21.java.avancado.aula06.Aula06;

public class Main {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		Repositorio.inicializarPessoas();
		byte opcao;
		do {
			System.out.println(montarMenu());
			opcao = entrada.nextByte();

			switch (opcao) {
			case 0:
				System.out.println("At� a proxima!");
				break;
			case 1:
				Wrappers.aprender();
				break;
			case 2:
				Enuns.aprender();
				break;
			case 3:
				AprenderList.aprender();
				break;
			case 4:
				Aula03.aprender();
				break;
			case 5:
				MenuAula04.aprender();
				break;
			case 6:
				new Aula05("Aula05 - Collections - MAP - HashMap",
						new ArrayList<>(
								Arrays.asList("Definir", "Create", "Read", "Update", "Delete", "Exemplo pr�tico")))
						.aprender();
				break;
			case 7:

				new Aula06("Aula 06", new ArrayList<>(Arrays.asList("Aprender Generics", "Listar Pessoa",
						"Adicionar Pessoa", "Editar Pessoa", "Deletar Pessoa"))).aprender();

				break;
			case 8:
				pedirPaciencia();
				break;
			case 9:
				pedirPaciencia();
				break;
			case 10:
				pedirPaciencia();
				break;

			default:
				System.out.println("Escolha uma op��o v�lida para aprender um assunto avan�ado sobre JAVA");
				break;
			}

		} while (opcao != 0);
		System.out.println("Obrigado, volse sempre que quiser aprender mais sobre JAVA AVAN�ADO");

	}

	private static String montarMenu() {
		String menu = "M�dulo sobre JAVA AVAN�ADO:";
		menu += "\n  0 - Sair";
		menu += "\n  1 - Aula 01 (pronto)- Classes Wrapper";// juntos 01
		menu += "\n  2 - Aula 01 (pronto)- ENUM";// juntos 01
		menu += "\n  3 - Aula 02 - Collections - LIST";// somente 02
		menu += "\n  4 - Aula 03 - Annotations, Datas";// juntos 03
		menu += "\n  5 - Aula 04 - Collections - SET";// juntos 03
		menu += "\n  6 - Aula 05 - Collections - Map";
		menu += "\n  7 - Aula 06 - Generics";
		menu += "\n--------------------------------------------------------";
		menu += "\n Escolha uma op��o para aprender:";
		menu += "\n--------------------------------------------------------";

		return menu;
	}

	@Aula003
	private static void pedirPaciencia() {
		System.out.println("CALMA CALMA CALMA, muita CALMA... ainda n�o esta pronto.");
		System.out.println("--------------------------------------------------------");

	}

}
