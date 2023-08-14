class Teacher extends Employee {
    public Teacher(String name, int age, String job) {
        super(name, age, job);
    }

    public void performJob() {
        // 不打印工作
    }
}