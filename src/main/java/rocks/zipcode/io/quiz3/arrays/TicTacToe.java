package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    public String[][] Ourboard;

    public TicTacToe(String[][] board) {
        this.Ourboard = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        String[] ourRow = new String[3];
        for (int i = 0 ; i < 3 ; i++){
            ourRow[i] = Ourboard[value][i];
        }
        return ourRow;
    }

    public String[] getColumn(Integer value) {
        String[] ourColumn = new String[3];
        for (int i = 0 ; i < 3 ; i++){
            ourColumn[i] = Ourboard[i][value];
        }
        return ourColumn;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
            if (getRow(rowIndex)[0].equals(getRow(rowIndex)[1]) && getRow(rowIndex)[1].equals(getRow(rowIndex)[2])){
                return true;
            }
        return false;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        if (getColumn(columnIndex)[0].equals(getColumn(columnIndex)[1]) && getColumn(columnIndex)[1].equals(getColumn(columnIndex)[2])){
            return true;
        }
        return false;
    }

    public String getWinner() {
        for (int i = 0 ; i < 3 ; i++) {
            if (isColumnHomogeneous(i)){
                return getColumn(i)[0];
            }
            if (isRowHomogenous(i)){
                return getRow(i)[0];
            }

            if (Ourboard[0][0].equals(Ourboard[1][1]) && Ourboard[1][1].equals(Ourboard[2][2]) ||
                    Ourboard[0][2].equals(Ourboard[1][1]) && Ourboard[1][1].equals(Ourboard[2][0])){
                return Ourboard[1][1];
            }

        }return null;
    }

    public String[][] getBoard() {
        return Ourboard;
    }
}
