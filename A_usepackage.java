import mypack.*;

class A_usepackage {
    public static void main(String[] args) {
        int x = 10, y = 10;
        A_package pk = new A_package();
        int r = pk.maxm(x, y);
        if(r == 0) System.out.println("Equal.");
        else System.out.println(+r+" is Greater.");
    }
}