import java.util.Scanner;

public class BankUtils {
        public static void createAccount(Customer customer) {
            Bank.customers[Bank.customerCount++] = customer;
        }

        public static boolean printAcoounts() {
            for (int i = 0; i < Bank.customerCount; i++) {
                Customer customer = Bank.customers[i];
                System.out.println(i + "-ci musteri" + Bank.customers[i].getName());
            }
            return false;
        }

        public static Customer enterAccount(String name) {
            for (int i = 0; i < Bank.customerCount; i++) {
                Scanner sc = new Scanner(System.in);
                Customer customer = Bank.customers[i];
                if (customer.getName().equals(name)) {
                    System.out.println("Parolunuzu daxil edin - ");
                    String password = sc.nextLine();
                    if (password.equals(customer.getPassword())) {
                        System.out.println("Ad,Soyad - " + customer.getName());
                        System.out.println("Balans - " + customer.getMoney());
                        System.out.println("Illik depozit - " + customer.getDeposit());
                        System.out.println("                                      ");
                        System.out.println("                                      ");
                    } else {
                        System.out.println("Daxil edilen parol sehvdir");
                    }
                } else {
                    System.out.println("Bele bir istifadeciye rast gelinmedi");
                }
            }
            return null;
        }

        public static void addMoney(Double money) {
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            for (int i = 0; i < Bank.customerCount; i++) {
                if (name.equals(Bank.customers[i].getName())) {
                    money = money + Bank.customers[i].getMoney();
                    Bank.customers[i].setDeposit(money*0.01);
                    Bank.generalDeposit=Bank.generalDeposit+(money*0.01);
                }
                Bank.customers[i].setMoney(money);
                System.out.println("Ugurla elave olundu \n"+
                        "Balans - "+Bank.customers[i].getMoney());
                System.out.println("                                    ");
                System.out.println("                                    ");


            }
        }
    }

