//  Given a square matrix, calculate the absolute difference between the sums of its diagonals. 
int diagonalDifference(int arr_rows, int arr_columns, int** arr) {
    int d1_sum;
    int d2_sum;
    int i;
    
    d1_sum = 0;
    d2_sum = 0;
    i = 0;
    //printf("d1\n");
    while(i < arr_rows)
    {
        d1_sum += arr[i][i];
        //printf("%d ", arr[i][i]);
        i++;
    }
    i = 0;
    arr_columns--;
    //printf("\nd2\n");
    while(i < arr_rows)
    {
        d2_sum += arr[i][arr_columns];
        //printf("%d ", arr[i][arr_columns]);
        i++;
        arr_columns--;
    }  
    return (abs(d1_sum - d2_sum));
}
