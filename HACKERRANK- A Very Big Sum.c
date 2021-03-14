long aVeryBigSum(int ar_count, long* ar) {
    int     i;
    long    sum;
    
    i = 0;
    sum = 0;
    while(i < ar_count)
        sum += ar[i++];
    return (sum);    
}
