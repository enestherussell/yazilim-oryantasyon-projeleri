public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 7; i++) {
            for
            (int j = 0; j < 4; j++) {

                if ((i == 0 || i == 3 || i == 6) && j < 4) {
                    System.out.print(" * ");
                } else if ((j == 0 && j < 1) && i < 6) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }


    }
}








