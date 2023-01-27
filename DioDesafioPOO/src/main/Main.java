package main;
import java.time.LocalDate;

import Dominio.Bootcamp;
import Dominio.Dev;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso java");
		curso1.setDescricao("Curso de java: sintaxe, paradigma POO, uso de IDEs e frameworks");
		curso1.setCargaHoraria(20);

		Curso curso2 = new Curso();
		curso2.setTitulo("Dados");
		curso2.setDescricao("Linguagem de manipulação de dados SQL, uso de SGBDs e tipos de dados");
		curso2.setCargaHoraria(30);

		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria de java");
		mentoria1.setDescricao("Mentoria com especialistas experientes e renomados na linguagem java");
		mentoria1.setData(LocalDate.now());

		Mentoria mentoria2 = new Mentoria();
		mentoria2.setTitulo("Mentoria de dados");
		mentoria2.setDescricao("Mentoria com especialistas experientes e renomados da área de dados");
		mentoria2.setData(LocalDate.now());

		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria1);
		System.out.println(mentoria2);*/
		
		//NOME, DESCRIÇÃO, SET DE CONTEUDO.
		Bootcamp bootcamp =new Bootcamp();
		
		bootcamp.setNome("Bootcamp java developer");
		bootcamp.setDescricao("Curso introdutório da linguagem java: sintaxe, paradigma POO, uso de IDEs e frameworks");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		//INPUT DE ALUNOS:
		Dev devVivian = new Dev();
		devVivian.setNome("Vivian");
		devVivian.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos Vivian: " + devVivian.getConteudoInscritos());
		devVivian.progredir();
		devVivian.progredir();
		System.out.println("");
		System.out.println("Conteudos inscritos Vivian: " + devVivian.getConteudoInscritos());
		System.out.println("Conteudos concluidos Vivian: " + devVivian.getConteudosConcluidos());
		System.out.println("XP: " + devVivian.calcularTotalXp());
		System.out.println("");
		
		Dev devMaria = new Dev();
		devMaria.setNome("Maria");
		devMaria.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos Maria: " + devMaria.getConteudoInscritos());
		devMaria.progredir();
		System.out.println("");
		System.out.println("Conteudos inscritos Maria: " + devMaria.getConteudoInscritos());
		System.out.println("Conteudos concluidos Maria: " + devMaria.getConteudosConcluidos());
		System.out.println("XP: " + devMaria.calcularTotalXp());
	}

}
