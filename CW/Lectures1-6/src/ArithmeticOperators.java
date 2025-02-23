public class ArithmeticOperators {
    public static void main(String[] args) {

        // ArithmeticOperators
        // int p = 20, q = 50;

        // System.out.println(p+q);
        // System.out.println(p-q);
        // System.out.println(p*q);
        // System.out.println(p/q);
        // System.out.println(p%q);

        // RelationalOperators
        // int p = 10, q = 15;
        
        // System.out.println(p == q);
        // System.out.println(p != q);
        // System.out.println(p <= q);
        // System.out.println(p >= q);
        // System.out.println(p < q);
        // System.out.println(p > q);

        // LogicalOperators
        // int p = 15, q = 10, r = 5;
        // && operator
       
        // ||(or) operator
        // System.out.println((r < q) || (p < q));
        // System.out.println((p > q) || (q > r));
        // System.out.println((p < q) || (q < r));

        // !(not) operator
        // System.out.println(!(p == q));
        // System.out.println(!(p > q));

        // AssignmentOperators

        int p = 10;
        int q;

        // =
        q = p; 
        System.out.println(q);

        // +=
        p+=q ;  // p = p + q, p = 10 + 10 = 20  
        System.out.println(p);            
        
        p-=q; // p = p - q, p = 20 - 10 =10
        System.out.println(p); //10

        p *= q; //p = p * q
        System.out.println(p); //100

        p /= q; // p = p/q . p = 100/10 = 10
        System.out.println(p); //10

    }
}
