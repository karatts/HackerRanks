import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()){
            String num = scan.next();
            System.out.println(num);
            if(num.equals(null)){
                break;
            }
        }
        scan.close();
    }
}

------------------------------------------------------------------------------------

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        Double d = scan.nextDouble();
        String s = scan.nextLine();
        while(s.equals("")){
            s = scan.nextLine();
        }

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);s = scan.nextLine();
        }
    }
}
