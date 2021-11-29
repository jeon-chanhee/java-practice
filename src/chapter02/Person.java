package chapter02;

public class Person {
    private String name;
    private int age; // 접근제한
    private int cashAmount;
    private BankAccount account;

    public void setAge(int newAge) {
        if (newAge >= 0) {
            age = newAge;
        }
    }

    public int getAge() {
        return age;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void setCashAmount(int newCashAmount) {
        if (newCashAmount >= 0) {
            cashAmount = newCashAmount;
        }
    }

    public int getCashAmount() {
        return cashAmount;
    }

    public void setAccount(BankAccount newAccount) {
            account = newAccount;
    }

    public BankAccount getAccount() { // account의 자료형 BankAccount
        return account;
    }
}
