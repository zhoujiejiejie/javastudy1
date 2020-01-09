package day21;

public class Demo02Exception {
    public static void main(String[] args) {
        int [] a={1,2,3};
        int element = getElement(a, 3);
        System.out.println(element);
    }

    private static  int getElement(int[] arr,int index) {
        int r=arr[index];
        return r;
    }
}
