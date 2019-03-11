package test.exam;

import main.exam.AppUsageCombination;

import java.util.ArrayList;
import java.util.List;

public class AppUsageCombinationTest {

    public static void main(String args[]) {
        AppUsageCombination obj = new AppUsageCombination();

        List<List<Integer>> forgroundApps = getAppList();
        List<List<Integer>> backgroundApps = getAppList();

        System.out.println(obj.solution(forgroundApps, backgroundApps, 10));
    }

    public static List<List<Integer>> getAppList() {
        List<List<Integer>> appList = new ArrayList() {{
            add(new ArrayList() {{
                add(1);
                add(2);
            }});
            add(new ArrayList() {{
                add(2);
                add(3);
            }});
            add(new ArrayList() {{
                add(3);
                add(4);
            }});
            add(new ArrayList() {{
                add(4);
                add(5);
            }});
            add(new ArrayList() {{
                add(5);
                add(6);
            }});
        }};

        return appList;
    }
}
