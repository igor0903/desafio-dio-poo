package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosAprovados = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp) {

    }

    public void progredir(){

    }

    public void calcularXp(){

    }


    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosAprovados() {
        return conteudosAprovados;
    }

    public void setConteudosAprovados(Set<Conteudo> conteudosAprovados) {
        this.conteudosAprovados = conteudosAprovados;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosAprovados, dev.conteudosAprovados);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosAprovados);
    }
}
