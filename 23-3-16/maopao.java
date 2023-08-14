import java.util.Scanner;
public class maopao {
    public static void main(String[] args) {
        int i,j,k;
        int[] a = new int[10];
        System.out.println("1.please input 10 int number:");
        Scanner input = new Scanner(System.in);
        for (i=0;i<10;i++){
            a[i] = input.nextInt();
        }
        System.out.println("\n2.you input the int number is:");
        for (i=0;i<10;i++){
            System.out.print(a[i]+"  ");
        }
        for(i=0;i<10-1;i++){
            for(j=0;j<10-1-i;j++){
                if(a[j]<a[j+1]){
                    k=a[j];
                    a[j]=a[j+1];
                    a[j+1]=k;
                }
            }
        }
        System.out.println("\n\n3.after maopaopaixu:");
        for (i=0;i<10;i++){
            System.out.print(a[i]+"  ");
        }
        System.out.println();
    }
}
