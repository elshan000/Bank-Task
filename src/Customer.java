public class Customer {

    private String name;
    private String password;
    private Double money=0.0;
    private Double deposit=0.0;

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
    public void setMoney(Double money){
        this.money = money;
    }
    public Double getMoney(){
        return money;
    }
    public void setDeposit(Double deposit){
        this.deposit = deposit;
    }
    public Double getDeposit(){
        return deposit;
    }

}
