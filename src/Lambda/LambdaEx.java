package Lambda;

@FunctionalInterface
interface MyFunctionalInterface {
    int method(int x, int y);
}   
public class LambdaEx {
    /**
     * @param args
     */
    public static void main(String[] args) {
        MyFunctionalInterface fi;
        //int x,y;
        // 람다식
        fi = (x, y) -> {
            int result = x + y;
            result = result * 2;
            return result;
        };
        System.out.println("result: " + fi.method(2, 5));

        // 람다식(중괄호와 return문 생략)
        fi = (x, y) -> x + y;
        System.out.println("result: " + fi.method(2, 5));   
    }
}
