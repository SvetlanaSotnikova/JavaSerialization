public class Main {

    public static void main(String[] args) {
        // PlainInteface plainInteface = new PlainInteface() {

        // @Override
        // public String action(int x, int y) {
        // return String.valueOf(x + y);
        // }

        // };
       // PlainInteface plainInteface = (x, y) -> String.valueOf(x + y);
        PlainInteface plainInteface2 = Integer::compare;

        //System.out.println(plainInteface.action(5, 5));
        System.out.println(plainInteface2.action(1, 5));
    }
}
