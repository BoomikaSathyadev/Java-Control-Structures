public class control_structures {
    public static void main (String[] args) {
    // 1. Print a pyramid of prime numbers up to n rows
        System.out.println("1) Pyramid of Prime Numbers:");
        int rows = 5, n = 2, count = 0;
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < i;) {
                boolean isPrime = true;
                for (int k =2; k <= n/2; k++) 
                    if (n % k == 0) isPrime = false;
                if (isPrime) {
                    System.out.print(n + " ");
                    j++;
                }
                n++;
            }
            System.out.println();
        }

    // 2. Armstrong numbers in range
        System.out.println("\n2) Armstrong Numbers:");
        int start = 100, end = 999;
        for (int num = start; num <= end; num++) {
            int sum = 0, temp = num;
            while (temp > 0) {
                int digit = temp % 10;
                sum += digit * digit * digit;
                temp /= 10;
            }
            if (sum == num) System.out.println(num);
        }

    // 3. Pascal's Triangle
        System.out.println("\n3) Pascal's Triangle:");
        int row = 5;
        for (int i = 0; i < row; i ++) {
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }

    // 4. Fibonacci
        System.out.println("\n4) Fibonacci Series and Sums:");
        int numFib = 10, a = 0, b = 1, evenSum = 0, oddSum = 0;
        for (int i = 1; i <= numFib; i++) {
            System.out.print(a + " ");
            if (a % 2 == 0) evenSum += a;
            else oddSum += a;
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println("\nEven Sum: " + evenSum + ", Odd Sum: " + oddSum);
    
    // 5. Diagonal sums
        System.out.println("\n5) Diagonal Sums: ");
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int sumMain = 0, sumSecondary = 0;
        for (int i = 0; i < matrix.length; i++) {
            sumMain += matrix[i][i];
            sumSecondary += matrix[i][matrix.length - 1 - i];
        }
        System.out.println("Main: " + sumMain + ", Secondary: " + sumSecondary);

    // 6. Reverse and Palindrome
        System.out.println("\n6) Reverse and Palindrome Check: "); 
        int original = 121, reversed = 0, copy = original;
        while (copy > 0) {
            reversed = reversed * 10 + copy % 10;
            copy /= 10;
        }
        System.out.println("Reverse: " + reversed);
        System.out.println(original == reversed ? "Palindrome" : "Not Palindrome");
    
    // 7. GCD and LCM
        System.out.println("\n7) GCD and LCM:");
        int num1 = 12, num2 = 18, greatest = 1;
        for (int i = 1; i <= num1 && i <= num2; i++)
            if (num1 % i == 0 && num2 % i == 0) greatest = i;
        int least = (num1 * num2) / greatest;
        System.out.println("GCD: " + greatest + ", LCM: " + least);

    // 8. Character frequency
        System.out.println("\n8) Character Frequency: ");
        String text = "hello";
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int coun = 0;
            for (int i = 0; i < text.length(); i++)
                if (text.charAt(i) == ch) coun++;
            if (coun > 0) System.out.println(ch + ": " + coun);
        }

    // 9. Series and sum
        System.out.println("\n9) Number Series and Sum: ");
        int terms = 5, value = 1, total = 0;
        for (int i = 1; i <= terms; i++) {
            System.out.print(value + " ");
            total += value;
            value *= 2;
        }
        System.out.println("\nSum: " + total);

    // 10. Grade from marks
        System.out.println("\n10) Grade from Marks: ");
        int[] scores = {80, 75, 90, 85, 70};
        int sumScores = 0;
        for (int score : scores) sumScores += score;
        int average = sumScores / scores.length;
        String grade = average >= 90 ? "A" : average >= 80 ? "B" : average >= 70 ? "C" : "D";
        System.out.println("Average: " + average + ", Grade: " + grade);

    }
}