package br.carro.com;

public class CarroTeste {
    public static void main(String[] args) {
        // Instanciando um objeto Carro
        Carro meuCarro = new Carro();

        // Definindo as características do carro
        meuCarro.marca = "Toyota";
        meuCarro.modelo = "Corolla";
        meuCarro.ano = 2020;
        meuCarro.cor = "Prata";

        // Exibindo informações do carro
        meuCarro.exibirInfo();

        // Ligando o carro
        meuCarro.ligar();

        // Acelerando o carro
        meuCarro.acelerar();

        // Freando o carro
        meuCarro.frear();

        // Desligando o carro
        meuCarro.desligar();
    }
}
