class Leader extends Employee {
    public Leader(String name, int age, String job) {
        super(name, age, job);
    }

    public void performJob() {
        // 不打印工作
    }
}