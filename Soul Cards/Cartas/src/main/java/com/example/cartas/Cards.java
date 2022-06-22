package com.example.cartas;

public class Cards {
    static int hp = 10;
    static int custo;

    public static void main(String[] args) {

        CardsStatistics card1 = new CardsStatistics();

        card1.atack();
        System.out.println("Vida após o ataque: " +hp);

        card1.curar();
        System.out.println("Vida após a cura: " +hp);
    }
}
