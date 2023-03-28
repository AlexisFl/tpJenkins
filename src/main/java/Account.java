public class Account {

    private int id;
    private double solde;
    private double interet;

    public Account(int id, double solde, double interet) {
        this.id = id;
        this.solde = solde;
        this.interet = interet;
    }

    public void depot(double montant) {
        solde += montant;
    }

    public void retrait(double montant) {
        solde -= montant;
    }

    public void transfert(Account compte, double montant) {
        retrait(montant);
        compte.depot(montant);
    }

    public void calculInteret() {
        solde += solde * interet;
    }

    public int getId() {
        return id;
    }

    public double getSolde() {
        return solde;
    }

}
