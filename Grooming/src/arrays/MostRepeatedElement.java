package arrays;

import java.util.HashMap;

public class MostRepeatedElement
{
    public static void main(String[] args)
    {
        int[] arr = {1, 3, 2, 3, 4, 1, 3, 3, 2, 1, 1, 1};

        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int mostRepeated = arr[0], maxCount = 0;

        for (int num : arr) 
        {
            if (freqMap.containsKey(num)) 
            {
                freqMap.put(num, freqMap.get(num) + 1);
            }
            else 
            {
                freqMap.put(num, 1);
            }

            if (freqMap.get(num) > maxCount)
            {
                maxCount = freqMap.get(num);
                mostRepeated = num;
            }
        }

        System.out.println("Most Repeated Element: " + mostRepeated);
    }
}
