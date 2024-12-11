public class Customer {
    public static Customer[] customers = new Customer [2];
    public static int customerCount = 0;
    public static int generalDeposit = 0;

    private String name;
    private String password;
    private int money=0;
    private int deposit=0;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
    public void setMoney(int money){
        this.money = money;
    }
    public int getMoney(){
        return money;
    }
    public void setDeposit(int deposit){
        this.deposit = deposit;
    }
    public int getDeposit(){
        return deposit;
    }

}
