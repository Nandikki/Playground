    static String timeConversion(String s) {
        String[] timeInString = s.split(":", 3);
        if (timeInString[2].charAt(2) == 'P') {
            int hour;
            
            hour = Integer.parseInt(timeInString[0]);
            if (hour < 12)
                hour+= 12;
            timeInString[0] = ((hour < 10) ? ("0" + hour) : ("" + hour));
        } else {
            if (timeInString[0].equals("12"))
                timeInString[0] = "00";
        }
        return (timeInString[0] + ":" + timeInString[1] + ":" + timeInString[2].charAt(0) + timeInString[2].charAt(1));
    }
