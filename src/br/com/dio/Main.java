package br.com.dio;

import br.com.dio.model.Gato;

public class Main {

    public static void main(String[] args) {

        Gato gato = new Gato();

        gato.setName("Jubileu");
        gato.setCor("Rosa");
        gato.setIdade(99);

        System.out.println(gato);

    }
}
