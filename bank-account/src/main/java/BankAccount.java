public class BankAccount {
    private int banlace;
    private boolean isAccountOpen;
    
    public BankAccount(){
        this.banlace = 0;
    }
    public void open(){        
        this.banlace = 0;
        this.isAccountOpen = true;
    }

    public synchronized void deposit(int money) throws BankAccountActionInvalidException{
        if (!this.isAccountOpen){
            throw new BankAccountActionInvalidException("Account closed");
        }

        if (money < 0){
            throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount");
        }
        this.banlace += money;
    }

    public synchronized void withdraw (int money) throws BankAccountActionInvalidException {
        if (!this.isAccountOpen){
            throw new BankAccountActionInvalidException("Account closed");
        }

        if (money < 0){
            throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount");
        }

        if (this.banlace == 0){
            throw new BankAccountActionInvalidException("Cannot withdraw money from an empty account");
        } else if (this.banlace < money){
            throw new BankAccountActionInvalidException("Cannot withdraw more money than is currently in the account");
        }
        this.banlace -= money;
    }

    public int getBalance() throws BankAccountActionInvalidException{
        if (!this.isAccountOpen){
            throw new BankAccountActionInvalidException("Account closed");
        }
        
        return this.banlace;
    }

    public void close(){
        this.isAccountOpen = false;
    }

    
}
