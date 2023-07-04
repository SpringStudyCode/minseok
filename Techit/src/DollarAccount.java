public class DollarAccount extends BankAccount {

    // 오버로딩 (Overloading)
    // => 부모 클래스에서 상속받은 메소드에서 파라미터를 변경
    // 새로운 메소드 정의!
    void inquiry(double currencyRate){}; // 환율 인자 추가

    // 오버라이딩 (Overriding)
    // => 부모 클래스에서 상속받은 메소드의 내용 변경
    // 자식 클래스의 상황에 맞게
    // 부모 클래스의 메소드의 파라미터를 그대로 따름
    public void deposit(){
        System.out.println("예금합니다.");
    }
}
