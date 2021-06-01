public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5,12,0,2,1};

        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int prev = i - 1;

            while(prev >= 0 && arr[prev] > key){
                arr[prev + 1] = arr[prev];
                prev = prev - 1;
            }
            arr[prev+1] = key;
        }

        for(int i : arr){
            System.out.println(i);
        }
    }
}
