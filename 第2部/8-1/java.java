public class java {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number please : ");
        int num = sc.nextInt();
 
        if (isPerfectNumber(num)) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
    }
 
    static boolean isPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
}