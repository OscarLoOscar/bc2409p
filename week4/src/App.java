import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5};
        // Task: Write a program that swaps the first and last elements of an integer array.
        // expect result : [5,4,3,2,1]
        // String.length()
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(arr));

        // Example 2
        // indexOf()
        // Finding All Occurrences of a Substring Using indexOf() and a While-Loop
        String inputString = "abracadabra";
        String targetSubString = "adab";

        int index = inputString.indexOf(targetSubString);
        // if exist -> return index , if not -> return -1
        while (index != -1) { // condition : can find the index of targetSubString from inputString
            System.out.println("Substring found at index: " + index);
            index = inputString.indexOf(targetSubString, index + 1);
            // indexOf(substring, fromIndex): Finds the next occurrence starting from fromIndex.
            // The loop continues until no more occurrences are found (index = -1).
        }

        // Example 3
        // Objective: Split a sentence into words and process each word.
        String sentence = "Learning Java is fun.";
        String[] strArr = sentence.split(" "); // input param of .split(String regex)
        // Approach 1
        System.out.println(Arrays.toString(strArr)); // [Learning, Java, is, fun.]
        // Approach 2
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(
                    "Word : " + strArr[i] + ", Length : " + sentence.length());
        }
        // 1. use case of split()
        strArr = sentence.split("J");
        System.out.println("split J : " + Arrays.toString(strArr));// [Learning , ava is fun.]

        // QQQ,VOO,TSLA
        String stockList = "QQQ,VOO,TSLA,SQQQ,TQQQ";

        String[] splitStockList = stockList.split(",");

        System.out.println("stock List : " + Arrays.toString(splitStockList));// [QQQ, VOO, TSLA]
        for (int i = 0; i < splitStockList.length; i++) {
            System.out.println(
                    "Fetch API by splitStockList : " + splitStockList[i]);
        }

        // other Syntax of for-loop
        for (String arr2 : splitStockList) { // for-each , for( type of source : source){} , loop all the element
            System.out.println("arr2 : " + arr2);
        }

        int[] arr3 = new int[] {1, 2, 3, 4, 5, 7};
        for (int i : arr3) {
            System.out.println("For-each loop : " + i);
        }

        for (int i : arr3) {
            // System.out.println("before break : " + i);

            // if (i % 2 == 0)
            // break;

            if (i % 2 == 0) {
                System.out.println("TESTING A ");
                System.out.println("TESTING B ");
            } 
            // System.out.println("after break : " + i);

        }
    }
}
