class Example {
    public static void main(String args[]) {
        System.out.println("Hello, World");

        if (args.length > 0) {
            // Check if args[0] is a valid integer string
            if (isInteger(args[0])) {
                System.out.println("Is integer");
            } else {
                System.out.println("Is string");
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
}
