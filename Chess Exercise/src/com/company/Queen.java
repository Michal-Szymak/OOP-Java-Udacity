package com.company;

public class Queen extends Piece {
    @Override
    boolean isValidMove(Position newPosition) {
        if(!super.isValidMove(newPosition)) {
            return false;
        }
        if(this.position.row == newPosition.row || this.position.column == newPosition.column
            || Math.abs(this.position.row - newPosition.row) == Math.abs(this.position.column - newPosition.column)){
                return true;
            } else {
                return false;
            }
        }
    }
