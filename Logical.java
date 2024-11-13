
class Logical {

    public static void main(String[] args) {
        // AND - T T -> T , T F -> F  both should be true to get true
        // OR - T T -> T, T F -> T, F F -> F any of the one is true to get true
        int a, b, x, y;
        a = 5;
        b = 6;
        x = 7;
        y = 8;
        // boolean rs = x > y || a<b;
        // boolean rs = x > y && a<b;
        boolean rs = x > y & a<b;
        // boolean rs = x > y | a<b;
        System.out.println(rs);
        System.out.println(!rs);
    
    }
}
