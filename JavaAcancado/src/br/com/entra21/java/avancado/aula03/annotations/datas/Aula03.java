package br.com.entra21.java.avancado.aula03.annotations.datas;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Aula03 {

	static Scanner input = new Scanner(System.in);

	public static void aprender() {
		byte option;
		do {
			System.out.println("-1 - Sair de fininho");
			System.out.println(" 0 - Voltar");
			System.out.println(" 1 - Datas");
			System.out.println(" 2 - Anotações");
			option = input.nextByte();

			switch (option) {

			case -1:
				System.exit(3);
				break;
				
			case 0:
				System.out.println("Retornando ao menu principal");
				break;
				
			case 1:
				aprenderDatas();
				break;
				
			case 2:
				
				break;
				
			default:
				System.out.println("Opção Invalida!");
				break;
				
			}
		} while (option != 0);

	}
private static void aprenderDatas() {
	Instant inicio = Instant.now();
	
	
	System.out.println("Escolha um numero aleatório,menos esse que voce pensou primeiro");
	long numero = input.nextLong();
	
	
	
	Instant fim = Instant.now();
	Duration tempo = Duration.between(inicio, fim);
	System.out.println("Voce demorou "+tempo.toSeconds()+" segundos para escolher o numero "+numero);
	System.out.println("Para datas levamos "+tempo.toSeconds()+" segundos ");

aprenderDatasHumanizadas();
	
}
private static void aprenderDatasHumanizadas() {
	LocalDate hoje = LocalDate.now();
	System.out.println(hoje);
	
	LocalDate nascimento = LocalDate.of(2003,1,9);
	System.out.println(nascimento);
	
	LocalDate essaQuinta = LocalDate.of(2022, Month.JUNE, 2);
	System.out.println("Essa quinta é igual a "+essaQuinta);
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
	System.out.println((formatter).format(hoje));
	System.out.println(DateTimeFormatter.ofPattern("YYYY").format(essaQuinta));
	
	Period vida = Period.between(nascimento, hoje);
	System.out.println("Durante minha vida ja gastei "+vida.getYears()+ " anos, "+vida.getMonths()+ " meses e "+vida.getDays()+ " dias");
	
	LocalTime lanche = LocalTime.of(20, 10);
	LocalTime finalAula03 = LocalTime.of(22, 15);
	LocalTime avaliacao = LocalTime.of(22, 0);
	
	System.out.println("Fomo lanchar as: "+lanche+" vamos avaliar a aula as: "+avaliacao+" e temos que aprender tudo ate a: "+finalAula03);
	
}


}
