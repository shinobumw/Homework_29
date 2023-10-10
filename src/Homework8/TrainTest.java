package Homework8;

import java.util.*;

public class TrainTest {
    public static void main(String[] args) {
        Train[] trains = new Train[7];
        trains[0] = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
        trains[1] = new Train(1254, "區間", "屏東", "基隆", 700);
        trains[2] = new Train(118, "自強", "高雄", "台北", 500);
        trains[3] = new Train(1288, "區間", "新竹", "基隆", 400);
        trains[4] = new Train(122, "自強", "台中", "花蓮", 600);
        trains[5] = new Train(1222, "區間", "樹林", "七堵", 300);
        trains[6] = new Train(1254, "區間", "屏東", "基隆", 700);

        System.out.println("原始產生7個Train物件：(2跟7內容相同)");
        int count = 1;
        for (var i : trains) {
            System.out.println(count++ + ": " + i);
        }
        System.out.println();

        HashSet<Train> trainHashSet = new HashSet<Train>();
        ArrayList<Train> trainArrayList = new ArrayList<>();
        TreeSet<Train> trainTreeSet = new TreeSet<Train>();
        for (int i = 0; i < trains.length; i++) {
            trainHashSet.add(trains[i]);
            trainArrayList.add(trains[i]);
            trainTreeSet.add(trains[i]);
        }

        System.out.println("#1 印出不重複的Train物件");
        count = 1;
        for (Iterator<Train> it = trainHashSet.iterator(); it.hasNext(); ) {
            System.out.println(count++ + ": " + it.next());
        }
        System.out.println();

        System.out.println("#2 以班次編號由大到小印出");
        count = 1;
        Collections.sort(trainArrayList);
        for (Train element : trainArrayList) {
            System.out.println(count++ + ": " + element);
        }
        System.out.println();

        System.out.println("#3 不僅能讓班次編號由大排到小印出， 還可以不重複印出Train物件");
        count = 1;
        for (Train element : trainTreeSet) {
            System.out.println(count++ + ": " + element);
        }
        System.out.println();
    }
}
