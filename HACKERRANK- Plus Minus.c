/*
Given an array of integers, 
calculate the ratios of its elements that are positive, 
negative, and zero. Print the decimal value of each fraction on 
a new line with 6 places after the decimal.
*/
void plusMinus(int arr_count, int* arr) {
    double neg;
    double pos;
    double zer;
    
    neg = 0;
    pos = 0;
    zer = 0;
    for (int i = 0; i < arr_count; i++)
    {
        //printf("%d ", arr[i]);
        if (arr[i] < 0)
            neg++;
        else if (arr[i] > 0)
            pos++;
        else 
            zer++;
    }
    printf("%.6f\n%.6f\n%.6f", pos/arr_count, neg/arr_count, zer/arr_count);
    

}
