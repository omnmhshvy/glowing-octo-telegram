package FunctionalInterface;

public class FunctionExp {

    public static void main(String[] args) {
        System.out.println(performconcat("Hello"));
    }

    private static String performconcat(String string) {
        // TODO Auto-generated method stub

        return FunctionEx.cCat.apply(string);
        //throw new UnsupportedOperationException("Unimplemented method 'performconcat'");
    }

}
