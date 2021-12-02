package chapter02;

public class BankAccount {
    private int balance;
    private Person owner;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int newBalance) {
        balance = newBalance;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person newOwner) {
        owner = newOwner;
    }


    boolean deposit(int amount) {
        // 1. write code here
        if (amount < 0 || getOwner().getCashAmount() < amount) {
            System.out.println("입금 실패입니다. 잔고: " + balance + "원, 현금: " + getOwner().getCashAmount() + "원");
            return false;
        } else {
            balance += amount;
            getOwner().setCashAmount(getOwner().getCashAmount() - amount);
            System.out.println(amount + "원 입금하였습니다. 잔고: " + balance + "원, 현금: " + getOwner().getCashAmount() + "원");
            return true;
        }
    }

    public boolean deposit(double amount, double exchangeRate) {
        System.out.println(false);
        return deposit((int) (amount * exchangeRate));
    }


    // 파라미터 : 출금할 액수(정수)
    // 리턴 : 성공여부(불린)
    boolean withdraw(int amount) {
        // 2. write code here
        if (amount < 0 || balance < amount) {
            System.out.println("출금 실패입니다. 잔고: " + balance + "원, 현금: " + getOwner().getCashAmount() + "원");
            return false;
        } else {
            balance -= amount;
            getOwner().setCashAmount(getOwner().getCashAmount() + amount);
            System.out.println(amount + "원 출금하였습니다. 잔고: " + balance + "원, 현금: " + getOwner().getCashAmount() + "원");
            return true;
        }
    }

    // 첫 번째 파라미터: 받는 사람 (Person)
    // 두 번째 파라미터: 이체할 금액 (정수)
    // 리턴 : 성공여부 (불린)
    public boolean transfer(Person to, int amount) {
        // insert code here
        return transfer(to.getAccount(), amount);
    }

    // 첫 번째 파라미터: 받는 사람의 계정 (BankAccount)
    // 두 번째 파라미터: 이체할 금액 (정수)
    // 리턴 : 성공여부 (불린)
    public boolean transfer(BankAccount to, int amount) {
        // insert code here
        boolean success;

        if (amount < 0 || amount > balance) {
            success = false;
        } else {
            balance -= amount;
            to.balance += amount;
            success = true;
        }

        System.out.println(success + "- from: " + owner.getName()
                + ", to: " + to.owner.getName()
                + ", amount: " + amount
                + ", balance: " + balance);
        return success;
    }

}