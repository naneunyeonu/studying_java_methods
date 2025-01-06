package methods;

public class CharToString {

    public static void main(String[] args) {
        /*
        char -> String
         */

        char c = 'K';
        String str = Character.toString(c);
        System.out.println(str);    // String 으로 바뀜

        ////////////////////

        String before = "Study about methods";
        String[] after = new String[before.length()];

        for (int i = 0; i < before.length(); i++) {
            after[i] = Character.toString(before.charAt(i));
        }

        System.out.println("String to StringArray");
        for (String s : after) {
            System.out.print(s);
        }
        System.out.println();
        /*
        String array -> String
         */

        System.out.println("StringArray to String");
        String finalString = "";
        finalString = String.join(" ", after);
        // 각 요소들을 공백(" ")을 구분자로 하여 하나의 문자열로 결합
        System.out.println(finalString);
    }
}
