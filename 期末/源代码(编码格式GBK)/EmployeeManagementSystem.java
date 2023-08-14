import java.util.Scanner;

public class EmployeeManagementSystem {
	public static void main(String[] args) {
		Employee teacher = new Teacher("yifeng", 35, "数学");
		Employee leader = new Leader("chuankuan", 40, "项目团队");

		Scanner in = new Scanner(System.in);
		int select = 0;

		while (select != 4) {
			System.out.println("============================");
			System.out.println("广州大学纺织服装学院员工管理系统");
			System.out.println("1. 员工信息");
			System.out.println("2. 设置信息");
			System.out.println("3. 关于系统");
			System.out.println("4. 退出系统");
			System.out.println("============================");
			System.out.print("请选择：");
			select = in.nextInt();
			System.out.println();

			switch (select) {
				case 1:
					System.out.println("1. 领导");
					System.out.println("2. 老师");
					System.out.println("0. 返回上一层");
					System.out.println("============================");
					System.out.print("请选择：");
					int select1 = in.nextInt();
					System.out.println();

					switch (select1) {
						case 1:
							System.out.println("职工信息:");
							leader.displayInfo();
							System.out.println();
							break;
						case 2:
							System.out.println("职工信息:");
							teacher.displayInfo();
							System.out.println();
							break;
						case 0:
							break;
						default:
							System.out.println("无效的选项！");
							System.out.println();
							break;
					}
					break;
				case 2:
					System.out.println("1. 领导");
					System.out.println("2. 老师");
					System.out.println("0. 返回上一层");
					System.out.println("============================");
					System.out.print("请选择：");
					int select2 = in.nextInt();
					System.out.println();

					switch (select2) {
						case 1:
							System.out.println("1. 设置行为");
							System.out.println("2. 设置工资");
							System.out.println("0. 返回上一层");
							System.out.println("============================");
							System.out.print("请选择：");
							int select3 = in.nextInt();
							System.out.println();

							switch (select3) {
								case 1:
									System.out.println("1. 吃饭");
									System.out.println("2. 睡觉");
									System.out.println("0. 返回上一层");
									System.out.println("============================");
									System.out.print("请选择：");
									int select4 = in.nextInt();
									System.out.println();

									switch (select4) {
										case 1:
											leader.setBehavior(new EatBehavior());
											System.out.println("设置吃饭成功\n");
											break;
										case 2:
											leader.setBehavior(new SleepBehavior());
											System.out.println("设置睡觉成功\n");
											break;
										case 0:
											break;
										default:
											System.out.println("无效的选项！");
											System.out.println();
											break;
									}
									break;
								case 2:
									System.out.println("请输入领导的工资：");
									double salary = in.nextDouble();
									leader.setSalary(salary);
									System.out.println("设置工资成功\n");
									break;
								case 0:
									break;
								default:
									System.out.println("无效的选项！");
									System.out.println();
									break;
							}
							break;
						case 2:
							System.out.println("1. 设置行为");
							System.out.println("2. 设置工资");
							System.out.println("0. 返回上一层");
							System.out.println("============================");
							System.out.print("请选择：");
							int select5 = in.nextInt();
							System.out.println();

							switch (select5) {
								case 1:
									System.out.println("1. 吃饭");
									System.out.println("2. 睡觉");
									System.out.println("0. 返回上一层");
									System.out.println("============================");
									System.out.print("请选择：");
									int select6 = in.nextInt();
									System.out.println();

									switch (select6) {
										case 1:
											teacher.setBehavior(new EatBehavior());
											System.out.println("设置吃饭成功\n");
											break;
										case 2:
											teacher.setBehavior(new SleepBehavior());
											System.out.println("设置睡觉成功\n");
											break;
										case 0:
											break;
										default:
											System.out.println("无效的选项！");
											System.out.println();
											break;
									}
									break;
								case 2:
									System.out.println("请输入老师的工资：");
									double salary = in.nextDouble();
									teacher.setSalary(salary);
									System.out.println("设置工资成功\n");
									break;
								case 0:
									break;
								default:
									System.out.println("无效的选项！");
									System.out.println();
									break;
							}
							break;
						case 0:
							break;
						default:
							System.out.println("无效的选项！");
							System.out.println();
							break;
					}
					break;
				case 3:
					System.out.println("============================");
					System.out.println("本系统由曹传宽开发，致力于服务广州大学纺织服装学院全体员工。");
					System.out.println("============================\n");
					break;
				case 4:
					System.out.println("感谢使用员工管理系统，再见！");
					break;
				default:
					System.out.println("无效的选项！");
					System.out.println();
					break;
			}
		}
	}
}
