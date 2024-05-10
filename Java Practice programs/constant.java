public class constant {
    public static void main(String[] args) {
        final float pi = 1; // ---> "final" is used for declaring a variable constant.
        pi = 9; // ----> final variable cannot be re-assaigned.So, it will produce error
        System.out.println(pi);
    }
}
