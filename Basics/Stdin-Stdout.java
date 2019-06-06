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
