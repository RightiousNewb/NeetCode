package ArraysAndHashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

    public static void main(String[] args) throws Exception {

    }

    static class Solution {
        public boolean isValidSudoku(char[][] board) {
            ArrayList<HashSet<Character>> rowSet = new ArrayList<HashSet<Character>>(Collections.nCopies(9, new HashSet<Character>()));
            ArrayList<HashSet<Character>> colSet = new ArrayList<HashSet<Character>>(Collections.nCopies(9,new HashSet<Character>()));
            ArrayList<ArrayList<HashSet<Character>>> boxSet = new ArrayList<ArrayList<HashSet<Character>>>();//3x3
            for(int row = 0; row < board.length; row++){
                for(int col = 0; col < board[row].length; col++) { //each element
                    if(board[row][col] != '.') {
                        if (rowSet.get(row).contains(board[row][col])) {
                            return false;
                        } else {
                            rowSet.get(row).add(board[row][col]);
                        }

                        if (colSet.get(col).contains(board[row][col])) {
                            return false;
                        } else {
                            colSet.get(col).add(board[row][col]);
                        }
                        int boxRow = row / 3;
                        int boxCol = col / 3;
                        if (boxSet.get(boxRow).get(boxCol).contains(board[row][col])) {
                            return false;
                        } else {
                            boxSet.get(boxRow).get(boxCol).add(board[row][col]);
                        }
                    }
                }
            } //at this point all rows, columns, and boxes have been compared against themselves.
            for(int row = 0; row < board.length; row++) {
                for (int col = 0; col < board[row].length; col++) {
                    HashSet<Character> positionHash = new HashSet<Character>();
                    int boxRow = row/3;
                    int boxCol = col/3;
                    if (positionHash.retainAll(rowSet.get(row)) &&
                            positionHash.retainAll(colSet.get(col)) &&
                            positionHash.retainAll(boxSet.get(boxRow).get(boxCol))){
                        //valid
                    }else{
                        return false;
                    }
                }
            }
            return true;

        }
    }
}
