package net.ken.base.sort;

import net.ken.base.common.Helper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort extends Helper {

    /**
     * 快速排序使用分治法（Divide and conquer）策略来把一个序列（list）分为较小和较大的2个子序列，然后递归地排序两个子序列。
     * 步骤为：
     * 1.挑选基准值：从数列中挑出一个元素，称为“基准”（pivot），
     * 2.分割：重新排序数列，所有比基准值小的元素摆放在基准前面，所有比基准值大的元素摆在基准后面（与基准值相等的数可以到任何一边）。在这个分割结束之后，对基准值的排序就已经完成，
     * 3.递归排序子序列：递归地将小于基准值元素的子序列和大于基准值元素的子序列排序。
     * 递归到最底部的判断条件是数列的大小是零或一，此时该数列显然已经有序。
     * [ 10, 3, 9, 8, 1, 7, 21, 2 ]
     * @param arr input array
     * @return sorted array
     * @see <a href="https://en.wikipedia.org/wiki/Quicksort"></a>
     */
    public static List<Integer> quickSort(List<Integer> arr) {
        if (arr.size() <= 1) {
            return arr;
        }

        int pivotIndex = arr.size() / 2 - 1;
        List<Integer> less = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();
        for (Integer value : arr) {
            if (value < arr.get(pivotIndex)) less.add(value);
            if (value > arr.get(pivotIndex)) greater.add(value);
        }
        System.out.print(less);
        System.out.print(" (" + arr.get(pivotIndex) + ") ");
        System.out.println(greater);
        return concatenate(quickSort(less), arr.get(pivotIndex), quickSort(greater));
    }

    public static void main(String[] args) {
        System.out.println(quickSort(Arrays.asList(10, 3, 9, 8, 1, 7, 21, 2)));
    }

    private static <T> List<T> concatenate(List<T> left, T middle, List<T> right) {
        left.add(middle);
        left.addAll(right);
        return left;
    }
}
