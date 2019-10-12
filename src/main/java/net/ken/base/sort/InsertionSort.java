package net.ken.base.sort;

import net.ken.base.common.Helper;

public class InsertionSort extends Helper {

    /**
     * 一般来说，插入排序都采用in-place在数组上实现。具体算法描述如下：
     * 1.从第一个元素开始，该元素可以认为已经被排序
     * 2.取出下一个元素，在已经排序的元素序列中从后向前扫描
     * 3.如果该元素（已排序）大于新元素，将该元素移到下一位置
     * 4.重复步骤3，直到找到已排序的元素小于或者等于新元素的位置
     * 5.将新元素插入到该位置后
     * 重复步骤2~5
     * [ 10, 3, 9, 8, 1, 7, 21, 2 ]
     * @see <a href="https://en.wikipedia.org/wiki/Insertion_sort"></a>
     * @param arr input array
     * @return sorted array
     */
    public static short[] insertionSort(short[] arr) {
        for (int i = 1; i < arr.length; i++) {
            short cur = arr[i];
            int index = i;
            while (index > 0 && cur < arr[index - 1]) {
                arr[index] = arr[index - 1];
                index--;
            }
            arr[index] = cur;
        }
        return arr;
    }
}
