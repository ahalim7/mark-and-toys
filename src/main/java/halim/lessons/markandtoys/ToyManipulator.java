/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halim.lessons.markandtoys;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javafx.util.Pair;

/**
 *
 * @author AbdElHalim
 */
public class ToyManipulator {

    public static void main(String[] args) {

        int result = maximumToys(new int[]{1, 2, 3, 4, 55}, 70);
        System.out.println(result);
    }

    // Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {

        List<Integer> list = new ArrayList<>();
        int toys = 0;
        int sum = 0;

        for (int value : prices) {
            if (value <= k) {
                list.add(value);
            }
        }
        Collections.sort(list);
        for (int value : list) {
            if ((sum + value) <= k) {
                sum += value;
                toys++;
            }
        }
        return toys;

    }
}
