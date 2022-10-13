import java.util.Scanner;
public class WeightGrade {//variables part
    private double totalGrade = 0;//set the total grade as 0 at first
    private int pointTotal;
    private int earnedPoints;
    private double assignmentPercent;
    public String[] getUserInput() { //input with space and comma
        Scanner scanner = new Scanner(System.in).useDelimiter("[,\n]");
        String line = scanner.nextLine().replaceAll(" ", "");
        String[] str = line.split(",");
        return str;
    }
        public void setPointTotal(int pointTotal) { //set point total
            this.pointTotal = pointTotal;
    }
            public int getPointTotal() { //get point total
                return pointTotal;
    }

        public void setEarnedPoints(int earnedPoints) { //set earn point
            this.earnedPoints = earnedPoints;
    }
            public int getEarnedPoints() { //get earn point
                return earnedPoints;
    }

        public void setAssignmentPercent(double assignmentPercent) { //set assignments percentage
            this.assignmentPercent = assignmentPercent;
    }
        public double getAssignmentPercent() { //get assignment percentage
            return assignmentPercent;
    }

        public void setTotalWeightedGrade(int totalPoints, int earnedPoints, double percentage) { //set total grade
            this.totalGrade = totalGrade + ((float) earnedPoints / totalPoints) * percentage;
    }
            public double getTotalWeightedGrade() { //get total grade
                return totalGrade;
    }

    public char letterGrade(double totalWeightedGrade) {
        if (100 >= totalWeightedGrade && totalWeightedGrade >= 90) { //calculate the Grade range, also print the letter grade
            System.out.println("Grade: A");

        } else if (90 > totalWeightedGrade && totalWeightedGrade >= 80) {
            System.out.println("Grade: B");

        } else if (80 > totalWeightedGrade && totalWeightedGrade >= 70) {
            System.out.println("Grade: C");

        } else if (70 > totalWeightedGrade && totalWeightedGrade >= 60) {
            System.out.println("Grade: D");

        } else if (60 > totalWeightedGrade && totalWeightedGrade >= 0) {
            System.out.println("Grade: F");

        } else {
            System.out.println("Wrong input");
        }
        return 0;
    }

}

