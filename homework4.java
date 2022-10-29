public class homework4 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int sum=0,score;
        for (double i =0;i<3;i++){
            System.out.println("enter three number"+(i+1)+":");
            double numbers =input.nextDouble();
            sum+=numbers;
        }
        double avg = sum / 3.0;
        System.out.println("the average of three number is : "+ avg);

    }

}
