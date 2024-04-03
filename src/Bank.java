//Hassan
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// private instance variables
public class Bank {
    private idAccountMap HashMap<String, BankAccount>;
    private idList ArrayList<String>;

    //Constructor

    public Bank() {
        idAccountMap = new HashMap<>();
        idList = new ArrayList<>();
    }


    public void addAccount(String id, BankAccount account) {
        idAccountMap.put(id, account);
        idList.add(id);
    }

    public boolean removeAccount(String id) {
        if (idList.contains(id)) {
            idAccountMap.remove(id);
            idList.remove(id);
            return true;
        }
        return false;
    }

    public void printAllAccounts() {
        for (String id : idList) {
            if (idAccountMap.containsKey(id)) {
                BankAccount account = idAccountMap.get(id);
                account.printDetails();
            }
        }
    }

    public void printAllSavingsAccounts() {
        for (String id : idList)
            if (idAccountMap.containsKey(id)) {
                BankAccount account = idAccountMap.get(id);
                if (account instanceof SavingsAccount) {
                    account.printDetails();
                }
            }
    }
}


            public void printAllCurrentAccounts() {
            for (String id : idList) {
                if (idAccountMap.containsKey(id)) {
                    BankAccount account = idAccountMap.get(id);
                    if (account instanceof CurrentAccount) {
                        account.printDetails();
                    }
                }
            }
        }
    }