import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LotteryProgram {
    public static void main(String[] args) {
        int[] lotteryNumbers = generateLotteryNumbers();
        int[] userNumbers = getLotteryNumbersFromUser();

        System.out.println("Lottery Numbers: " + Arrays.toString(lotteryNumbers));
        System.out.println("User Numbers: " + Arrays.toString(userNumbers));

        int matchedNumbers = countMatchingNumbers(lotteryNumbers, userNumbers);

        System.out.println("Number of matching numbers: " + matchedNumbers);
        if (matchedNumbers == 6) {
            System.out.println("You are the jackpot winner!");
        } else {
            System.out.println("Better luck next time!");
        }
    }

    public static int[] generateLotteryNumbers() {
        int[] lotteryNumbers = new int[6];
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            lotteryNumbers[i] = random.nextInt(49) + 1;
        }
        return lotteryNumbers;
    }

    public static int[] getLotteryNumbersFromUser() {
        Scanner scanner = new Scanner(System.in);
        int[] userNumbers = new int[6];
        System.out.println("Enter your lottery numbers (1-49):");
        for (int i = 0; i < 6; i++) {
            userNumbers[i] = scanner.nextInt();
        }
        return userNumbers;
    }

    public static int countMatchingNumbers(int[] lotteryNumbers, int[] userNumbers) {
        int count = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (lotteryNumbers[i] == userNumbers[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}

