int* compareTriplets(int a_count, int* a, int b_count, int* b, int* result_count) {
    int al;
    int bo;
    int i;
    int *points;
    
    al = 0;
    bo = 0;
    i = 0;
    while (i < 3)
    {
        al += (a[i] > b[i]) ? 1 : 0;
        bo += (a[i] < b[i]) ? 1 : 0;
        i++;
    }
    *result_count = 2;
    points = malloc(2 * sizeof(int));
    *(points) = al;
    *(points + 1) = bo;
    return (points); 
}
