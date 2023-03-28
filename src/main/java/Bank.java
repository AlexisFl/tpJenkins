public class Bank {
    private Account[] accounts;
    private int nbAccounts;

    public Bank() {
        accounts = new Account[100];
        nbAccounts = 0;
    }

    public void addAccount(Account account) {
        accounts[nbAccounts] = account;
        nbAccounts++;
    }

    public void removeAccount(int id) {
        for (int i = 0; i < nbAccounts; i++) {
            if (accounts[i].getId() == id) {
                accounts[i] = accounts[nbAccounts - 1];
                nbAccounts--;
                break;
            }
        }
    }

    public void displayAllAccounts() {
        for (int i = 0; i < nbAccounts; i++) {
            System.out.println("Account " + accounts[i].getId() + " has a balance of " + accounts[i].getSolde());
        }
    }

    public void transfer(int id1, int id2, double amount) {
        Account account1 = null;
        Account account2 = null;
        for (int i = 0; i < nbAccounts; i++) {
            if (accounts[i].getId() == id1) {
                account1 = accounts[i];
            }
            if (accounts[i].getId() == id2) {
                account2 = accounts[i];
            }
        }
        if (account1 != null && account2 != null) {
            account1.retrait(amount);
            account2.depot(amount);
        }
    }


}
