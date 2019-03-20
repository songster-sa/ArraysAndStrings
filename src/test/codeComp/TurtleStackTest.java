package test.codeComp;

import main.codeComp.TurtleStack;

import java.util.ArrayList;
import java.util.List;

public class TurtleStackTest {

    public static void main(String arg[]) {
        TurtleStack obj = new TurtleStack();

        obj.solution(getTurtle1());

        obj.solution(getTurtle2());

        obj.solution(getTurtle3());

        obj.solution(getTurtle4());
    }

    public static List<List<Integer>> getTurtle3() {
        List<List<Integer>> appList = new ArrayList() {{
            add(new ArrayList() {{
                add(4);
                add(7);
            }});
            add(new ArrayList() {{
                add(1);
                add(2);
            }});
            add(new ArrayList() {{
                add(2);
                add(2);
            }});
            add(new ArrayList() {{
                add(3);
                add(2);
            }});
        }};

        return appList;
    }

    public static List<List<Integer>> getTurtle2() {
        List<List<Integer>> appList = new ArrayList() {{
            add(new ArrayList() {{
                add(1);
                add(1);
            }});
            add(new ArrayList() {{
                add(2);
                add(2);
            }});
            add(new ArrayList() {{
                add(4);
                add(2);
            }});
            add(new ArrayList() {{
                add(2);
                add(3);
            }});
        }};

        return appList;
    }

    public static List<List<Integer>> getTurtle1() {
        List<List<Integer>> appList = new ArrayList() {{
            add(new ArrayList() {{
                add(1);
                add(2);
            }});
            add(new ArrayList() {{
                add(2);
                add(1);
            }});
            add(new ArrayList() {{
                add(1);
                add(1);
            }});
            add(new ArrayList() {{
                add(2);
                add(2);
            }});
        }};

        return appList;
    }

    public static List<List<Integer>> getTurtle4() {
        List<List<Integer>> appList = new ArrayList() {{
            add(new ArrayList() {{
                add(1);
                add(1);
            }});
            add(new ArrayList() {{
                add(2);
                add(2);
            }});
            add(new ArrayList() {{
                add(5);
                add(5);
            }});
            add(new ArrayList() {{
                add(1);
                add(6);
            }});
        }};

        return appList;
    }
}
