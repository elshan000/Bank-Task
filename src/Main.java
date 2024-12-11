import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(MenuPrint.accountMenu);
            int a = sc.nextInt();
            switch (a) {
                case 1 -> {
                    System.out.println("kodu daxil edin-");
                    String parol = sc.next();
                    if (parol.equals(AdminParol.parol)) {
                        while (true) {
                            System.out.println(MenuPrint.adminMenu);
                            int option = sc.nextInt();
                            sc.nextLine();
                            if (option == 3) {
                                break;
                            }
                            switch (option) {
                                case 1 -> System.out.println(Customer.generalDeposit);
                                case 2 -> System.out.println(Account.printAcoounts());
                            }

                        }

                    } else {
                        System.out.println("daxil edilen kod sehvdir");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    }
                }
                case 2 -> {
                    System.out.println(MenuPrint.menu);
                    int option2 = sc.nextInt();
                    sc.nextLine();
                    if (option2 == 5) {
                        break;
                    }
                    switch (option2) {
                        case 1 -> {
                            System.out.println("Adinizi ve soyadinizi daxil edin");
                            String name = sc.nextLine();
                            System.out.println("Parol teyin edin");
                            String password = sc.nextLine();

                            Customer customer = new Customer();
                            customer.setName(name);
                            customer.setPassword(password);
                            Account.createAccount(customer);
                        }
                        case 2 -> {
                            System.out.println("Adinizi ve soyadinizi daxil edin - ");
                            String name = sc.nextLine();
                            Customer customer = Account.enterAccount(name);
                        }
                        case 3 -> {
                            System.out.println("Adinizi ve soyadinizi daxil edin - ");
                            String name = sc.nextLine();
                            Customer customer = Account.enterAccount(name);
                            System.out.println("Daxil etmek istediyiniz meblegi yazin - ");
                            int money = sc.nextInt();
                            System.out.println(customer.getMoney() + money);  // burada customer.getMoney null oldugu ucun ustune toplamaq olmur
                        }
                    }
                }
            }
        }
    }
}