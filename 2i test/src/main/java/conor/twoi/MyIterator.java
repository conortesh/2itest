package conor.twoi;

import java.util.ArrayList;
import java.util.List;

/**
 * Coding test for 2i.
 * <br/>
 * Assumptions made:
 * <ul>
 *  <li>a and x are integers,</li>
 *  <li>the iterations ae to be printed</li>
 *  <li>the class doesn't need to read inputs,</li>
 *  <li>a is less than or equal to x.</li>
 * </ul>
 */
public class MyIterator
{

    /**
     * Iterates in multiples of:
     * <ul>
     * <li>a until x,</li>
     * <li>then a+1 until 2x,</li>
     * <li>then a+2 until 3x.</li>
     * </ul>
     * @param a the number that is iterated by.
     * @param x the number that is iterated to.
     */
    public static List<List<Integer>> iterateAll(int a, int x)
    {
        List<List<Integer>> results = new ArrayList<>();
        for (int i = 1; i <=3; i++)
        {
            results.add(iterate(a+i-1, x*i ));
        }

        return results;
    }

    /**
     * Iterates in multiples of a until x.
     * @param a the number that is iterated by.
     * @param x the number that is iterated to.
     */
    private static List<Integer> iterate(int a, int x)
    {
        List<Integer> results = new ArrayList<>();
        for (int i = a; i <= x; i += a)
        {
            results.add(i);
        }

        return results;

    }

}


