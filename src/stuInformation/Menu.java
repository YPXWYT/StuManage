package stuInformation;

import java.util.Scanner;

/**
 * 菜单
 *
 * javadoc
 *
 * @author ypx
 */
public class Menu {
    Scanner scanner = new Scanner(System.in);
    Input IP=new Input();
    public void showMenu() {
        int option;
        do {
            System.out.println("-----------------------------");
            System.out.println("|       1.添加学生           |");
            System.out.println("|       2.查看所有学生       |");
            System.out.println("|       3.删除学生           |");
            System.out.println("|       4.修改学生信息       |");
            System.out.println("|       5.退出系统           |");
            System.out.println("|       请选择（1-5）        |");
            System.out.println("-----------------------------");
            option = scanner.nextInt();
            switch (option) {
                case 1:IP.addInput();break;
                case 2:IP.showInput();break;
                case 3:IP.deleteInput();break;
                case 4:IP.alterInput();break;
                case 5:System.out.print("谢谢使用！");break;
                default:System.out.print("输入错误！");break;
            }
        } while (option != 5);
    }
}
