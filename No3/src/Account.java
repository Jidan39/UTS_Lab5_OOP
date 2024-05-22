public class Account {
    private String id;
    private String name;
    private int balance;

    // Constructor dengan saldo awal
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Constructor tanpa saldo awal (saldo default = 0)
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    // Method getter untuk mendapatkan ID
    public String getID() {
        return id;
    }

    // Method getter untuk mendapatkan nama
    public String getName() {
        return name;
    }

    // Method getter untuk mendapatkan saldo
    public int getBalance() {
        return balance;
    }

    // Method untuk menambah saldo (kredit)
    public void credit(int amount) {
        balance += amount;
    }

    // Metode untuk mengurangi saldo debit
    public void debit(int amount) {
        // Jika jumlah yang akan didebit kurang dari atau sama dengan saldo
        if (amount <= balance) {
            balance -= amount;
        } else {
            // Jika jumlah melebihi saldo, maka akan diam
            System.out.println("Amount exceeded balance");
        }
    }

    // Metode untuk mentransfer saldo ke akun lain
    public void transferTo(Account anotherAccount, int amount) {
        // Jika jumlah yang akan ditransfer kurang dari atau sama dengan saldo
        if (amount <= balance) {
            this.debit(amount); // Mengurangi saldo dari akun ini
            anotherAccount.credit(amount); // Menambahkan saldo ke akun lain
        } else {
            // Jika jumlah melebihi saldo, tampilkan pesan error
            System.out.println("Amount exceeded balance");
        }
    }

    // Metode toString untuk menampilkan informasi akun
    @Override
    public String toString() {
        return "Account[id=" + id + ",name=" + name + ",balance=" + balance + "]";
    }
}
