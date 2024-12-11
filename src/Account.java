import java.util.Scanner;

public class Account {
    public static void createAccount(Customer customer) {
        Customer.customers[Customer.customerCount++] = customer;
    }

    public static boolean printAcoounts() {
        for (int i = 0; i < Customer.customerCount; i++) {
            Customer customer = Customer.customers[i];
            System.out.println(i + "-ci musteri" + Customer.customers[i].getName());
        }
        return false;
    }

    public static Customer enterAccount(String name) {
        for (int i = 0; i < Customer.customerCount; i++) {
            Scanner sc = new Scanner(System.in);
            Customer customer = Customer.customers[i];
            if (customer.getName().equals(name)) {
                System.out.println("Parolunuzu daxil edin - ");
                String password = sc.nextLine();
                if (password.equals(customer.getPassword())) {
                    System.out.println("Ad,Soyad - " + customer.getName());
                    System.out.println("Balans - " + customer.getMoney());
                    System.out.println("Illik depozit - " + customer.getDeposit());
                    System.out.println("                                      ");
                    System.out.println("                                      ");
                }
                else{
                    System.out.println("Daxil edilen parol sehvdir");
                }
            }
            else{
                System.out.println("Bele bir istifadeciye rast gelinmedi");
            }
        }
        return null;
    }

}

