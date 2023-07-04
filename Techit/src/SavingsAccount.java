public class SavingsAccount extends BankAccount implements Withdrawable {

    boolean isOverdraft; // 마이너스 통장 여부

    void transfer(){}; // 송금 기능

    // interface 함수 재정의 할 때 꼭 public 붙여주어야 함
    public void withdraw(){
        System.out.println("Withdraw");
    };
}
