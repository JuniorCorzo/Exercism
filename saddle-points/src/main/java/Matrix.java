import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Matrix {
    List<List<Integer>> values;
    public boolean allEquals;

    Matrix(List<List<Integer>> values) {
        this.values = values;
        this.allEquals = false;
    }
    // System.out.println(values.get(row).get(col));

    Set<MatrixCoordinate> getSaddlePoints() {
        Set<MatrixCoordinate> saddlesPoints = new HashSet<>();
        if (values.isEmpty()) {
            return saddlesPoints;
        }
        int indexRow = 0;
        int row = 0;
        int col = 0;
        boolean colIsBigger = true;
        boolean stop = false;

        if (values.get(0).size() > 1) {
            while (!stop) {
                if (!this.allEquals) {
                    row = colMinor(col);
                } else {
                    if (row < values.size() - 1) {
                        row++;
                    } else {
                        this.allEquals = false;
                    }
                }
                int numBigger = values.get(row).get(col);
                for (int colRow = 0; colRow < values.get(0).size(); colRow++) {
                    if (numBigger < values.get(row).get(colRow)) {
                        colIsBigger = false;
                        break;
                    }

                }

                if (colIsBigger) {
                    saddlesPoints.add(new MatrixCoordinate(row + 1, col + 1));
                } else {
                    colIsBigger = true;
                }

                if (col == values.get(0).size() - 1 && indexRow == values.size() - 1) {
                    stop = true;
                }

                if (!this.allEquals) {
                    if (col < values.get(0).size() - 1) {
                        col++;
                    } else {
                        row++;
                    }

                    if (indexRow < values.size() - 1) {
                        indexRow++;
                    }
                }
            } 
            
            

        } else {
            int numMinor = 0;
            for (int i = 0; i < values.size(); i++) {
                numMinor = values.get(i).get(0);
                for (int j = 0; j < values.size(); j++) {
                    if (numMinor > values.get(j).get(0)){
                        colIsBigger = false;
                        break;
                    }
                }

                if(colIsBigger){
                    saddlesPoints.add(new MatrixCoordinate(i + 1, 1));
                } else {
                    colIsBigger = true;
                }
            }
        }

        return saddlesPoints;
    }

    public int colMinor(int col) {
        int numMinor = values.get(0).get(col);
        int index = 0;
        int indexEquals = 0;
        for (int i = 1; i < values.size(); i++) {
            if (numMinor == values.get(i).get(col)) {
                indexEquals++;
            }

            if (numMinor > values.get(i).get(col)) {
                numMinor = values.get(i).get(col);
                index = i;
            }

        }

        if (indexEquals == values.size() - 1) {
            allEquals = true;
        }
        return index;
    }

}
