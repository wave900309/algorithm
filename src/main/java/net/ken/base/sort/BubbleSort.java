package net.ken.base.sort;

import net.ken.base.common.Data;
import net.ken.base.common.Helper;

public class BubbleSort extends Helper {

    /**
     * 冒泡排序算法的运作如下：
     * <p>
     * 1.比较相邻的元素。如果第一个比第二个大，就交换他们两个。
     * 2.对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。
     * 3.针对所有的元素重复以上的步骤，除了最后一个。
     * 4.持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
     * [ 10, 3, 9, 8, 1, 7, 21, 2 ]
     *
     * @param arr input array
     * @return sorted array
     * @see <a href="https://en.wikipedia.org/wiki/Bubble_sort"></a>
     */
    public static short[] bubbleSort(short[] arr) {
        int top = arr.length - 1; //未排好序元素的上限
        for (int i = 0; i < arr.length; i++) {
            int index = 0;
            printArr(arr, index);
            while (index < top) {
                if (arr[index] > arr[index + 1]) {
                    short temp = arr[index];
                    arr[index] = arr[index + 1];
                    arr[index + 1] = temp;
                    printArr(arr, index + 1);
                }
                index++;
            }
            top--;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("original: ");
        short[] arr = bubbleSort(Data.arr());
        printArr(arr);
    }
}
