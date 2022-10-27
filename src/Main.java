import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

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

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("... descricao de Java");
        mentoria1.setData(LocalDate.now());

    //Não consigo criar um conteúdo ... Conteudo conteudo = new Conteudo(); porque nossa classe é abstrata.
    //Eu posso criar um Curos à partir da classe conteudo, (polimorfismo);

        Conteudo conteudo1 = new Curso();
        Conteudo conteudo2 = new Mentoria();

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
    }
}