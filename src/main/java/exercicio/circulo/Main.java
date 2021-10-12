package exercicio.circulo;
/*
Escreva uma classe Circulo, representando círculos.
Esta classe deverá conter os seguintes atributos e métodos:
a) Uma variável privado do tipo Double chamada raio que guardará o valor do raio;
b) Métodos públicos que permitam definir e acessar o valor da variável raio;
c) Um construtor que receba o valor do raio como argumento;
d) Um método Area() que calcula e retorna a área do círculo;
e) Um método Circunferência() que calcula e retorna a circunferência do círculo;
f) Um método aumentarRaio() que recebe um valor Double e o usa como percentual para aumentar o raio do círculo;
Crie uma classe contendo o método main() para testar a funcionalidade da Classe Circulo.
 */

import java.util.Scanner;

public class Main {

    public static void main (String[] Args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o raio do círculo: ");
        double raio = scan.nextDouble();
        scan.nextLine();

        Circulo circulo = new Circulo(raio);
        System.out.println("Raio: " + raio);
        System.out.println("Área: " + circulo.Area(raio) + " metros quuadrados");
        System.out.println("Circunferẽncia: " + circulo.Circunferencia(raio) + " metros");
        scan.nextLine();

        System.out.println("Informe o percentual de aumento do raio: ");
        double percentual= scan.nextDouble();
        double novoRaio = circulo.aumentarRaio(percentual);
        System.out.println("Raio: " + novoRaio);
        System.out.println("Área: " + circulo.Area(novoRaio) + " metros quuadrados");
        System.out.println("Circunferẽncia: " + circulo.Circunferencia(novoRaio) + " metros");






    }
}
