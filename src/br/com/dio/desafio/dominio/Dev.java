package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;


public class Dev {

    private String nome;
    private Set<Conteudo> conteudosInscrito = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();


    public void inscreverBoootcamp(Bootcamp bootcamp){
        this.conteudosInscrito.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudosInscrito.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscrito.remove(conteudo.get());
        } else{
            System.err.println("Voce não esta matriculado em nenhum conteudo!");
        }
    }

    public double calcularTotalXp(){
       return this.conteudosConcluidos.stream().mapToDouble(Conteudo::calcularXp).sum();
    }

    public void mostraCertificado(){
         Stream<String> certificados = conteudosConcluidos.stream().map(Conteudo::geraCertificado);
         certificados.forEach(System.out::println);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscrito() {
        return conteudosInscrito;
    }

    public void setConteudosInscrito(Set<Conteudo> conteudosInscrito) {
        this.conteudosInscrito = conteudosInscrito;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscrito, dev.conteudosInscrito) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscrito, conteudosConcluidos);
    }
}
