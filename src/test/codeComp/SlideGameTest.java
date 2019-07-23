package test.codeComp;

import main.codeComp.SlideGame;

public class SlideGameTest {
    public static void main(String arg[]) {
        SlideGame obj = new SlideGame();
        obj.solutionOne(3, null);
        obj.solutionOne(3, new int[]{0, 1, 2, 3});
        obj.solutionOne(3, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        obj.solutionOne(3, new int[]{1, 2, 0, 3, 4, 5, 6, 7, 8});
        obj.solutionOne(3, new int[]{1, 2, 0, 3, 4, 5, 6, 0, 8});
        obj.solutionOne(4, new int[]{1, 2, 0, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 6, 7});
    }
}
