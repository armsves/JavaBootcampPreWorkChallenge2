public class Main {
    public String printNumberInWord(int num) {
        if (num > 9 ) {
            return ("OTHER");
        } else {
            return switch (num) {
                case 1 -> "ONE";
                case 2 -> "TWO";
                case 3 -> "THREE";
                case 4 -> "FOUR";
                case 5 -> "FIVE";
                case 6 -> "SIX";
                case 7 -> "SEVEN";
                case 8 -> "EIGHT";
                case 9 -> "NINE";
                default -> "OTHER";
            };
        }
    }

    public static void main(String[] args) {
        var m = new Main();
        var s = m.printNumberInWord(2);
        System.out.println(s);
    }

}