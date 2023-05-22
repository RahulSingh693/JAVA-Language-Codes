public class Array {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int arr1[] = {10,23,5,67,76,8};
        for(int x:arr1) {
            System.out.print(+x+" ");
        }
        System.out.println();
        int arr3[][] = {{1,2,3},{3,4,5},{6,7,8}};
        int arr4[][] = new int[4][3];
        for(int i = 0;i < 3;i++) {
            for(int y:arr3[i]){
                System.out.print(+y+" ");
            }
            System.out.println();
        }
    }
}
// dataType[][] arrayRefVar; (or)  
// dataType [][]arrayRefVar; (or)  
// dataType arrayRefVar[][]; (or)  
// dataType []arrayRefVar[];   