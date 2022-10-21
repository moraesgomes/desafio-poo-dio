import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

         Curso curso1 = new Curso();

         curso1.setTitulo(" Curso Java");
         curso1.setDescricao("descrição curso java");
         curso1.setCargaHoraria(8);



        Curso curso2 = new Curso();

        curso2.setTitulo(" Curso JavaScript");
        curso2.setDescricao("descrição curso javaScript");
        curso2.setCargaHoraria(7);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descriação de mentoria java");
        mentoria.setData(LocalDate.now());



       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Java ScriptDeveloper");
        bootcamp1.setDescricao(" Descrição Java ScriptDeveloper");
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria);
        bootcamp1.getConteudos().add(curso1);



        Dev dev = new Dev();
        dev.setNome("Haroldo");
        dev.inscreverBootcamp(bootcamp);
        dev.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos Inscritos Haroldo " + dev.getConteudosInscritos());
        dev.progredir();
        System.out.println("-----------------------------------------------------------");
        dev.cancelarBootcamp(bootcamp1);
        System.out.println("Conteúdos Inscritos Haroldo " + dev.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Haroldo" + dev.getConteudosConcluidos());
        System.out.println("XP : " + dev.calcularTotalXp());

        System.out.println("-----------------------------------------------");

        Dev dev2 = new Dev();
        dev2.setNome("Larissa");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Larissa " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        System.out.println("-------------------------------------------------");
        System.out.println("Conteúdos Inscritos Larissa " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Larissa " + dev2.getConteudosConcluidos());
        System.out.println("XP : " + dev2.calcularTotalXp());





    }
}