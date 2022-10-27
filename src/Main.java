import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoia;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        //Atribuindo valores através do método Set();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("... descricao do curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        //Atribuindo valores através do método Set();
        curso1.setTitulo("Curso JavaScript");
        curso1.setDescricao("... descricao do curso JavaScript");
        curso1.setCargaHoraria(6);

        Mentoia mentoria1 = new Mentoia();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("... descricao de Java");
        mentoria1.setData(LocalDate.now());


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
    }
}