package net.ken.base.sort;

import net.ken.base.common.Helper;

public class SelectionSort extends Helper {

    /**
     * 首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，
     * 然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序
     * 序列的末尾。以此类推，直到所有元素均排序完毕。
     * [ 10, 3, 9, 8, 1, 7, 21, 2 ]
     * @see <a href="https://en.wikipedia.org/wiki/Selection_sort"></a>
     * @param arr input array
     * @return sorted array
     */
    public static short[] selectionSort(short[] arr) {
        int top = arr.length - 1; //未排好序元素的上限
        for (int i = 0; i < arr.length - 1; i++) {
            int maxIndex = 0;
            for (int j = 0; j <= top; j++) {
                if (arr[maxIndex] <= arr[j]) {
                    maxIndex = j;
                }
            }
            short temp = arr[maxIndex];
            arr[maxIndex] = arr[top];
            arr[top] = temp;
            top--;
        }
        return arr;
    }
}
