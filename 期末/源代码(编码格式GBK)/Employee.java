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
        this.behavior = null; // ��Ϊ��ʼΪ��
    }

    public void setBehavior(HumanBehavior behavior) {
        this.behavior = behavior;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("����: " + name);
        System.out.println("����: " + age);
        System.out.println("����: " + job);
        if (behavior != null) {
            behavior.doAction();
        }
        if (salary != 0) {
            System.out.println("����: " + salary);
        }
        System.out.println("============================");
    }

    public abstract void performJob();
}