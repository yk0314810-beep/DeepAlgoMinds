# Mini-Max Sum (Java)

## Problem Statement

Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers.

Print the respective minimum and maximum values as two space-separated integers.

### Example

Input:

```
1 2 3 4 5
```

Output:

```
10 14
```

## Approach

1. Calculate the sum of all five integers.
2. Find the smallest and largest element in the array.
3. Minimum sum = Total sum - Largest element.
4. Maximum sum = Total sum - Smallest element.
5. Print both values.

## Time Complexity

* **O(n)**

## Space Complexity

* **O(1)**

## Java Solution

```java
import java.util.*;

public class Solution {

    public static void miniMaxSum(int[] arr) {
        long totalSum = 0;

        int min = arr[0];
        int max = arr[0];

        for (int num : arr) {
            totalSum += num;

            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }
        }

        long minSum = totalSum - max;
        long maxSum = totalSum - min;

        System.out.println(minSum + " " + maxSum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        miniMaxSum(arr);

        sc.close();
    }
}
```

## Key Learning

* Use `long` instead of `int` to avoid integer overflow when calculating large sums.
* Efficiently solve the problem in a single traversal of the array.
