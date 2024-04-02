public class Acess_modifier{
    public static void main(String args[]){

        BankAccount myAcc = new BankAccount();
        myAcc.userName = "Tejashri";
        myAcc.setPassword("abcdefghi");

        System.out.println(myAcc.userName);
       
        // System.out.println(myAcc.password);   
        // password has private access in BankAccount
    }
} 

class BankAccount{
    public String userName;
    private String password;

    public void setPassword(String pwd){
        password = pwd;
    } 
}