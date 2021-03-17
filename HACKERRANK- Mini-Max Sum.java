/*
Given five positive integers, find the minimum and maximum values that can be calculated by summing 
exactly four of the five integers. Then print the respective minimum and maximum values as a single 
line of two space-separated long integers.
*/

   static void miniMaxSum(int[] arr) {
        int biggest;
        int smallest;
        long sum;
        
        biggest = 0;
        smallest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[biggest])
                biggest = i;
            if (arr[i] < arr[smallest])
                smallest = i;
        }
        sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += (biggest != i) ? arr[i] : 0;
        System.out.printf("%d ", sum);
        sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += (smallest != i) ? arr[i] : 0;
        System.out.printf("%d", sum);

    }
