public class MagicSquare{
    private int[][] square; // n x n 2D array
    private int n; // number of rows(or columns) of square
    /** write a constructor that accepts a 2d array
        Precondition: Assume that square is a square(number of rows = number of columns) 2D array. Assume also that the values in square are in the range 1 - n^2. 
    */
    public MagicSquare(int[][] a){
      square = a;
      n = square.length;
    }



    /** Returns row sum of the row given by the parameter r
        Precondition: 0 <= r < number of rows of square
    */
    public int rowSum(int r){
      int sum = 0;
      for (int num : square[r])
      {
        sum += num;
      }
    return sum;
    }
    /** Returns column sum of the column given by the parameter c
        Precondition: 0 <= c < number of columns of square
    */
    public int colSum(int c){
      int sum = 0;
      for (int row = 0; row < square.length; row++)
      {
        sum += square[row][c];
      }
      return sum;
    }
    /**
    Returns whether both the major and minor diagonal sums are equal to the parameter sum. 
    */
    public boolean diagSums(int sum){
      int diagSum = 0;
        for(int row = 0; row < square.length; row++)
        {
            for(int col = 0; col < square[0].length; col++)
            {
              if(row == col)
              {
                 diagSum += square[row][col];
              }
            }
        }

        for(int row = square.length; row >= 0; row--)
        {
            for(int col = square[0].length; col >= 0; col--)
            {
              if(row == col)
              {
                 diagSum += square[row][col];
              }
            }
        }

        if (diagSum == sum)
        {
          return true;
        } else 
        {
          return false;
        }
    }
    /**
    Precondition: Values of square is in range 1 to n^2.
    Returns true if the numbers 1 to n^2 occurs exactly once in square and false otherwise. 
    n is the number of rows(and columns) in square.  Hint: Use a tally array discussed in the array algorithm lecture. 
    MUST USE ONLY FOR EACH LOOPS!!
    */
    public boolean exactlyOnce(){
      int[] tally = new int[n^2];
      return true;

    }
    /**
    Using all of the helper methods above. Implement isMagic() below so that
    it returns true if square is magic and false otherwise.  
    */
    public boolean isMagic(){
      return true;
    }

}