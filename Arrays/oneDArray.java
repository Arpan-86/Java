public class oneDArray {
    int[] arr = null;

    public oneDArray(int sizeofArray) {
        arr = new int[sizeofArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int valueToBeInserted) {
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToBeInserted;
                System.out.println("Successfully inserted");
            } else {
                System.out.println("This cell is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array!");
        }
    }

    //Array Traversal

    public void traverseArray() {
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + " ");
            }
        }
        catch (Exception e) {
            System.out.println("Array no longer exists");
        }
    }

    //Search for an element in a given Array

    public void searchInArray(int valueToSearch){
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == valueToSearch){
                System.out.println("Value is found at the index of "+i);
                return;
            }
        }
        System.out.println(valueToSearch + " is not found");
    }

    //Delete value from an Array

    public void deleteValue(int valueToDeleteIndex){
        try{
            arr[valueToDeleteIndex] = Integer.MIN_VALUE;
            System.out.println("The value has been deleted successfully");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The value that is provided is not in the range of array");

        }
    }


    public static void main(String[] args) {

        oneDArray oda = new oneDArray(10);
        oda.insert(0,10);
        oda.insert(1,20);
        oda.insert(2,30);
        oda.insert(1,40);
        oda.insert(12,120);


        System.out.println("Array traversal");    //Array traversal
        oda.traverseArray();


        var firstElement = oda.arr[0];       //to access element in array
        System.out.println(firstElement);
        var thirdElement = oda.arr[2];
        System.out.println(thirdElement);


        oda.searchInArray(20);       //Searching element in Array
        oda.searchInArray(40);


        oda.deleteValue(0);      //Deleting value in Array
        System.out.println(oda.arr[0]);
    }
}
