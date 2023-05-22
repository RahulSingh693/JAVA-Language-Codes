import java.util.*;
public class sum {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        int sum = 0,cnt = 0;
        for(int i = 100;i < 201;i++){
            if(i % 7 == 0){
                sum += i;
                cnt++;
            }
        }
        System.out.println("Sum = "+sum);
        System.out.println("Average = "+sum/cnt);
        s.close();
    }
}
