package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("curso Java");
		curso1.setDescricao("mini curso Java");
		curso1.setCargaHoraria(8);

		Curso curso2 = new Curso();
		curso2.setTitulo("curso Js");
		curso2.setDescricao("mini curso Js");
		curso2.setCargaHoraria(4);

		// não é possível instanciar objeto de Conteudo (abstrata)
		// possível usar polimorfismo p/ criar objeto através de Conteudo
		// ex. [polimorfismo]: Conteudo conteudo = new Curso();
		// possível pq Curso contém tudo o que Conteudo contém

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria Java");
		mentoria.setDescricao("super mini mentoria Java");
		mentoria.setData(LocalDate.now());

		/*
		 * System.out.println(curso1); System.out.println(curso2);
		 * System.out.println(mentoria);
		 */

		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Dev");
		bootcamp.setDescricao("Mini Bootcamp Java");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);

		Dev devBitsa = new Dev();
		devBitsa.setNome("Bitsa");
		devBitsa.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos Bitsa:" + devBitsa.getConteudosInscritos());

		devBitsa.progredir();
		devBitsa.progredir();
		System.out.println("-");
		System.out.println("Conteúdos inscritos Bitsa:" + devBitsa.getConteudosInscritos());
		System.out.println("Conteúdos concluídos Bitsa:" + devBitsa.getConteudosConcluidos());
		System.out.println("XP: " + devBitsa.calcularXp());
		devBitsa.finalizar();

		System.out.println("-------");

		Dev devBitso = new Dev();
		devBitso.setNome("Bitso");
		devBitso.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos Bitso:" + devBitso.getConteudosInscritos());

		devBitso.progredir();
		devBitso.progredir();
		devBitso.progredir();
		System.out.println("-");
		System.out.println("Conteúdos inscritos Bitso:" + devBitso.getConteudosInscritos());
		System.out.println("Conteúdos concluídos Bitso:" + devBitso.getConteudosConcluidos());
		System.out.println("XP: " + devBitso.calcularXp());
		devBitso.finalizar();
	}

}
