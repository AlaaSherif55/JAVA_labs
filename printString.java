class Example2 {
    public static void main(String args[]) {
        System.out.println("Hello, World");

        if (args.length ==2) {
           if(isInteger(args[0])){
           int i=Integer.parseInt(args[0]);
            for(int y=0;y<i;y++){
            System.out.println("The input string in iteration "+y+":"+args[1]);
            }
           }else{
             System.out.println("The first argument not integer please enter it correctly");
           }
         }else if(args.length>2){
         System.out.println("Multiple argument i need two input( number and string)");
         }
        else{
         System.out.println("Few argument i need two input number and string");
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
