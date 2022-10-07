import java.util.*;
public class ArrayProject {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many days' temperatures? ");
        int numOfDays = sc.nextInt();
        int[] temp = new int[numOfDays];
        // record temperatures and find average
        int sum = 0;
        for (int i=0; i<numOfDays; i++) {
            System.out.print("Day " + (i+1) + "'s high temp: ");
            temp[i] = sc.nextInt();
            sum += temp[i];
        }

        double avg = sum / numOfDays;
        // count days above average
        int above = 0;
        for (int i=0; i<temp.length; i++) {
            if (temp[i] > avg) {
                above++;
            }
        }
        System.out.println();
        System.out.println("Average Temp = " + avg);
        System.out.println(above + " days had above average temperature");

    }
}
