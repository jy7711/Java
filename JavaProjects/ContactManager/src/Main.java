import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Main {
    static ArrayList<Contact> contacts = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    private static final String DATA_FILE = "contacts.dat";  // 数据文件保存在项目根目录

    public static void main(String[] args) {
        loadFromFile();  // 启动时加载已有数据

        while (true) {
            System.out.println("\n--- 通讯录 ---");
            System.out.println("1. 添加联系人");
            System.out.println("2. 查看所有联系人");
            System.out.println("3. 退出");
            System.out.print("请选择: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // 吃掉回车

            if (choice == 1) {
                addContact();
            } else if (choice == 2) {
                listContacts();
            } else if (choice == 3) {
                System.out.println("再见！");
                break;
            } else {
                System.out.println("无效选项");
            }
        }
        scanner.close();
    }

    static void addContact() {
        System.out.print("请输入姓名: ");
        String name = scanner.nextLine();
        System.out.print("请输入电话: ");
        String phone = scanner.nextLine();

        Contact contact = new Contact(name, phone);
        contacts.add(contact);
        saveToFile();  // 添加后立即保存

        System.out.println("添加成功！");
    }

    static void listContacts() {
        if (contacts.isEmpty()) {
            System.out.println("暂无联系人");
            return;
        }
        System.out.println("\n--- 联系人列表 ---");
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println((i + 1) + ". " + contacts.get(i));
        }
    }

    // 保存联系人列表到文件
    static void saveToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(DATA_FILE))) {
            oos.writeObject(contacts);
        } catch (IOException e) {
            System.err.println("保存失败：" + e.getMessage());
        }
    }

    // 从文件加载联系人列表
    @SuppressWarnings("unchecked")
    static void loadFromFile() {
        File file = new File(DATA_FILE);
        if (!file.exists()) {
            return;  // 首次运行没有数据文件，直接返回
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            contacts = (ArrayList<Contact>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("加载失败：" + e.getMessage());
        }
    }
}