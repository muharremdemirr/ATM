package ATM;

public class UserInfo {
    private static int balance, password;

    UserInfo() {
        password = 1923;
        balance = 15000;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int _password) {
        password = _password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int change, int control) {
        if (control == 1)
            balance -= change;
        else
            balance += change;
    }
}
