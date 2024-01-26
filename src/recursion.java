public class recursion {
//    recursion When a thing is defined in terms of itself.
//    Apply the result Of a procedure, to a procedure.
//    A recursive method calls itself. Can be a substitute for iteration.
//    Divide a problem into sub-problems of the same type as the original .
//    Commonly used with advanced sorting algorithms and navigating trees

//            Advantages
//    ----------------
//    easier to read/write
//    easier to debug
//    Disadvantages
//    -------------------------
//    sometimes slower
//    uses more memory
    public static void main(String[] args){
        walk(5);
    }

    private static void walk(int steps) {
//        for (int i = 0; i <steps; i++) {
//            System.out.println("walk");
//        }
        if (steps<1) return;
        System.out.println("walk");
        walk(steps-1);
    }
    private static int factorial(int num){
        if (num<1) return 1;
        return num*factorial(num-1);
    }
}
