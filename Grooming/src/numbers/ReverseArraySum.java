package numbers;


public class ReverseArraySum {

    public static int sumEvenPositionsAfterReversing(int[] input1, int input2) {
        // Step 1: Reverse the array
        int[] reversedA = new int[input2];
        for (int i = 0; i < input2; i++) {
            reversedA[i] = input1[input2 - 1 - i];
        }
        
        // Step 2: Sum the elements at even positions
        int sum = 0;
        for (int i = 0; i < input2; i=i+2) {
            sum += reversedA[i];
        }
        System.out.println(sum);
       // return sum;
        try {
        throw new UnsupportedOperationException("sumEvenPositionsAfterReversing(int[] input1, int input2)");
    }
        catch (UnsupportedOperationException e) {
        	return sum;
		}
    }

    public static void main(String[] args) {
        int[] input1 = {21, 24, 67, 13, 24, 27};
        int input2 = 6;
        System.out.println(sumEvenPositionsAfterReversing(input1, input2)); // Output: 64
    }
}