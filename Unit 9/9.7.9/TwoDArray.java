public class TwoDArray {

    private Object[][] myArray;

    public TwoDArray(Object[][] input) {
        myArray = input;
    }

    public boolean equals(Object[][] other) {
        if (myArray.length == other.length) {
            for (int i = 0; i < myArray.length; i++) {
                for (int j = 0; j < myArray[i].length; j++) {
                    if ((myArray[i][j] == other[i][j]) == false) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

}