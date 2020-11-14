package com.company;

public class Piece {
    Position position;

    boolean isValidMove(Position newPosition){
        if(newPosition.row > 0 && newPosition.row < 9 && newPosition.column > 0 && newPosition.column < 9){
            return true;
        }
        else {
            return false;
        }
    }
}
