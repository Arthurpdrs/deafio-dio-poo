import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso: Java");
        curso1.setDescricao("curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("curso javascript");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria);

        Dev devArthur = new Dev();
        devArthur.setNome("Arthur");
        devArthur.inscreverBoootcamp(bootcamp1);
        System.out.println("Conteudos Inscritos" + devArthur.getConteudosInscrito());
        devArthur.progredir();
        devArthur.progredir();
        System.out.println("Conteudos Inscritos" + devArthur.getConteudosInscrito());
        System.out.println("Conteudos Concluidos" + devArthur.getConteudosConcluidos());
        System.out.println("XP: " + devArthur.calcularTotalXp());
        System.out.println("Certificados: ");
        devArthur.mostraCertificado();

        System.out.println("-----------------------------------------------------");

        Dev devRaissa = new Dev();
        devRaissa.setNome("Raissa");
        devRaissa.inscreverBoootcamp(bootcamp1);
        System.out.println("Conteudos Inscritos" + devRaissa.getConteudosInscrito());
        devRaissa.progredir();
        devRaissa.progredir();
        devRaissa.progredir();
        System.out.println("Conteudos Inscritos" + devRaissa.getConteudosInscrito());
        System.out.println("Conteudos Concluidos" + devRaissa.getConteudosConcluidos());
        System.out.println("XP: " + devRaissa.calcularTotalXp());
        System.out.println("Certificados: ");
        devRaissa.mostraCertificado();


    }
}
