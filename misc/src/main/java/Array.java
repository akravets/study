public class Array {
    public static void main(String[] args) {
        int[] arr = new int[]{1,5,10,3};

        for(int i = 0; i < arr.length; i++){
            System.out.print("i: " + arr[i]);
            System.out.println("\n");
            for(int j = i + 1; j < arr.length; j++){
                System.out.print(arr[j] + ", ");
            }
            System.out.println("\n");
        }
    }
}
