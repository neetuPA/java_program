public class Operators {
    public static void main(String[] args) {
        int x,y,z;
        x=100;
        y=x++;
        z=x+y;
        System.out.println(z==201);
        System.out.println(z%y);
        System.out.println(z<y);
        System.out.println(z>x);
    }
    
}
