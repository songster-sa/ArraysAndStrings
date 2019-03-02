package test.onlineBank;

import main.onlineBank.TruckDeliveries;

import java.util.ArrayList;
import java.util.List;

public class TruckDeliveriesTest {

    public static void main(String args[]) {
        TruckDeliveries obj = new TruckDeliveries();

        System.out.println(obj.solution(3, getAppList(), 2));
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
        }};

        return appList;
    }
}
