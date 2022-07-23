import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

// Task 1

        // 1
        int[] weights = new int[3];
        for (int i = 0; i < weights.length; i++) {
            weights[i] = (i * 1) + 1;
            System.out.println(weights[i]);
        }
        System.out.println();

        // 2
        double[] boxes = {1.57, 7.654, 9.986};
        for (int i = 0; i < boxes.length; i++) {
            System.out.println(boxes[i]);
        }
        System.out.println();

        // 3
        int[] weeks = {18, 20, 9, 70, 85, 12};
        for (int i = 0; i < weeks.length; i++) {
            System.out.println(weeks[i]);
        }
        System.out.println();

// Task 2

        // 1
        for (int i = 0; i < weights.length; i++) {
            weights[i] = (i * 1) + 1;
            if (i == weights.length - 1) {
                System.out.print(weights[i]);
            } else {
                System.out.print(weights[i] + ", ");
            }
        }
        System.out.println();

        // 2
        for (int i = 0; i < boxes.length; i++) {
            if (i == boxes.length - 1) {
                System.out.print(boxes[i]);
            } else {
                System.out.print(boxes[i] + ", ");
            }
        }
        System.out.println();

        // 3
        for (int i = 0; i < weeks.length; i++) {
            if (i == weeks.length - 1) {
                System.out.print(weeks[i]);
            } else {
                System.out.print(weeks[i] + ", ");
            }
        }
        System.out.println();
        System.out.println();

// Task 3

        // 1
        for (int i = weights.length - 1; i >= 0; i--) {
            if (i == weights.length - weights.length) {
                System.out.print(weights[i]);
            } else {
                System.out.print(weights[i] + ", ");
            }
        }
        System.out.println();

        // 2
        for (int i = boxes.length - 1; i >= 0; i--) {
            if (i == boxes.length - boxes.length) {
                System.out.print(boxes[i]);
            } else {
                System.out.print(boxes[i] + ", ");
            }
        }
        System.out.println();

        // 3
        for (int i = weeks.length - 1; i >= 0; i--) {
            if (i == weeks.length - weeks.length) {
                System.out.print(weeks[i]);
            } else {
                System.out.print(weeks[i] + ", ");
            }
        }
        System.out.println();
        System.out.println();


// Task 4

        // 1

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < weights.length; i ++) {
            list.add(weights[i]);
        }
        ArrayList<Integer> odd = new ArrayList<Integer>();

        for (int i = 0; i < list.size(); i++) {
            int x = list.get(i);
            if (x % 2 != 0)
                odd.add(x + 1);
        }
        System.out.println(odd);



    }
}