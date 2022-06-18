class DifferenceOfSquaresCalculator {

    public int computeSquareOfSumTo(int input) {
        int squareOfSum = 0;
        for (int i = 1; i <= input; i++) {
            squareOfSum += i;
        }

        return (int) Math.pow(squareOfSum, 2);
    }

    public int computeSumOfSquaresTo(int input) {
        int sumOfSquare = 0;
        for (int i = 1; i <= input; i++) {
            sumOfSquare += (int) Math.pow(i, 2);
        }
        return sumOfSquare;
    }

    public int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}
