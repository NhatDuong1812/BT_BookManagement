import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Method mt = new Method();
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Add");
            System.out.println("2. Tinh Tien");
            System.out.println("3. Search");
            System.out.println("Choice: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    mt.add();
                    break;
                case 2:
                    mt.tinhtien();
                    break;
                case 3:
                    System.out.println("What kind of Price do you want to find ");
                    System.out.println("1. ProgrammingBook");
                    System.out.println("2. FictionBook");
                    int choose = Integer.parseInt(sc.nextLine());
                    switch (choose) {
                        case 1:
                            System.out.println("Enter name of book: ");
                            String name = sc.nextLine();
                            mt.searchPGB(name);
                            break;
                        case 2:
                            System.out.println("Enter name of book: ");
                            String name1 = sc.nextLine();
                            mt.searchFTB(name1);
                            break;
                    }
                    break;
                default:
                    System.out.println("loi");
                    break;
            }

        } while (true);
    }
}
