public class Matrix {
    public String[][] matrixString;

    public Matrix(String matrixAsString) {        
        String[] arrString = matrixAsString.split("\n");  
        
        matrixString = new String[arrString.length][arrString[0].split(" ").length];
        for (int x = 0; x < matrixString.length; x++) {
            for (int y = 0; y < matrixString[x].length; y++) {
                String[] arrStringTemp = arrString[x].split(" ");
                matrixString[x][y] = arrStringTemp[y];
            }
        }
    }

    public int[] getRow(int rowNumber) {
        int[] matrixToArr = new int[matrixString[0].length];
        for (int i = 0; i < matrixString[0].length; i++) {
            matrixToArr[i] = Integer.parseInt(matrixString[rowNumber - 1][i]);
        }
        return matrixToArr;
    }

    public int[] getColumn(int columnNumber) {
        int[] matrixToArr = new int[matrixString.length];
        for (int i = 0; i < matrixString.length; i++) {
            matrixToArr[i] = Integer.valueOf(matrixString[i][columnNumber - 1]);
        }
        return matrixToArr; 
    }
}
