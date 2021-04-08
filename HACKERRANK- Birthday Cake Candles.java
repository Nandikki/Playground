    public static int birthdayCakeCandles(List<Integer> candles) {
        int highest;
        highest = 0;
        for (int i = 0; i < candles.size(); i++)
            if (candles.get(i) > highest)
                highest = candles.get(i);
        int highest_count;
        highest_count = 0;
        for (int i = 0; i < candles.size(); i++)
            if (candles.get(i) == highest)
                highest_count++;
        return (highest_count);
    }
