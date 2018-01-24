public class Reverse {
    void revering(int arr[], int n)
    {
        int i, j;
        System.out.println("Reversed array is :");
        for (i = n-1; i >=0; i--)
        {
                    System.out.print(arr[i] + " ");
            }
    }
    public static void main(String[] args)
    {
        Reverse r = new Reverse();
        int arr[] = {9, 2, 4, 5, 2, 3, 1};
        int arr_size = arr.length;
        r.revering(arr, arr_size);
    }
}
