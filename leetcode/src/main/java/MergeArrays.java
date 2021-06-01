public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 11, 34};
        int[] arr2 = new int[]{2, 5, 6};

        merge(arr1, arr2);
    }

    private static void merge(int[] arr1,int[] arr2) {
       int[] mergedArray = new int[arr1.length + arr2.length];

       int i = 0;
       int j = 0;
       int m = 0;

       while(i < arr1.length && j < arr2.length){
           if(arr1[i] < arr2[j]){
               mergedArray[m] = arr1[i];
               i++;
           }
           else{
               mergedArray[m] = arr2[j];
               j++;
           }
           m++;
       }

        while (i < arr1.length)
        {
            mergedArray[m] = arr1[i];
            i++;
            m++;
        }

        while (j < arr2.length)
        {
            mergedArray[m] = arr2[j];
            j++;
            m++;
        }

        System.out.println();
    }
}
