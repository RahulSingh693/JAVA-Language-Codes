class array_sum {
    public static void main(String[] args) {

        int [][]numb = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

        int total;
        for (int row = 0; row < numb.length; row++) {

            //set accumulator to 0
            total = 0;

            //sum of rows operation
            for (int col = 0; col < numb[row].length; col++)
                total += numb[row][col];
          
           //displaying sum of rows     
            System.out.println("Total of row " + row + " is " + total);
        }
    }
}