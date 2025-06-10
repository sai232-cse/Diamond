import java.util.Scanner;
public class LargestNumberInArray
{ 
    public static void main(String args[]){
        Scanner snr=new Scanner(System.in);
        int a[]=new int[6];
        int max=a[0];
	System.out.println("Enter 6 elements:");
        for(int i=0;i<a.length;i++){
            a[i]=snr.nextInt();
        }
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("The largest element is: "+max);
    }
}