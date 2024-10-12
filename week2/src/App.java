public class App {
    public static void main(String[] args) throws Exception {

        int x = 3;
        // x *= 3;
        // x *= 3;
        // x *= 3;
        // x *= 3;
        // System.out.println("x : " + x);

        // for ( starting point; ending point ; counting "++" / "--" / "*=" / "/=" )
        // for (int i = 0; i < 10; ++i) {
        for (int i = 0; i < 10; i++) {
            x *= 3;
        }
        System.out.println(x);// 177147

        // For Loop
        // initialization (variable declaration & assignment) ; continue criteria ; incremental operation
        // Step 1 : i = 0
        // Step 2 : check if i < 4 ? yes
        // Step 3 : print "hello"
        // Step 4 : i++ -> i become 1
        // Step 5 : i = 1
        // loop 3 more times
        // Step i=4
        // check if i < 4 ? No
        // Finally : Exit the loop
        for (int i = 0; i < 4; i++) { // i = 0,1,2,3
            System.out.println("hello");
        }

        int sum = 0;
        for (int i = 0; i < 11; i++) { // 10 cycle
            sum += i;
            System.out.println("round : " + i + " , " + "sum : " + sum);
        }
        System.out.println("sum : " + sum);// ans : 55

        // find odd number , and sum it
        sum = 0;
        for (int i = 0; i < 11; i++) {
            if (i % 2 != 0)
                sum += i;
        }
        System.out.println("find odd number , and sum it " + sum);// 1+3+5+7+9

        // find even number
        for (int i = 0; i < 11; i++) {
            if (i % 2 == 0)
                System.out.println("even num " + i);
        }

        // if (true) {
        // for (;;) {

        // }
        // }

        // how to use break in for-loop
        for (int i = 0; i < 11; i++) {
            if (i > 7)
                break; // exit the loop
            System.out.println("how to use break in for-loop : " + i); // when i = 7 , still print
        }

        // continue
        sum = 0;
        for (int i = 0; i < 11; i++) {
            if (i == 7)
                continue; // skip
            sum += i;
        }
        System.out.println("how to use continue in for-loop : " + sum); // sum = 48 -> 0+1+2+3+4+5+6+8+9+10  (55-7)

    }
}
