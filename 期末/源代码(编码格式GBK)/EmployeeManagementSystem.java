import java.util.Scanner;

public class EmployeeManagementSystem {
	public static void main(String[] args) {
		Employee teacher = new Teacher("yifeng", 35, "��ѧ");
		Employee leader = new Leader("chuankuan", 40, "��Ŀ�Ŷ�");

		Scanner in = new Scanner(System.in);
		int select = 0;

		while (select != 4) {
			System.out.println("============================");
			System.out.println("���ݴ�ѧ��֯��װѧԺԱ������ϵͳ");
			System.out.println("1. Ա����Ϣ");
			System.out.println("2. ������Ϣ");
			System.out.println("3. ����ϵͳ");
			System.out.println("4. �˳�ϵͳ");
			System.out.println("============================");
			System.out.print("��ѡ��");
			select = in.nextInt();
			System.out.println();

			switch (select) {
				case 1:
					System.out.println("1. �쵼");
					System.out.println("2. ��ʦ");
					System.out.println("0. ������һ��");
					System.out.println("============================");
					System.out.print("��ѡ��");
					int select1 = in.nextInt();
					System.out.println();

					switch (select1) {
						case 1:
							System.out.println("ְ����Ϣ:");
							leader.displayInfo();
							System.out.println();
							break;
						case 2:
							System.out.println("ְ����Ϣ:");
							teacher.displayInfo();
							System.out.println();
							break;
						case 0:
							break;
						default:
							System.out.println("��Ч��ѡ�");
							System.out.println();
							break;
					}
					break;
				case 2:
					System.out.println("1. �쵼");
					System.out.println("2. ��ʦ");
					System.out.println("0. ������һ��");
					System.out.println("============================");
					System.out.print("��ѡ��");
					int select2 = in.nextInt();
					System.out.println();

					switch (select2) {
						case 1:
							System.out.println("1. ������Ϊ");
							System.out.println("2. ���ù���");
							System.out.println("0. ������һ��");
							System.out.println("============================");
							System.out.print("��ѡ��");
							int select3 = in.nextInt();
							System.out.println();

							switch (select3) {
								case 1:
									System.out.println("1. �Է�");
									System.out.println("2. ˯��");
									System.out.println("0. ������һ��");
									System.out.println("============================");
									System.out.print("��ѡ��");
									int select4 = in.nextInt();
									System.out.println();

									switch (select4) {
										case 1:
											leader.setBehavior(new EatBehavior());
											System.out.println("���óԷ��ɹ�\n");
											break;
										case 2:
											leader.setBehavior(new SleepBehavior());
											System.out.println("����˯���ɹ�\n");
											break;
										case 0:
											break;
										default:
											System.out.println("��Ч��ѡ�");
											System.out.println();
											break;
									}
									break;
								case 2:
									System.out.println("�������쵼�Ĺ��ʣ�");
									double salary = in.nextDouble();
									leader.setSalary(salary);
									System.out.println("���ù��ʳɹ�\n");
									break;
								case 0:
									break;
								default:
									System.out.println("��Ч��ѡ�");
									System.out.println();
									break;
							}
							break;
						case 2:
							System.out.println("1. ������Ϊ");
							System.out.println("2. ���ù���");
							System.out.println("0. ������һ��");
							System.out.println("============================");
							System.out.print("��ѡ��");
							int select5 = in.nextInt();
							System.out.println();

							switch (select5) {
								case 1:
									System.out.println("1. �Է�");
									System.out.println("2. ˯��");
									System.out.println("0. ������һ��");
									System.out.println("============================");
									System.out.print("��ѡ��");
									int select6 = in.nextInt();
									System.out.println();

									switch (select6) {
										case 1:
											teacher.setBehavior(new EatBehavior());
											System.out.println("���óԷ��ɹ�\n");
											break;
										case 2:
											teacher.setBehavior(new SleepBehavior());
											System.out.println("����˯���ɹ�\n");
											break;
										case 0:
											break;
										default:
											System.out.println("��Ч��ѡ�");
											System.out.println();
											break;
									}
									break;
								case 2:
									System.out.println("��������ʦ�Ĺ��ʣ�");
									double salary = in.nextDouble();
									teacher.setSalary(salary);
									System.out.println("���ù��ʳɹ�\n");
									break;
								case 0:
									break;
								default:
									System.out.println("��Ч��ѡ�");
									System.out.println();
									break;
							}
							break;
						case 0:
							break;
						default:
							System.out.println("��Ч��ѡ�");
							System.out.println();
							break;
					}
					break;
				case 3:
					System.out.println("============================");
					System.out.println("��ϵͳ�ɲܴ������������ڷ�����ݴ�ѧ��֯��װѧԺȫ��Ա����");
					System.out.println("============================\n");
					break;
				case 4:
					System.out.println("��лʹ��Ա������ϵͳ���ټ���");
					break;
				default:
					System.out.println("��Ч��ѡ�");
					System.out.println();
					break;
			}
		}
	}
}
