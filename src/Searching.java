import java.util.Scanner;

public class Searching {
    public static void main(String[] args) {
        int x,count =0;
        System.out.println("enter x");
        Scanner sc= new Scanner(System.in);
        x= sc.nextInt();
        int a[]={12,34,67,54,66,79,86,99,45};
        for (int i=0;i<a.length; i++){
           if(x==a[i])
               count++;
        }
               if(count>0)
               System.out.println("the number is present");
           else
               System.out.println("the number is absent");
        }
    }

