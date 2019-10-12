package net.ken.base.common;

/**
 * helper class
 */
public class Helper {

    public static void printArr(short[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void printArr(short[] arr, int... index) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            boolean keyIndex = contain(index, i);
            if (keyIndex){
                System.out.print("(");
            }
            System.out.print(arr[i]);
            if (keyIndex){
                System.out.print(")");
            }
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    private static boolean contain(int[] arr, int num){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num){
                return true;
            }
        }
        return false;
    }

    public static void printLine(){
        System.out.println();
    }
}
