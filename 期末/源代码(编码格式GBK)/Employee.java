abstract class Employee {
    private String name;
    private int age;
    private String job;
    private HumanBehavior behavior;
    private double salary;

    public Employee(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.behavior = null; // 行为初始为空
    }

    public void setBehavior(HumanBehavior behavior) {
        this.behavior = behavior;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("姓名: " + name);
        System.out.println("年龄: " + age);
        System.out.println("工作: " + job);
        if (behavior != null) {
            behavior.doAction();
        }
        if (salary != 0) {
            System.out.println("工资: " + salary);
        }
        System.out.println("============================");
    }

    public abstract void performJob();
}