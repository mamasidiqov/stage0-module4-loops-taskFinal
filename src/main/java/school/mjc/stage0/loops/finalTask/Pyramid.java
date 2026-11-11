package school.mjc.stage0.loops.finalTask;
public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int row = 1; row <= cathetusLength; row++) {
            for (int s = 0; s < cathetusLength - row; s++) {
                System.out.print(" ");
            }
            for (int d = row; d >= 1; d--) {
                System.out.print(d);
            }
            for (int d = 2; d <= row; d++) {
                System.out.print(d);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}