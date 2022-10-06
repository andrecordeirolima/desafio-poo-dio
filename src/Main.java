import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria");
        mentoria.setData(LocalDate.now());


       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devFulano = new Dev();
        devFulano.setNome("Fulano");
        devFulano.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos " + devFulano.getNome() + " " + devFulano.getConteudosInscritos());
        devFulano.progredir();
        devFulano.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos " + devFulano.getNome() + " " + devFulano.getConteudosInscritos());
        System.out.println("Conteudos Concluidos " + devFulano.getNome() + " " + devFulano.getConteudosConcluidos());
        System.out.println("XP: " + devFulano.calcularTotalXp());

        System.out.println("-------------------------------");

        Dev devCiclano = new Dev();
        devCiclano.setNome("Ciclano");
        devCiclano.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos " + devCiclano.getNome() + " " + devCiclano.getConteudosInscritos());
        devCiclano.progredir();
        devCiclano.progredir();
        devCiclano.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos " + devCiclano.getNome() + " " + devCiclano.getConteudosInscritos());
        System.out.println("Conteudos Concluidos " + devCiclano.getNome() + " " + devCiclano.getConteudosConcluidos());
        System.out.println("XP: " + devCiclano.calcularTotalXp());





    }
}