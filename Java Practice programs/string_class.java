public class string_class {
    public static void main(String[] args) {
        String msg = new String("hey ya all"); // one way to initialize String.
        String msg1 = "hey ya all"; // more easy way to initialize string.
        System.out.println(msg1 + " " + msg); // String concatination

        boolean check = msg.endsWith("all"); // check if msg ends with "all" or not
        int len = msg1.length(); // not '.size()'
        System.out.println(check); // print "true" not '1'
        System.out.println("Size of msg1 = " + len);
    }
}
