import java.util.Scanner;
public class Diamond{
    public static void main(String args[]){
        Scanner snr=new Scanner(System.in);
	System.out.println("Enter the number of rows to print");
        int n=snr.nextInt();
	System.out.println("The diamond pattern is: ");
        for(int i=0;i<n;i++){
            for(int j=n-i;j>1;j--){
                System.out.print(" ");
            }
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=n-1-i;j>0;j--){
                System.out.print("*");
            }
            for(int j=n-2-i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}