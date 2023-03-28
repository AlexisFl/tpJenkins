import org.testng.annotations.Test;

public class TestBank {

    @Test
    public void testBank() {
        Bank bank = new Bank();
        Account account1 = new Account(1, 1000, 0);
        Account account2 = new Account(2, 2000, 0);
        Account account3 = new Account(3, 3000, 0);
        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);
        bank.displayAllAccounts();
        bank.removeAccount(2);
        bank.displayAllAccounts();
        bank.transfer(1, 3, 500);
        bank.displayAllAccounts();
    }

}
