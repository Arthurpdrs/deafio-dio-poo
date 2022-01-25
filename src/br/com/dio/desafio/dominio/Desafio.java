package br.com.dio.desafio.dominio;

public class Desafio extends Conteudo{


    @Override
    public double calcularXp() {
        return XP_PADRAO * 6;
    }

    @Override
    public String geraCertificado() {
        return certificado + "Desafio " + getTitulo();
    }


}
