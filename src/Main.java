import br.com.dio.desafio.dominio.*;

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
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("... descricao do curso JavaScript");
        curso2.setCargaHoraria(6);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("... descricao de Java");
        mentoria1.setData(LocalDate.now());

    //Não consigo criar um conteúdo ... Conteudo conteudo = new Conteudo(); porque nossa classe é abstrata.
    //Eu posso criar um Curos à partir da classe conteudo, (polimorfismo);

        Conteudo conteudo1 = new Curso();
        Conteudo conteudo2 = new Mentoria();

        // Vamos Criar um Bootcamp e colocar pelo menos 2 Devs nele.
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("... descricao do bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        //Agora a parte dos Devs
        Dev devDaniel = new Dev();
        devDaniel.setNome("Daniel Visicatto");
        Dev devWallace = new Dev();
        devWallace.setNome("Wallace V. Sinatra");

        //inscrevendo os devs no bootcamp.
        devDaniel.inscreverBootcamp(bootcamp);
        devWallace.inscreverBootcamp(bootcamp);

        //vamos imprimir os conteudos em que cada Dev está inscrito/progredido/XP.
        System.out.println("Conteudos inscritos Damniel" + devDaniel.getConteudosInscritos());
        System.out.println("----------------------------------------------------------------\n");
        System.out.println("Conteudos inscritos Wallace" + devWallace.getConteudosInscritos());

        System.out.println("===============================================================\n");
        devDaniel.progredir();
        devWallace.progredir();
        devWallace.progredir();

        System.out.println("Conteudos inscritos Daniel: " + devDaniel.getConteudosInscritos());
        System.out.println("Conteudos concluidos Daniel: " + devDaniel.getConteudosConcluidos());
        System.out.println("XP adquiridos por Daniel: " + devDaniel.calcularTotalXp());
        System.out.println("----------------------------------------------------------------\n");
        System.out.println("Conteudos inscritos Wallace: " + devWallace.getConteudosInscritos());
        System.out.println("Conteudos concluidos Wallace: " + devWallace.getConteudosConcluidos());
        System.out.println("XP adquiridos por Wallace: " + devWallace.calcularTotalXp());
    }
}