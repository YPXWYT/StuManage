package stuInformation;

import java.util.Scanner;

public class Input {
    stuManage stu = new stuManage();

    public void showInput() {
        String tabName = "tabstu";
        System.out.println("————————————————————————————");
        stu.stuShow(tabName);
        System.out.println("————————————————————————————");
    }

    public void addInput() {
        String tabName = "tabstu";
        int num;
        String name;
        String birdate;
        String tel;
        String address;
        String str1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生信息：");
        System.out.println("学号：");
        num = scanner.nextInt();
        System.out.println("姓名：");
        name = scanner.next();
        System.out.println("出生日期：");
        birdate = scanner.next();
        System.out.println("电话：");
        tel = scanner.next();
        System.out.println("住址：");
        address = scanner.next();
        str1 = "'" + num + "'" + ',' + "'" + name + "'" + ',' + "'" + birdate + "'" + ',' + "'" + tel + "'" + ',' + "'" + address + "'";
        stu.stuAdd(tabName, str1);
    }

    public void deleteInput() {
        String tabName = "tabstu";
        int num;
        String str1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要删除的学生信息（学号）：");
        num = scanner.nextInt();
        str1 = "'" + num + "'";
        stu.stuDelete(tabName, str1);
    }

    public void alterInput() {
        String tabName = "tabstu";
        int num;
        int num1;
        int option;
        String name1, name;
        String birdate1, birdate;
        String tel, tel1;
        String address, address1;
        String str1;
        String str2;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1.修改学号（如：1001）");
            System.out.println("2.修改姓名（如：于朋鑫）");
            System.out.println("3.修改住址（如：贵州民族大学）");
            System.out.println("4.修改电话（如：18744972966）");
            System.out.println("5.修改出生日期（如：19980608）");
            System.out.println("0.退出");
            System.out.println("请输入需要修改的部分：");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("请输入需要修改的信息：");
                    num = scanner.nextInt();
                    str2 = "num=" + num;
                    System.out.println("请输入修改的信息：");
                    num1 = scanner.nextInt();
                    str1 = "num=" + num1;
                    stu.stuAlter(tabName, str1, str2);
                    break;
                case 2:
                    System.out.println("请输入需要修改的信息：");
                    name = scanner.next();
                    str2 = "name=" + name;
                    System.out.println("请输入修改的信息：");
                    name1 = scanner.next();
                    str1 = "name=" + name1;
                    stu.stuAlter(tabName, str1, str2);
                    break;
                case 3:
                    System.out.println("请输入需要修改的信息：");
                    tel = scanner.next();
                    str2 = "name=" + tel;
                    System.out.println("请输入修改的信息：");
                    tel1 = scanner.next();
                    str1 = "name=" + tel1;
                    stu.stuAlter(tabName, str1, str2);
                    break;
                case 4:
                    System.out.println("请输入需要修改的信息：");
                    address = scanner.next();
                    str2 = "name=" + address;
                    System.out.println("请输入修改的信息：");
                    address1 = scanner.next();
                    str1 = "name=" + address1;
                    stu.stuAlter(tabName, str1, str2);
                    break;
                case 5:
                    System.out.println("请输入需要修改的信息：");
                    birdate = scanner.next();
                    str2 = "name=" + birdate;
                    System.out.println("请输入修改的信息：");
                    birdate1 = scanner.next();
                    str1 = "name=" + birdate1;
                    stu.stuAlter(tabName, str1, str2);
                    break;
            }

        } while (option != 0);
    }
}
