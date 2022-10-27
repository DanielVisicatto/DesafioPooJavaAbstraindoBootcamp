package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>(); // colocar na ordem. Só uma vez cada.
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>(); // colocar na ordem. Só uma vez cada.

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    // Para trabalharmos com Hash preciamos do equals e hashcode.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }

    public void inscreverBootcamp(Bootcamp bootcamp) {
        //quando um Dev se inscrece no bootcamp, os conteudos vem pra esse Set<Conteudo> conteudosInscritos.
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        //tenho que adicionar esse meu Dev no Boootcamp.
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir(){
        //pegando o conteudo...
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();// colocamos numa variável.
        //pegando de Iscritos e colocando nos concluidos.
        if(conteudo.isPresent()){// se tiver conteudo.
            this.conteudosConcluidos.add(conteudo.get());
            //removendo o concluido de inscrito.
            this.conteudosInscritos.remove(conteudo.get());
        }else{
            System.err.println("Você ainda não se matriculou em nenhum Bootcamp ");
        }
    }

    public double calcularTotalXp(){// tem q ser double para podemos usar o TotalXp
        //vamos pegar nosso Set<Conteudo> conteudoConcluidos e somando com o método.
        return this.conteudosConcluidos.stream().mapToDouble(Conteudo::calcularXp).sum();
    }
}
