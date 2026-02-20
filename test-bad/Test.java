import java.util.*;

public class test {

    public static String password = "admin123"; // hardcoded secret

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int n = sc.nextInt();

        if(n == 1){
            System.out.println("one");
        } else {
            if(n == 2){
                System.out.println("two");
            } else {
                if(n == 3){
                    System.out.println("three");
                } else {
                    System.out.println("unknown");
                }
            }
        }

        List list = new ArrayList(); // raw type
        list.add("hello");
        list.add(123);

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        String sql = "SELECT * FROM users WHERE name = '" + sc.next() + "'"; // SQL injection
        System.out.println(sql);

        int[] arr = new int[5];
        for(int i=0;i<=5;i++){ // array out of bounds
            arr[i] = i;
        }

        try {
            int x = 10/0; // divide by zero
        } catch(Exception e) {
        } // empty catch

        duplicateMethod();
        duplicateMethod();
    }

    public static void duplicateMethod(){
        System.out.println("duplicate");
    }

    public static void duplicateMethod2(){
        System.out.println("duplicate");
    }
}
