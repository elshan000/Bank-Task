import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
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
                                case 1 -> System.out.println(Bank.generalDeposit);
                                case 2 -> System.out.println(BankUtils.printAcoounts());
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
                            BankUtils.createAccount(customer);
                        }
                        case 2 -> {
                            System.out.println("Adinizi ve soyadinizi daxil edin - ");
                            String name = sc.nextLine();
                            Customer customer = BankUtils.enterAccount(name);
                        }
                        case 3 -> {
                            System.out.println("Adinizi ve soyadinizi daxil edin - ");
                            String name = sc.nextLine();
                            Customer customer = BankUtils.enterAccount(name);
                            System.out.println("Daxil etmek istediyiniz meblegi yazin - ");
                            Double money = sc.nextDouble();
                            System.out.println("Adinizi daxil edin - ");
                            BankUtils.addMoney(money);
                        }
                    }
                }
            }
        }
    }
}