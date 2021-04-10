    public static int nextMultipleOf5(int n) {
        int d;
        
        d = n/10;
        return ((((d * 10) + 5) > n) ? (d * 10) + 5 : (d * 10) + 10);
    }
    
    public static boolean checkGrade(int grade) {
        return (grade >= 38);
    }
    public static List<Integer> gradingStudents(List<Integer> grades) {
        int grade;
        for (int i = 0; i < grades.size(); i++) {
            grade = grades.get(i);
            if (checkGrade(grade)) {
                if (nextMultipleOf5(grade) - grade < 3)
                    grades.set(i, nextMultipleOf5(grade));
            } else {
                continue ;
            }
        }
        return grades;
    }
}
