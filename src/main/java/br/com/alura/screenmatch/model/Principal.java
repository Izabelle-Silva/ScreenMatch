package br.com.alura.screenmatch.model;

public class Principal {
    public static void main(String[] args) {
        // do lado da esquerda é uma variavel que sabe se referenciar e a da direita cria o espaço da memória
        Filme meuFilme = new Filme();
        // forma anterior antes dos getters e setters
        // meuFilme.Setnome = "Wolverine";
        meuFilme.setNome  ("Wolverine");
        meuFilme.setAnoDeLancamento  (2010);
        meuFilme.setDuracaoEmMinutos (180);


        meuFilme.exibeFichaTecnica();
        meuFilme.avalia (7);
        meuFilme.avalia(5);
        meuFilme.avalia(4);
        System.out.println( "Total de avaliações: "+ meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.obtermediaDaSAvaliacoes());
        // forma anterior, antes de usar o private, para não burlar os códigos
        // meuFilme.somaDasAvaliacoes = 10;
        //forma anterior, antes de usar o private,meuFilme.totalDeAvaliacoes = 1;
        //System.out.println(meuFilme.obtermediaDaSAvaliacoes());
        // String é uma classe com Uma letra Maiuscula e o resto minuscula.
    }
}