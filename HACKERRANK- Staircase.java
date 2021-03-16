    static void staircase(int n) {
        int space_index;
        
        space_index = n-1;
        while (space_index >= 0) {
            for (int i = 0; i < space_index; i++)
                System.out.print(" ");
            for (int i = 0; i < n - space_index; i++)
                System.out.print("#");
            System.out.println("");
            space_index--;
        }
    }
