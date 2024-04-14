package br.carro.com;
public class Carro {
    // Características (atributos)
    String marca;
    String modelo;
    int ano;
    String cor;
    int velocidade;

    // Método para ligar o carro
    public void ligar() {
        System.out.println("O carro está ligado.");
    }

    // Método para desligar o carro
    public void desligar() {
        System.out.println("O carro está desligado.");
    }

    // Método para acelerar o carro
    public void acelerar() {
        velocidade += 10;
        System.out.println("Acelerando. Velocidade atual: " + velocidade + " km/h");
    }

    // Método para frear o carro
    public void frear() {
        velocidade -= 10;
        System.out.println("Freando. Velocidade atual: " + velocidade + " km/h");
    }

    // Método para exibir informações do carro
    public void exibirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Velocidade: " + velocidade + " km/h");
    }
}
