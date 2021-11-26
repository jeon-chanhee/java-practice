package chapter02;

public class BankDriver {
    public static void main(String[] args) {
        // 사람 선언
        Person p1 = new Person();  // 생성자는 인스턴스를 생성해주고 생성된 인스턴스를 리턴함.
        //p1.name = "김신의";
        // p1.age = 28;
        //p1.cashAmount = 30000;
        p1.setAge(28);
        p1.setName("홍길동");
        p1.setCashAmount(30000);
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p1.getCashAmount());


        // 은행 계좌
        BankAccount a1 = new BankAccount();
        a1.balance = 100000;

//        p1.account = a1;
//        a1.owner = p1;

//        System.out.println(p1.account.balance);
//        System.out.println(a1.owner.name);

    }
}
