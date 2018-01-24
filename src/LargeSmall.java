public class LargeSmall {
    public static void main(String[] args) {
        int[] arr = {14,34,60,12,98};
        int max=0,min=arr[0];
        for (int i=1; i<arr.length;i++){
            if(max<=arr[i])
            max= arr[i];
        }
        System.out.println("the maximum number is "+max);

        for (int j=2; j<arr.length;j++) {
          if (min>=arr[j])
              min= arr[j];
        }
        System.out.println("the minimum number is "+min);
    }


}
