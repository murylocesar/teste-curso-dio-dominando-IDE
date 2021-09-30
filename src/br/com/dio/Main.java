package br.com.dio;

import br.com.dio.model.Gato;

public class Main {

    public static void main(String[] args) {

        Gato gato = new Gato();

        Livro livro = new Livro("o problema dos 3 corpos", 300);

        gato.setName("Jubileu");
        gato.setCor("Preto");
        gato.setIdade(99);

        System.out.println(gato);
        System.out.println(livro);

    }
}

class Livro {
    private String name;
    private Integer numPaginas;

    public Livro(String name, Integer numPaginas) {
        this.name = name;
        this.numPaginas = numPaginas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "name='" + name + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}