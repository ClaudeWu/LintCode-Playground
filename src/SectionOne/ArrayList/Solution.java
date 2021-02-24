package SectionOne.ArrayList;

import java.util.*;

/**
 * LintCode 385.ArrayList
 * 1. create(n). Create an ArrayList of integers contains [0, 1, 2, ... n-1]
 * 2. clone(list). Clone a list. The cloned list should independent with the original list.
 * 3. get(list, index). Get the element on the index position of the list.
 * 4. set(list, index, val). Change the value the element of index position to given val.
 * 5. remove(list, index). Remove the element on the index position.
 * 6. indexOf(list, val). Find the first index of element that equals to val and return its index.
 */

public class Solution {
    /**
     * @param n: You should generate an array list of n elements.
     * @return: The array list your just created.
     */

    ArrayList<Integer> list = new ArrayList<Integer>();
    ArrayList<Integer> listClone = new ArrayList<Integer>();
    int kth = 0;

    public ArrayList<Integer> create(int n) {
        // check if n is/isn't negative
        if (n >= 0) {
            for (int i = 0; i < n; i++) {
                list.add(i);
            }
        }
        return list;
    }

    /**
     * @param list: The list you need to clone
     * @return: A deep copyed array list from the given list
     */
    public ArrayList<Integer> clone(ArrayList<Integer> list) {
        // check if the list is/isn't null
        if(!list.isEmpty()) {
            listClone = (ArrayList<Integer>) list.clone();
        }
        return listClone;
    }

    /**
     * @param list: The array list to find the kth element
     * @param k: Find the kth element
     * @return: The kth element
     */
    public int get(ArrayList<Integer> list, int k) {
        // check if list and k are valid
        if (!list.isEmpty() && k >= 0) {
            kth = list.get(k);
        }
        return kth;
    }

    /**
     * @param list: The array list
     * @param k: Find the kth element, set it to val
     * @param val: Find the kth element, set it to val
     */
    public void set(ArrayList<Integer> list, int k, int val) {
        // check if list and k are valid
        if (!list.isEmpty() && k >= 0) {
            list.set(k, val);
        }
    }

    /**
     * @param list: The array list to remove the kth element
     * @param k: Remove the kth element
     */
    public void remove(ArrayList<Integer> list, int k) {
        // check if list and k are valid
        if (!list.isEmpty() && k >= 0) {
            list.remove(k);
        }
    }

    /**
     * @param list: The array list.
     * @param val: Get the index of the first element that equals to val
     * @return: Return the index of that element
     */
    public int indexOf(ArrayList<Integer> list, int val) {
        // check if list and k are valid
        if(list.isEmpty() || !list.contains(val)) {
            return -1;
        }
        return list.indexOf(val);
    }
}

