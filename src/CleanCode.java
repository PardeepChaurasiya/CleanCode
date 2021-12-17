public class CleanCode {

    //static class
    static class Check {

        int smallestNumber;
        int largestNumber;
    }

    //Method to find the largest and smallest number from a given array
    static Check findLargestSmallest(int[] arrayGiven, int sizeOfArray){
        Check objectOfCheck = new Check();

        int i;

        if (sizeOfArray == 1) {
            objectOfCheck.largestNumber = arrayGiven[0];
            objectOfCheck.smallestNumber = arrayGiven[0];
            return objectOfCheck;
        }

        if (arrayGiven[0] > arrayGiven[1]) {
            objectOfCheck.largestNumber = arrayGiven[0];
            objectOfCheck.smallestNumber = arrayGiven[1];
        }

        else {
            objectOfCheck.largestNumber = arrayGiven[1];
            objectOfCheck.smallestNumber = arrayGiven[0];
        }

        for (i = 2; i < sizeOfArray; i++) {
            if (arrayGiven[i] > objectOfCheck.largestNumber)
            {
                objectOfCheck.largestNumber = arrayGiven[i];
            }
            else if (arrayGiven[i] < objectOfCheck.smallestNumber)
            {
                objectOfCheck.smallestNumber = arrayGiven[i];
            }
        }

        return objectOfCheck;
    }

    //Main method
    public static void main(String[] args) {
        int [] arrayGiven = {1000, 11, 445, 1, 330, 3000}; //Given array of elements
        int sizeOfArray = 6;
        Check objectOfCheck = findLargestSmallest(arrayGiven, sizeOfArray);//Calling of the method

        //Printing arrayGiven
        System.out.print("\n Given array : [ ");
        for(int i=0;i<sizeOfArray;i++){
            System.out.print(arrayGiven[i]+" ");
        }
        System.out.print("]");

        //Printing the smallest and largest number
        System.out.printf("\n Smallest Number in array : %d", objectOfCheck.smallestNumber);
        System.out.printf("\n Largest Number in array : %d", objectOfCheck.largestNumber);
    }
}
