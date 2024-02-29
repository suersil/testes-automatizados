package org.example;

public class MediaNotas {

    int nota1 = 10;
    int nota2 = 8;
    int nota3 = 7;
    int nota4 = 5;
    double mediaNotas;

    public void CalculandoMedia(){
        double somaNotas = (nota1 + nota2 + nota3 + nota4);
        mediaNotas = somaNotas / 4;
        System.out.println(mediaNotas);
    }

}
