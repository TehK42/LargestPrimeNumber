public class Main {
    public static void main(String[] args) {

        System.out.println(getLargestPrime(21));

        //how the calculations of the code work
        int calc = 21 % 3;
        int calc2 = 21 / 3;
        System.out.println(calc2);
        System.out.println(calc);

    }

    public static int getLargestPrime(int number) {
        if(number < 2) {
            return -1;
        }

        int prime = 2;
        while(number > prime) {
            if((number % prime) == 0){
                number /= prime;
            } else {
                prime++;
            }
        }
        return prime;
    }
}
