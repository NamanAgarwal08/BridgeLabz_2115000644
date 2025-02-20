import java.util.*;

public class BankingSystem {
    HashMap<String, Integer> accounts = new HashMap<>();
    Queue<String> withdrawals = new LinkedList<>();

    public void createAccount(String acc, int balance) {
        accounts.put(acc, balance);
    }

    public void withdraw(String acc) {
        if (accounts.containsKey(acc))
            withdrawals.add(acc);
    }
}
