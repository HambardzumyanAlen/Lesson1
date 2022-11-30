package com.company;

public class Main {


//    static void myMethod(String fname){
//        System.out.println(fname + "Refsnes");
//    }
 //   public static void main(String[] args) {
//        myMethod("Liam");
//        myMethod("Jenny");
//        myMethod("Anja");



        public static void main(String[] args) {
//            Person Valod = new Person();                   //Person.java
//            Valod.height = 150;
//            Valod.say("Georg");
//            System.out.println(Valod.height);
//            Person Poxos = new Person();
//            System.out.println(Poxos.height);


//        int number = 2147483647;
//        int addition = 8;
//        int sum = number + addition;
//        System.out.println(sum);
//
//        double speed = 1;
//        double divide = 3;
//        System.out.println(speed / divide);
//
//        int[] array = {5, 8, 9, 3, 4, 5, 7, 6, 9};
//        array[6] = 77;
//        System.out.println(array[6]);
//
//        int tiv = 9;
//        tiv++;
//        tiv--;
//        tiv--;
//        System.out.println(tiv);
//
//        double number = 8;
//        double divide = 3;
//        double resalt = number/divide;
//        System.out.println(resalt);
//
//        int number = 8;
//        int divide = 3;
//        int resalt = number % divide;
//        System.out.println(resalt);
//
//        int number = 8;
//        int divide = 3;
//        boolean resalt = number != divide;
//        System.out.println(resalt);
//
//        boolean hassalary = true;
//        boolean hasbonus = false;
//        boolean hassomething = hassalary || hasbonus;//boolean hassomething = hassalary && hasbonus;
//        System.out.println(hassomething);
//
//        int a = 9;
//        int b = 5;
//        boolean c = a <= b;
//        System.out.println(c);
//
//        int a = 5;
//        int b = 5;
//        if (a < b) {
//            System.out.println("a < b");
//        } else {
//            System.out.println("a > b");
//        }
//
//        boolean less = false;
//        if(less){
//            System.out.println("a <= b");
//        }else if(true){
//            System.out.println("a > b");
//        }
//        else{
//            System.out.println("a <= b");
//        }

//        int monthNumber = 4;
//        switch (monthNumber){
//            case 1:
//                System.out.println("Jan");
//                break;
//            case 2:
//                System.out.println("Feb");
//            case 3:
//                System.out.println("Mar");
//            case 4:
//                System.out.println("Apr");
//            default:
//                System.out.println("Not monthNumber");
//        }

        /*int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }*/

//        int i = 0;
//        while (i < 5) {
//            System.out.println(i);
//            i++;
//        }

//        int limit = 10;
//        boolean statement = true;
//        while (statement){
//            System.out.println("0");
//        }

//        int limit = 10;
//        int number = 0;
//        while (number < limit){
//            System.out.println(number);
//            number = number + 1;//number++;
//        }

//        for(int i = 0; i<=15; i++){
//            System.out.println(i);
//        }
//        for (int i = 0; i <= 10; i = i + 2) {
//            System.out.println(i);

//        int[] array = {2, 9, 9, 7};
//        System.out.println(array);
//        for(int i = 0; i<=3; i++){
//            System.out.println(array[i]);
//        }

//        int[] array = {2, 9, 9, 7};
//        for(int i = 0; i<=3; i++){
//            System.out.println("Cycle #" + i + " start");
//            System.out.println(array[i]);
//            if(array[i] == 9){+
//                System.out.println("Found 9!");
//                break;   //continue;  //return;
//            }
//            System.out.println("Cycle #" + i + " finish");
//        }

//        float tiv = 79e4f;
//        System.out.println(tiv);

//        char var = 65;
//        System.out.println(var);

//        String txt = "Hello World";
//        System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
//        System.out.println(txt.toLowerCase());   // Outputs "hello world"

//        String txt = "We are the so-called \"Vikings\" from the north.";
//        System.out.println(txt);
//        String txt = "It\'s alright.";
//        System.out.println(txt);
//        String txt = "The character \\ is called backslash.";
//        System.out.println(txt);
//        String txt = "Hello\nWorld!";
//        System.out.println(txt);
//        String txt = "Hello\tWorld!";
//        System.out.println(txt);

//        System.out.println(Math.max(5, 10));
//        System.out.println(Math.min(5, 10));
//        System.out.println(Math.sqrt(64));
//        System.out.println(Math.abs(-4.7));





            //System.out.println("Xndirner");

            //Xndir 1.
            /*int n = 7;
            int number[] = {1, 4, 7, -5, 3, 7, 32, 4, -7};
            int count = 0;
            for (int i = 0; i < number.length; i++) {
                if (number[i] == n) {
                    count++;
                }
            }
            System.out.println(count);
            System.out.println();*/


            //Xndir 2
           /* int numbers[] = {1, 4, 7, -5, 3, 7, 32, 4, -7, 12};
            System.out.println("Task 2");
            int[] oddNumbrs = new int[numbers.length];
            int[] evenNumbers = new int[numbers.length];
            int oddNumberIndex = 0;
            int evenNumberIndex = 0;

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 1 || numbers[i] % 2 == -1) {
                    oddNumbrs[oddNumberIndex] = numbers[i];
                    oddNumberIndex++;
                } else {
                    evenNumbers[evenNumberIndex] = numbers[i];
                    evenNumberIndex++;
                }
            }
            System.out.println("The Array of even numbers are :");
            for (int i = 0; i < evenNumbers.length; i++) {
                if (evenNumbers[i] != 0) {
                    System.out.print(evenNumbers[i] + " ");
                }
            }
            System.out.println();
            System.out.println("The Array of odd numbers are :");
            for (int i = 0; i < oddNumbrs.length; i++) {
                if (oddNumbrs[i] != 0) {

                    System.out.print(oddNumbrs[i] + " ");
                }
            }*/


            //Xndir 3
            /*int [] firstArray = {3, 6, 0, -3, 2, 2, 13};
            int [] secondArray = {0, 56, -5, 45, 2, 2, 0, 12, 6, 13, 56};
            int minLengthOfGivenArrays = firstArray.length > secondArray.length
                    ? secondArray.length : firstArray.length;
            // the number which we will use to indicate that we already found matching for a current item (from 1st array) in the 2nd array
            int indicator = 67;
            // nshelu tiv@ -> 0
            // {0, 6, 2, 2, 13, 0, 0}
            int [] commonElements = new int[minLengthOfGivenArrays];
            int currentIndexOfCommonArray = 0;
            int countOfZerosForFirstArray = 0;
            for(int i = 0; i < firstArray.length; i++) {
                if(firstArray[i] == indicator) {
                    countOfZerosForFirstArray++;
                }
            }
            int countOfZerosForSecondArray = 0;
            for(int i = 0; i < firstArray.length; i++) {
                if(firstArray[i] == indicator) {
                    countOfZerosForSecondArray++;
                }
            }
            // cover indicator case
            if(countOfZerosForFirstArray > 0 && countOfZerosForSecondArray > 0) {
                int minZeroCount = countOfZerosForFirstArray > countOfZerosForSecondArray ?
                        countOfZerosForSecondArray : countOfZerosForFirstArray;
                while (minZeroCount != 0) {
                    commonElements[currentIndexOfCommonArray++] = indicator;
                    minZeroCount--;
                }
            }
            for(int i = 0; i < firstArray.length; i++) {
                if(firstArray[i] == indicator) {
                    continue;
                }
                for(int j = 0; j < secondArray.length; j++) {
                    if(firstArray[i] == secondArray[j]) {
                        commonElements[currentIndexOfCommonArray++] = firstArray[i];
                        secondArray[j] = indicator;
                        break;
                    }
                }
            }
            System.out.println("Common elements: ");
            for (int i = 0; i < currentIndexOfCommonArray; i++) {
                System.out.print(commonElements[i] + " ");
            }*/

            //Xndir 4
            /*int[] arr = {1,2,3,4,5,7,8,9};
            int n = arr.length + 1;
            int sum = (n * (n+1))/2;
            for (int i = 0;i<arr.length;i++){
                sum = sum -arr[i];
            }
            System.out.println("Missing number is " + sum);*/


            //Xndir 5
            /*int[] array = {1,4,7,-5,3,7,-32,4,-7,123,};
            int min = array[0];
            for (int i = 1; i < array.length; i++) {
                if(array[i]<min){
                    min = array[i];
                }
            }
            System.out.println("Minimum Number is " + min);*/

            //Xndir 6
            /*int[] numbers = {1, 4, -6, 8, 8, -6, 4, 1};

            int reverse = numbers.length - 1;
            int count = 0;
            int p = numbers.length / 2;

            for (int i = 0; i < p; i++) {
                if (numbers[i] != numbers[reverse]) {
                    System.out.println("NO");
                    break;
                }
                reverse--;
                count++;
            }
            if (count == p) {
                System.out.println("YES");
            }*/

            //Xndir 7
                   /* int exersice_4[] = {-2, 1, 7, 9, 4, 26, 30};
                    int n = 0;
                    int hashvich = 0;
                    for (int i = 0; i < exersice_4.length - 1; i++) {
                        if (exersice_4[i] > exersice_4[i + 1]) {
                            hashvich++;
                        }
                    }
                    if (hashvich == n) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }*/

            //Xndir 8
            /*int n = 11;
            boolean prime = true;
            for (int i = 2; i < n; i++) {
                if(n%i == 0){
                    prime = false;
                    break;
                }
            }
            System.out.println(prime);*/

            //Xndir 9
            /*int[][] matrix = {{1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 0, 1, 2},
                    {3, 4, 5, 6}};
            for (int a = 0; a < matrix.length; a++) {
                for (int b = 0; b < matrix.length; b++) {
                    System.out.print(matrix[b][a] + " ");

                }
                System.out.println();
            }*/


            //Xndir 
    }
}
