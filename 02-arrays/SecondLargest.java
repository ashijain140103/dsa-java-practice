
public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {12, 5, 19, 3, 19, 8};

        int largest = arr[0];
        int secondLargest = 0;
        boolean foundSecond = false;

        for (int i = 1; i < arr.length; i++) {
            int num = arr[i];

            if (num > largest) {
                secondLargest = largest;
                largest = num;
                foundSecond = true;
            } else if (num < largest &&
                    (!foundSecond || num > secondLargest)) {
                secondLargest = num;
                foundSecond = true;
            }
        }

        if (foundSecond) {
            System.out.println("Second largest: " + secondLargest);
        } else {
            System.out.println("No second-largest distinct element");
        }
    }
}
