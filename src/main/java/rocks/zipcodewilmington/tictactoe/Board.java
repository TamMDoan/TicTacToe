package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {

    Character[][] board;
    public Board(Character[][] matrix) {
        this.board = matrix;
    }

    public Boolean isInFavorOfX() {
        boolean favorOfX = false;

        return favorOfX;
    }

    public Boolean isInFavorOfO() {
        boolean favorOfO = false;

        return favorOfO;
    }

    public Boolean isTie() {
        boolean isTie = true;
        return isTie;
    }

    public String getWinner() {
        String winner = "";

        return winner;
    }

    public boolean checkColumnsForWinner(String player){
        for(int i = 0; i < 3; i++){
            if(this.board[i][0] == player.charAt(0) && this.board[i][0] == this.board[i][1] && this.board[i][0] == this.board[i][2]) {
                return true;
            }
        }

        return false;
    }

    public boolean checkRowsForWinner(String player){
        return false;
    }

}
