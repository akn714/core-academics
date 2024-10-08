// package notes.unit3.LanguageEnhancement.YieldKeyword;

/*
 * Java 13 Required
 * Ref: https://www.geeksforgeeks.org/java-concurrency-yield-sleep-and-join-methods/
 */

public class code {
    public static void main(String[] args) {
        String[] number = {"ONE", "Two"};        

        var num = number[0];
        String message = switch (num) {
            case "ONE" -> {
                yield "Got a 1";
            }
            case "TWO" -> {
                yield "Got a 2";
            }
            default -> {
                yield "More than 2";
            }
        };
        System.out.println(message);
    }
}
