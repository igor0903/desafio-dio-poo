import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cUrso = new Curso();
        Mentoria mentoria = new Mentoria();

        cUrso.setTitulo("Curso Java");
        cUrso.setDescricao("Aprender java com dio");
        cUrso.setCargaHoraria(30);

        mentoria.setTitulo("Mentoria Python");
        mentoria.setDescricao("Aprender java com dio Python");
        mentoria.setData(LocalDate.now());

        //System.out.println(cUrso);
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Bootcamp java com dio Python");
        bootcamp.getConteudos().add(cUrso);
        bootcamp.getConteudos().add(mentoria);

        Dev devI = new Dev();
        devI.setNome("pedro");
        devI.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos" + devI.getConteudosInscritos());
        devI.progredir();
        System.out.println("Conteudos Concluidos" + devI.getConteudosAprovados());


        Dev devJ = new Dev();
        devJ.setNome("Joao");
        devJ.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos" + devJ.getConteudosInscritos());
        devJ.progredir();
        System.out.println("Conteudos Concluidos" + devI.getConteudosAprovados());



    }
}