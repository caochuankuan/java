class simpleCall{
    int field;
}
class valuetransfer{
    void modify(int i){
        i++;
    }
    void modify(int[] arr){
        for(int i=0;i<arr.length;i++)
        arr[i]=1;
    }
    void modify(simpleCall s){
        s.field=1;
    }
}

public class diaoyong{
    public static void main(String[] args){
        valuetransfer v = new valuetransfer();
        int i=0;
        v.modify(i);
        System.out.println("i="+i);
        int[] intarr = new int[1];
        intarr[0]=100;
        v.modify(intarr);
        System.out.println("intarr[0]="+intarr[0]);
        simpleCall s = new simpleCall();
        v.modify(s);
        System.out.println("s=field="+s.field);
    }
}