package arrays;

public class Zigzag_Merge_Two 
{
	 public static int[] zigZagMerge(int[] array1, int[] array2) {
	        int[] result = new int[array1.length + array2.length];
	        int i = 0, j = 0, k = 0;

	        while (i < array1.length && j < array2.length) {
	            result[k++] = array1[i++];
	            result[k++] = array2[j++];
	        }

	        while (i < array1.length) {
	            result[k++] = array1[i++];
	        }

	        while (j < array2.length) {
	            result[k++] = array2[j++];
	        }

	        return result;
	    }

	
	public static void main(String[] args) 
	{
		
		
	}

}
