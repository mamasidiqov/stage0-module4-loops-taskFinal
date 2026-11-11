package school.mjc.stage0.loops.finalTask;
public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        for (int row = 1; row <= cathetusLength; row++) {
            for (int s = 0; s < cathetusLength - row; s++) {
                System.out.print(" ");
            }
            for (int star = 0; star < row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}