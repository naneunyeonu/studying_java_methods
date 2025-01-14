package exception.customexception;

public class Sample {
    public void sayNick(String nick) {
        try {
            if ("바보".equals(nick)) {
                throw new FoolException();
            }
        } catch (FoolException e) {
            System.out.println("FoolException Occurred");
        }

        System.out.println("당신의 별명은 " + nick + " 입니다.");
    }

    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.sayNick("바보");
        sample.sayNick("야호");
    }
}

/*public class Sample {
    public void sayNick(String nick) throws FoolException {     // try.. catch 대신 thorws 사용
    // '예외를 뒤로 미루기' 라고도 함
        try {   // try .. catch 문을 삭제할수 있다.
            if("바보".equals(nick)) {
                throw new FoolException();
            }
            System.out.println("당신의 별명은 "+nick+" 입니다.");
        }catch(FoolException e) {
            System.err.println("FoolException이 발생했습니다.");
        }
    }
    throw, throws 의 차이
     - throw: 메소드 내에서 예외를 발생시키는 데 사용됨 (ex. throw new FoolException)
     - throws: 메소드 선언부에서 사용되고, 해당 메소드가 처리하지 않은 예외를 호출자에게 전달함을 나타냄
            (ex. public void sayNick(String nick) throws FoolException)

    위에서 throws 로 바꾸었으니 FoolException 을 처리해야하는 대상이 sayNick 에서 main (sayNick 을 호출하는 메소드)으로 바뀜
    그러니.. 이제 main 에서 try .. catch 로 받아줘야함
    public static void main(String[] args) {
        Sample sample = new Sample();
        try {               // try .. catch 로 변경
            sample.sayNick("바보");
            sample.sayNick("야호");
        } catch (FoolException e) {
            System.err.println("FoolException이 발생했습니다.");
        }
    }
}*/
