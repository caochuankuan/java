class car {
    int gas;
    private String Brand;

    car(String vBrand, int vGas) {
        Brand = vBrand;
        gas = vGas;
    }

    void Disp() {
        System.out.println("品牌" + Brand + "油量" + gas);
    }
}

public class thiss {
    public static void main(String[] args) {
        car mycar = new car("Audi", 10);
        mycar.Disp();
    }
}

