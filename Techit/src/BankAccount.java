public class BankAccount {

    // 멤버변수
    // 기본적으로는 멤버 변수에 private 다 붙여주자
    // private => 동일 클래스에서만 사용 가능
    private int bankCode; // 은행코드
    private int accountNo; // 계좌번호
    private String owner; // 예금주
    private int balance; // 잔액
    private boolean isDormant; // 휴면 여부
    private int password; // 계좌 비밀번호

    // 메소드 (= 함수)
    // 기본적으로 메소드는 public
    public void inquiry(){} // 계좌 조회
    public void deposit(){} // 계좌 입금
    // public void withdraw(){} // 계좌 출금
    public void heldInDormant(){} // 휴면 계좌로 전환

    public void changePassword(int password){
        this.password = password;
    }

    // 생성자
    // 클래스 내부에 정의, 생성사 메서드명은 클래스명과 일치!
    // new 연산자와 함께 사용
    // 생성자 작성하지 않으면 아무 인자도 받지 않는 빈 생성자를 자동으로 생성
    BankAccount(){

    }
    BankAccount(int bankCode, int accountNo, String owner, int balance, int password, boolean isDormant){
        this.bankCode = bankCode; // this : 자기 자신을 가리키는 객체
        this.accountNo = accountNo; // 왼쪽 accountNo : class 멤버 변수, 오른쪽 accountNo : 인자
        this.owner = owner;
        this.balance = balance;
        this.password = password;
        this.isDormant = isDormant;
    }

    public int getBankCode() {
        return bankCode;
    }

    public void setBankCode(int bankCode) {
        this.bankCode = bankCode;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean isDormant() {
        return isDormant;
    }

    public void setDormant(boolean dormant) {
        isDormant = dormant;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
