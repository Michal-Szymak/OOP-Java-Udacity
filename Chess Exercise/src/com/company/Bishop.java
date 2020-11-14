package com.company;

public class Bishop extends Piece{
    @Override
    boolean isValidMove(Position newPosition) {
        if(!super.isValidMove(newPosition)) {
            return false;
        }
        if(Math.abs(newPosition.row - this.position.row) == Math.abs(newPosition.column - this.position.column)) {
            return true;
        } else {
            return false;
        }
    }
}
