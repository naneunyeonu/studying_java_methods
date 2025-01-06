package methods;

public class ArrayToString {

    public static void main(String[] args) {
        // .join method
        /*
        String[] strarr = {"H", "e", "l", "l", "o"};

        String word = String.join(" ", strarr);
        word -> "H e l l o" 가 됨
         */
        String[] strarr = {"H", "e", "l", "l", "o"};

        String word = String.join(" ", strarr);
        System.out.println(word);

        System.out.println("==========================");

        String[] arr = {"hello", "world", "!!"};

        String str1 = String.join(" ", arr);
        System.out.println("str1 = " + str1);

        String str2 = String.join("", arr);
        System.out.println("str2 = " + str2);

        String str3 = String.join("@", arr);
        System.out.println("str3 = " + str3);
    }
}
