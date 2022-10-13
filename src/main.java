import java.util.*;

 public class main {
    public static void main(String[] args) {
        WeightGrade input = new WeightGrade(); //constructor of weight grade

        System.out.println("Enter number of assignments:"); //user input the assignments
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();

        System.out.println("Enter total point of " + arraySize + " assignments:"); //user input the total point
        String[] totalPoint = input.getUserInput();
        ArrayList<Integer> totalPointArr = new ArrayList<>();
        for (String i : totalPoint) {
            totalPointArr.add(Integer.parseInt(i));
        }

        if (arraySize != totalPointArr.size()){ // if the number isn't connect to the input, the output go wrong
            System.out.println("Wrong Input");
            System.exit(0);
        }

        System.out.println("Enter earned point of " + arraySize + " assignments:"); //input earn points
        String[] earnedPoint = input.getUserInput();
        ArrayList<Integer> earnedPointArr = new ArrayList<>();
        for (String i : earnedPoint) {
            earnedPointArr.add(Integer.parseInt(i));
        }
        if (arraySize != earnedPointArr.size()){ //if the number isn't connect to the input, the output go wrong
            System.out.println("Wrong Input");
            System.exit(0);
        }

        System.out.println("Enter " + arraySize + " assignment percents (%):"); //input the percentages
        String[] percent = input.getUserInput();
        ArrayList<Double> percentArr = new ArrayList<>();
        for (String i : percent) {
            percentArr.add(Double.valueOf(i));
        }
        if (arraySize != percentArr.size()){ //if the number isn't connect to the input, the output go wrong
            System.out.println("Wrong Input");
            System.exit(0);
        }

        for(int i = 0; i < arraySize; i ++) { //calculate the weight grade
            input.setPointTotal(totalPointArr.get(i));
            input.setEarnedPoints(earnedPointArr.get(i));
            input.setAssignmentPercent(percentArr.get(i));
            input.setTotalWeightedGrade(input.getPointTotal(), input.getEarnedPoints(), input.getAssignmentPercent());
        }

        System.out.println("Total Grade = " + input.getTotalWeightedGrade()); //output the total grade
    }
}
