package zadaci_04_02_2016;

/* 
 * Zadatak5
 * Location class
 */

public class Location {

    public int row;
    public int column;
    public double maxValue;

    public Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }
    // method for locating largest element in 2d array
    public static Location locateLargest(double[][] a) {

        int row = 0;
        int column = 0;
        double maxValue = a[row][column]; // max value set to first element in array (NOT '0'  :D)
        // locating lagrest element
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (maxValue < a[i][j]) {
                    maxValue = a[i][j];
                    row = i;
                    column = j;
                }
            }
        }
        // returning values for this object row, column (for position), and largest element
        return new Location(row,column,maxValue);
    }

}
