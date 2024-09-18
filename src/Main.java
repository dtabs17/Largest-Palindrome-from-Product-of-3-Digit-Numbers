
public class Main {
    public static void main(String[] args)
    {
        int highestPalindrome = 0;
        int currentPalindrome;
        for(int i = 100; i < 1000; i++)
        {
            for(int j = 100; j < 1000; j++)
            {
                if(palindromeChecker(i * j)){
                    currentPalindrome = i*j;
                    if (currentPalindrome> highestPalindrome) {
                        highestPalindrome = currentPalindrome;
                    }
                };
            }
        }
        System.out.println("The highest palindrome is: " + highestPalindrome);
    }

    public static boolean palindromeChecker(int number){
        int num = 0;
        int temp, number1 = number;
        while(number > 0)
        {
            num*=10;
            temp = number % 10;
            num += temp;
            number /= 10;
        }
        if(num == number1)
            return true;
        else
            return false;
    }
}