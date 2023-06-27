public class Main {
    public static void main(String[] args) {
//part 1
        int a = 2;
        int b = 4;
        int c = 6;
        int d = 8;
        int sum1 = a + c;
        int sum2 = b + d;
        System.out.println("sum1=" + sum1);
        System.out.println("sum2=" + sum2);
        boolean isSum1Bigger = sum1 > sum2;
        System.out.println(sum1 + ">" + sum2 + ": " + isSum1Bigger);
        //part 2
        sum1 += 1;
        sum2 -= 2;
        System.out.println("sum1=" + sum1);
        System.out.println("sum2=" + sum2);
        isSum1Bigger = sum1 > sum2;
        System.out.println(sum1 + ">" + sum2 + ": " + isSum1Bigger);
        //part 3
        boolean isSum1EvenNumber = sum1 % 2 == 0;
        boolean isSum2EvenNumber = sum2 % 2 == 0;
        System.out.println("sum1=" + sum1);
        System.out.println("sum2=" + sum2);
        System.out.println("is sum1 even: " + isSum1EvenNumber + " is sum2 even: " + isSum2EvenNumber);
        System.out.println(isSum1EvenNumber | isSum2EvenNumber);


    }
}
