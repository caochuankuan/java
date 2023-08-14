class wine{
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public wine(){}
    public String drink(){
        return "drink that is:"+getName();
    }
    public String tostring(){
        return null;
    }
}

class jnc extends wine{
    public jnc(){
        setName("jnc");
    }
    public String drink(){
        return "drink that is:"+getName();
    }
    public String tostring(){
        return "wine:"+getName();
    }
}

class jqj extends wine{
    public jqj(){
        setName("jqj");
    }
    public String drink(){
        return "drink that is:"+getName();
    }
    public String tostring(){
        return "wine:"+getName();
    }
}

public class duotlianxi {
    public static void main(String[] args) {
        wine[] wines=new wine[2];
        jnc jnca=new jnc();
        jqj jqja=new jqj();
        wines[0]=jnca;
        wines[1]=jqja;
        for (int i=0;i<2;i++){
            System.out.println(wines[i].tostring()+"----"+wines[i].drink());
        }
        System.out.println("-------------");
    }
}
