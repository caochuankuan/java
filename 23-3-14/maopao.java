import java.util.Scanner;

public class maopao {
    public static void main(String[] args) {
        int i,j,k;
        //��������
        int[] a = new int[10];
        System.out.print("������ʮ��������");
        Scanner input = new Scanner(System.in);
        //���鸳ֵ
        for (i=0;i<10;i++){
            a[i] = input.nextInt();
        }
        System.out.print("������������ǣ�");
        //��ӡ����
        for (i=0;i<10;i++){
            System.out.print(a[i]+"  ");
        }
        for(i=0;i<10-1;i++){//ʮ�������žŴ�
            for(j=0;j<10-1-i;j++){//-i--����
                if(a[j]>a[j+1]){//��������λ��
                    k=a[j];
                    a[j]=a[j+1];
                    a[j+1]=k;
                }
            }
        }
        System.out.print("\n�����������ǣ�");
        //�ٴδ�ӡ����
        for (i=0;i<10;i++){
            System.out.print(a[i]+"  ");
        }
        System.out.println();
    }
}
