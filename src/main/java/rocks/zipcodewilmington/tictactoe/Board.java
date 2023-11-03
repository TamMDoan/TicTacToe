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

        return checkColumnsForWinner("X") || checkRowsForWinner("X") || checkDiagonalsForWinner("X");
    }

    public Boolean isInFavorOfO() {

        return checkColumnsForWinner("O") || checkRowsForWinner("O") || checkDiagonalsForWinner("O");
    }

    public Boolean isTie() {

        return isInFavorOfX() == isInFavorOfO();
    }

    public String getWinner() {
        if(isInFavorOfO()){
            return "O";
        }
        else if(isInFavorOfX()){
            return "X";
        }
        return "";
    }

    public boolean checkRowsForWinner(String player){
        for(int i = 0; i < 3; i++){
            if(this.board[i][0] == player.charAt(0) && this.board[i][0] == this.board[i][1] && this.board[i][0] == this.board[i][2]) {
                return true;
            }
        }

        return false;
    }

    public boolean checkColumnsForWinner(String player){
        for(int i = 0; i < 3; i++){
            if(this.board[0][i] == player.charAt(0) && this.board[0][i] == this.board[1][i] && this.board[2][i] == this.board[0][i]){
                return true;
            }
        }
        return false;
    }

    public boolean checkDiagonalsForWinner(String player){
        if(this.board[1][1] == player.charAt(0)){
            return (this.board[0][0] == this.board[2][2] && this.board[0][0] == player.charAt(0)) ||
                    (this.board[0][2] == this.board[2][0] && this.board[0][2] == player.charAt(0));
        }
        return false;
    }

}
