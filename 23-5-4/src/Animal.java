public abstract class Animal { // 声明一个抽象类Animal
    public String type;
    public String name;
    public int age;
    public int weight;

    public void eat() { // 定义方法eat()
        System.out.println("动物爱吃饭");
    }

    public abstract void breath(); // 定义抽象方法breath()

    public void sleep() { // 定义方法sleep()
        System.out.println("动物在睡觉");
    }

    public String toString() { // 定义一个Animal的toString 方法
        String returnString = null;
        // 定义返回值
        returnString = "名字：" + this.name + "\n" + "种类：" + this.type + "\n" + "年龄：" + this.age + "\n" + "体重："
                + this.weight;
        return returnString;
    }
    public boolean equals(Object ob) {
        boolean bool = false;
        if(this==ob)
            bool=true;
        if(ob==null)
            bool=false;
        if(ob instanceof Animal) {
            bool=((Animal)ob).age==this.age&&((Animal)ob).name==this.name&&((Animal)ob).type==this.type&&((Animal)ob).weight==this.weight;
        }
        return bool;
    }
}

