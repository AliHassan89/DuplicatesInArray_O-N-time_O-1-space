/*

Given an array of integers where each value is 1<= x <= len(array), write a 
function that finds all the duplicates in the array.

 */
package duplicatesinarray;

import java.util.ArrayList;

/**
 *
 * @author Ali
 */
public class DuplicatesInArray 
{
    private static Object ArrayUtils;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int[] arr = {1,1,2,2};
        ArrayList<Integer> duplicates = findDuplicates(arr);
        
        for (int i : duplicates)
            System.out.print(i+", ");
    }
    
    private static ArrayList<Integer> findDuplicates(int[] arr)
    {
        ArrayList<Integer> result = new ArrayList<>();
        
        if (arr.length <= 1)
            return result;
        
        int index;
        for (int i=0; i<arr.length; i++)
        {
            index = Math.abs(arr[i]) - 1;
            if (arr[index] < 0)
            {
                result.add(Math.abs(arr[i]));
            }
            else
            {
                arr[index] *= -1;
            }
        }
        
        return result;
    }
    
}
