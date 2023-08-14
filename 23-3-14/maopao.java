import java.util.Scanner;

public class maopao {
    public static void main(String[] args) {
        int i,j,k;
        //创建数组
        int[] a = new int[10];
        System.out.print("请输入十个整数：");
        Scanner input = new Scanner(System.in);
        //数组赋值
        for (i=0;i<10;i++){
            a[i] = input.nextInt();
        }
        System.out.print("你输入的数组是：");
        //打印数组
        for (i=0;i<10;i++){
            System.out.print(a[i]+"  ");
        }
        for(i=0;i<10-1;i++){//十个数，排九次
            for(j=0;j<10-1-i;j++){//-i--已排
                if(a[j]>a[j+1]){//两数交换位置
                    k=a[j];
                    a[j]=a[j+1];
                    a[j+1]=k;
                }
            }
        }
        System.out.print("\n排序后的数组是：");
        //再次打印数组
        for (i=0;i<10;i++){
            System.out.print(a[i]+"  ");
        }
        System.out.println();
    }
}
