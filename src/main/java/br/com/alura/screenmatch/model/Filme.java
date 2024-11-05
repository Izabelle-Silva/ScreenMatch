package br.com.alura.screenmatch.model;

// atributo private não deixa ler e nem mexer a string

public class Filme {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;
    // em void é um metodo, so faz sem devolver, nesse caso, ai imprimir a ficha tecnica.


    //metododo acessor usando o get e set

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Nome de lançamento: " + anoDeLancamento);
    }
   public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes ++;

        }
    public double obtermediaDaSAvaliacoes(){

        return somaDasAvaliacoes/totalDeAvaliacoes;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
        this.somaDasAvaliacoes = somaDasAvaliacoes;
    }

    public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setNome(String nome) {
        this.nome = nome;

    }
}







