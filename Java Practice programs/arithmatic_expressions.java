public class arithmatic_expressions {
    public static void main(String[] args) {
        // In java division of a whole no. is a whole number
        float a = 20 / 3; // --> ans = 6.0
        System.out.println(a);

        // So, how to get answer in fraction not as a whole number
        float f = (float) 20 / 3; // ---> explicit type conversion of only numerator or denominator
        // and you can convert both numerator and denometer too.
        System.out.println(f);

        // we have ++ , -- , += , -= ,/= etc. all of this kind of operator in java just
        // like cpp.
        // += operators like these are called augmented or compound operator.
    }
}
