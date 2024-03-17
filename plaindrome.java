class Example3 {
    public static void main(String args[]) {
        System.out.println("Hello, World");

        if (args.length > 0) {
            // Check if args[0] is a valid integer string
            if (isInteger(args[0])) {
                int number = Integer.parseInt(args[0]);
                if (checkPalindrome(number)) {
                    System.out.println(args[0] + " is a palindrome.");
                } else {
                    System.out.println(args[0] + " is not a palindrome.");
                }
            } else {
                System.out.println(args[0] + " is not an integer.");
            }
        } else {
            System.out.println("No command-line arguments provided.");
        }
    }

    // Helper method to check if a string is an integer
    private static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean checkPalindrome(int number) {
        String numberString = Integer.toString(number);
        int length = numberString.length();

        for (int i = 0; i < length / 2; i++) {
            if (numberString.charAt(i) != numberString.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
