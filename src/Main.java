import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso cUrso = new Curso();
        Mentoria mentoria = new Mentoria();

        cUrso.setTitulo("Curso Java");
        cUrso.setDescricao("Aprender java com dio");
        cUrso.setCargaHoraria(30);

        System.out.println(cUrso);
        System.out.println(mentoria);
    }
}