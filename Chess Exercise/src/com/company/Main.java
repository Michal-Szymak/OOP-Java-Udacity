package com.company;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        Piece myRock = new Rock();
        myRock.position = new Position(3, 3);
        System.out.println(myRock.isValidMove(new Position(6,3)));
        System.out.println(myRock.isValidMove(new Position(5,5)));

        Piece myBishop = new Bishop();
        myBishop.position = new Position(3, 3);
        System.out.println(myBishop.isValidMove(new Position(6,3)));
        System.out.println(myBishop.isValidMove(new Position(5,5)));

        Piece myQueen = new Queen();
        myQueen.position = new Position(3, 3);
        System.out.println(myQueen.isValidMove(new Position(6,3)));
        System.out.println(myQueen.isValidMove(new Position(5,5)));

    }
}
