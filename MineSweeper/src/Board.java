import java.util.Arrays;
import java.util.Random;

public class Board {
    public String[][] field;
    public String[][] display;
    public int mineCount;
    public int[] mineLocations;

    private final String unknown = "?";
    private final String mine = "*";
    private final String empty = "-";

    public Board(int row,int column){
        this.field = new String[row][column];
        this.display = new String[row][column];

        this.mineCount = (row*column)/4;
        this.mineLocations = new int[this.mineCount];


        for (int i = 0; i < row; i++) {
            for (int j = 0; j <column ; j++) {
                this.display[i][j] = unknown;
                this.field[i][j] = unknown;
            }
        }

        NewMineLocations(row,column);
        CalculateMineCount();

    }

    private void NewMineLocations(int row, int column) {
        mineLocations = new int[this.mineCount];
        mineLocations = new Random().ints(0, row*column).distinct().limit(mineCount).toArray();
        PlaceMines();
    }


    public void PrintBoard(String[][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(j > 0 )
                    System.out.print("|");
                else if(i!=0)
                    System.out.println();
                System.out.print(board[i][j]);
            }
        }
    }

    public void PlaceMines() {
        for (int mineLocation : mineLocations) {
            int tempRow = mineLocation / this.field[0].length;
            int tempColumn = mineLocation % this.field[0].length;
            this.field[tempRow][tempColumn] = mine;
        }


    }

    private void CalculateMineCount() {
        for (int i = 0; i < this.field.length; i++) {
            for (int j = 0; j < this.field[0].length; j++) {
                int tempCount=0;

                if(field[i][j].equals(unknown)){
                    if(i == 0) {
                        if(j==0){
                            if(field[i][j+1].equals(mine)) tempCount++;
                            if(field[i+1][j].equals(mine)) tempCount++;
                            if(field[i+1][j+1].equals(mine)) tempCount++;

                            field[i][j] = String.valueOf(tempCount);
                        } else if (j==this.field[0].length-1){

                            if(field[i][j-1].equals(mine)) tempCount++;
                            if(field[i+1][j-1].equals(mine)) tempCount++;
                            if(field[i+1][j].equals(mine)) tempCount++;

                            field[i][j] = String.valueOf(tempCount);
                        } else {

                            if(field[i][j-1].equals(mine)) tempCount++;
                            if(field[i][j+1].equals(mine)) tempCount++;
                            if(field[i+1][j-1].equals(mine)) tempCount++;
                            if(field[i+1][j].equals(mine)) tempCount++;
                            if(field[i+1][j+1].equals(mine)) tempCount++;

                            field[i][j] = String.valueOf(tempCount);
                        }
                    } else if(i == this.field.length-1){
                        if(j==0){
                            if(field[i-1][j].equals(mine)) tempCount++;
                            if(field[i-1][j+1].equals(mine)) tempCount++;
                            if(field[i][j+1].equals(mine)) tempCount++;

                            field[i][j] = String.valueOf(tempCount);
                        } else if (j==this.field[0].length-1){

                            if(field[i-1][j-1].equals(mine)) tempCount++;
                            if(field[i-1][j].equals(mine)) tempCount++;
                            if(field[i][j-1].equals(mine)) tempCount++;

                            field[i][j] = String.valueOf(tempCount);
                        } else {

                            if(field[i-1][j-1].equals(mine)) tempCount++;
                            if(field[i-1][j].equals(mine)) tempCount++;
                            if(field[i-1][j+1].equals(mine)) tempCount++;
                            if(field[i][j-1].equals(mine)) tempCount++;
                            if(field[i][j+1].equals(mine)) tempCount++;

                            field[i][j] = String.valueOf(tempCount);
                        }
                    } else{
                        if(j==0){

                            if(field[i-1][j].equals(mine)) tempCount++;
                            if(field[i-1][j+1].equals(mine)) tempCount++;
                            if(field[i][j+1].equals(mine)) tempCount++;
                            if(field[i+1][j].equals(mine)) tempCount++;
                            if(field[i+1][j+1].equals(mine)) tempCount++;

                            field[i][j] = String.valueOf(tempCount);
                        } else if (j==this.field[0].length-1){

                            if(field[i-1][j-1].equals(mine)) tempCount++;
                            if(field[i-1][j].equals(mine)) tempCount++;
                            if(field[i][j-1].equals(mine)) tempCount++;
                            if(field[i+1][j-1].equals(mine)) tempCount++;
                            if(field[i+1][j].equals(mine)) tempCount++;

                            field[i][j] = String.valueOf(tempCount);
                        } else {

                            if(field[i-1][j-1].equals(mine)) tempCount++;
                            if(field[i-1][j].equals(mine)) tempCount++;
                            if(field[i-1][j+1].equals(mine)) tempCount++;
                            if(field[i][j-1].equals(mine)) tempCount++;
                            if(field[i][j+1].equals(mine)) tempCount++;
                            if(field[i+1][j-1].equals(mine)) tempCount++;
                            if(field[i+1][j].equals(mine)) tempCount++;
                            if(field[i+1][j+1].equals(mine)) tempCount++;

                            field[i][j] = String.valueOf(tempCount);
                        }
                    }
                }

            }
        }
    }

}
