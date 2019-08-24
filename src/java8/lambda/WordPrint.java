package java8.lambda;

public class WordPrint {

    private static final String GROOT_TEXT = "GROOT";

    public static void main(String[] args) {
        /** 인터페이스의 추상 메소드를 생성과 동시에 Override하여 구현 **/
        PrintService ps1 = new PrintService() {
            @Override
            public String printWords(String input) {
                return input + GROOT_TEXT;
            }
        };
        System.out.println(ps1.printWords("PS1 I AM "));

        /** 람다 기본 **/
        PrintService ps2 = (input) -> (input + GROOT_TEXT);
        System.out.println(ps2.printWords("PS2 I AM "));
    }
}
