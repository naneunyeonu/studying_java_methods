package classes;

public class AboutStringBuilder {

    public static void main(String[] args) {
        /*
        String 은 불변(immutable)객체이므로 문자열이 변경될 때마다 새로운 String 객체가 생성됨
        StringBuilder 는 동일한 객체 내에서 문자열을 수정함 -> 메모리 할당, 해제 작업이 줄어듬
         */

        // 아래는 사용 예시
        StringBuilder sb = new StringBuilder("Hello");
        // 예시 하나 더??
        String testName = "Now Testing";
        StringBuilder sb2 = new StringBuilder(testName);

        // 문자열 추가
        sb.append(" World");
        System.out.println(sb);
        //
        sb2.append("!!!!");
        System.out.println(sb2);

        // 삽입
        sb.insert(5, ",");
        System.out.println(sb);

        // 대체
        // 시작 인덱스는 포함, 종료 인덱스는 포함하지 않음
        sb.replace(7, 12, "Java");
        System.out.println(sb);


        // 삭제
        sb.delete(5, 6);
        System.out.println(sb);

        // 뒤집기
        sb.reverse();
        System.out.println(sb);
    }
}
