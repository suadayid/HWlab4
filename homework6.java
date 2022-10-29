public class homework6 {

    public static void main(String[] args) {
        String name="bushra";
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(4));
        StringBuilder SB=new  StringBuilder("bushra");
        System.out.println(SB.deleteCharAt(0));
        System.out.println(SB.deleteCharAt(3));
    }
}
