import br.com.dio.desafio.dominio.Curso;
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

        System.out.println(cUrso);
        System.out.println(mentoria);
    }
}