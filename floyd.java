import java.util.*;
public class floyd {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter triangle height: ");
        int height = s.nextInt();
        int num = 1;
        for(int i = 0;i < height;++i){
            for(int j = 0;j <= i;j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        s.close();
    }
}