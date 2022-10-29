public class Homework2 {
    public static void main(String[] args) {
        int r;
        double pi =3.145,area;
        Scanner s =new Scanner(System.in);
        System.out.println("enter radius of circle:");
        r=s.nextInt();
        area= pi * r * r;
        System.out.println("area of circle:"+area);
    }
}
