import java.util.Arrays;
public class twoDArray {
    int[][] arr = null;

    //Constructor
    public twoDArray(int numberOfRows, int numberOfColumns){
        this.arr = new int[numberOfRows][numberOfColumns];
        for(int r = 0; r < arr.length; r++){
            for (int c = 0; c < arr[0].length; c++){
                arr[r][c] = Integer.MIN_VALUE;
            }
        }
    }

    //Inserting value in the Array

    public void insertValueInTheArray(int row, int col, int val){
        try {
            if (arr[row][col] == Integer.MIN_VALUE) {
                arr[row][col] = val;
                System.out.println("The value is successfully inserted");
            }
        }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Invalid index for 2D array");
            }
        }

        //Accessing cell value from given array

    public void accessCell(int row , int col) {
        System.out.println("\nAccessing Row#" +row+ ", Col#" +col);
        try{
            System.out.println("Cell value is " +arr[row][col]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index for 2D array");
        }
    }

    //Traverse 2D Array

    public void traverse2DArray(){
for(int row=0; row<arr.length; row++){
    for(int col=0;col<arr[0].length;col++){
        System.out.print(arr[row][col] + " ");
    }
    System.out.println();
       }
    }

    //Searching a single value from the Array

    public void searchingValue(int value) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                if (arr[row][col] == value) {
                    System.out.println("Value is found at row: " + row + " Col: " + col);
                    return;
                }
            }
        }
        System.out.println("Value is not found");
    }

    //Deleting a value from 2D Arrayu

    public void deleteValueFrom2DArray(int row, int col){
        try{
             System.out.println("Successfully deleted: "+arr[row][col]);
             arr[row][col]= Integer.MIN_VALUE;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("This index is not valid for array");
        }
}
     public static void main(String[] args){
        twoDArray tda = new twoDArray(3,3);
        tda.insertValueInTheArray(0,0,10);
        tda.insertValueInTheArray(0,1,20);
        tda.insertValueInTheArray(1,0,30);
        tda.insertValueInTheArray(2,0,40);

         tda.accessCell(0,1);                                    //Accessing cell value

         tda.traverse2DArray();                                           //Traversing 2D Array

         tda.searchingValue(20);                                          //Searching a value from 2D Array

         System.out.println(Arrays.deepToString(tda.arr));

         tda.deleteValueFrom2DArray(0,0);                         //Deleting value from 2D Array
         System.out.println(Arrays.deepToString(tda.arr));
     }

}
