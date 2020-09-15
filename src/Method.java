import org.jcp.xml.dsig.internal.dom.DOMUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class Method {
    FictionBook[] fictionBooks = new FictionBook[5];
    ProgrammingBook[] programmingBooks = new ProgrammingBook[5];
    Scanner sc = new Scanner(System.in);

    public void add() {
        ProgrammingBook java1 = new ProgrammingBook(01, "Java core1", 100000, "Duong1", "java", "SonMC1");
        programmingBooks[0] = java1;
        ProgrammingBook java2 = new ProgrammingBook(02, "Java core2", 300000, "Duong2", "java", "SonMC2");
        programmingBooks[1] = java2;
        ProgrammingBook java3 = new ProgrammingBook(03, "Java core3", 200000, "Duong3", "js", "SonMC3");
        programmingBooks[2] = java3;
        ProgrammingBook java4 = new ProgrammingBook(04, "Java core4", 700000, "Duong4", "java", "SonMC4");
        programmingBooks[3] = java4;
        ProgrammingBook java5 = new ProgrammingBook(05, "Java core5", 1200000, "Duong5", "java", "SonMC5");
        programmingBooks[4] = java5;


        FictionBook php1 = new FictionBook(001, "PHP core 1", 10000, "KieuAnh1", "essy");
        fictionBooks[0] = php1;
        FictionBook php2 = new FictionBook(002, "PHP core 2", 20000, "KieuAnh2", "essy");
        fictionBooks[1] = php2;
        FictionBook php3 = new FictionBook(003, "PHP core 3", 30000, "KieuAnh3", "hard");
        fictionBooks[2] = php3;
        FictionBook php4 = new FictionBook(004, "PHP core 4", 40000, "KieuAnh4", "hard");
        fictionBooks[3] = php4;
        FictionBook php5 = new FictionBook(005, "PHP core 5", 50000, "KieuAnh5", "hard");
        fictionBooks[4] = php5;

        System.out.println("Add complete!!");
    }

    public void tinhtien() {
        float tongtienPRB = 0;
        float tongtienFTB = 0;
        float tongtien = 0;
        for (int i = 0; i < programmingBooks.length; i++) {
             tongtienPRB +=  programmingBooks[i].price  ;
        }
        for (int i = 0; i < fictionBooks.length; i++) {
            tongtienFTB += fictionBooks[i].price ;
        }
        tongtien = tongtienFTB + tongtienPRB;
        System.out.println("Tong tien la: " + tongtien + "VND");
    }

    public void searchPGB(String name){
        for (ProgrammingBook prB: programmingBooks ) {
            if (name.equals(prB.name)){
                System.out.println("Price of " + prB.name + " is: " + prB.price + "VND");
                break;
            }
        }
    }

    public void searchFTB(String name1){
        for (FictionBook ftB: fictionBooks) {
            if (name1.equals(ftB.name)){
                System.out.println("Price of" + ftB.name + " is: " + ftB.price + "VND");
            }
        }
    }





//    public void add() {
//        for (int i = 0; i < programmingBooks.length; i++) {
//            System.out.println("Enter ID of book: ");
//            int bookID = Integer.parseInt(sc.nextLine());
//            System.out.println("Enter name of book: ");
//            String name = sc.nextLine();
//            System.out.println("Enter price of book: ");
//            double price = Float.parseFloat(sc.nextLine());
//            System.out.println("Enter author of book: ");
//            String author = sc.nextLine();
//            System.out.println("Language of book is: ");
//            String language = sc.nextLine();
//            System.out.println("Framework of book is: ");
//            String framework = sc.nextLine();
//            ProgrammingBook prB = new ProgrammingBook(bookID, name, (float) price, author, language, framework);
//            programmingBookArrayList.add(prB);
//            break;
//            //break;
//            //System.out.println(prB.toString());
//        }
//    }
//    public void sum(){
//        for (ProgrammingBook prb : programmingBooks
//        ) {
//            double sum = prb.price++;
//            System.out.println(sum);
//        }
//    }
//
//    public void search() {
//        for (ProgrammingBook prB : programmingBookArrayList
//        ) {
//            System.out.println("Enter name of book: ");
//            String searchName = sc.nextLine();
//                if (searchName.equals(prB.name)){
//                    System.out.println(prB.toString());
//
//                }
//        }
//    }
}



