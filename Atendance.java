class Calculate{
    static int TotalPresent = 0;
    static int TotalClass = 0;
     private int TheoryTotal = 0;
    int TheoryPresent = 0;
    int PracticalTotal = 0;
    int PracticalPresent = 0;

    Calculate(String subject,int TheoryTotal,int TheoryPresent, int PracticalTotal, int PracticalPresent) {
        this.TheoryTotal = TheoryTotal;
        this.TheoryPresent = TheoryPresent;
        this.PracticalTotal = PracticalTotal;
        this.PracticalPresent = PracticalPresent;
        Calculate.TotalClass += TheoryTotal;
        Calculate.TotalClass += PracticalTotal;
        Calculate.TotalPresent += TheoryPresent;
        Calculate.TotalPresent += PracticalPresent;
        System.out.print(subject+": ");
        cal(TheoryTotal+PracticalTotal,TheoryPresent+PracticalPresent);
    }

    Calculate(String subject,int TheoryTotal, int TheoryPresent) {
        this.TheoryTotal = TheoryTotal;
        this.TheoryPresent = TheoryPresent;
        Calculate.TotalClass += TheoryTotal;
        Calculate.TotalPresent += TheoryPresent;
        System.out.print(subject+": ");
        cal(TheoryTotal+PracticalTotal,TheoryPresent+PracticalPresent);
    }
    void cal(int T, int P){
        int count = 0;
        double percent = (double) P / T * 100;
        System.out.println("Current %: "+percent);
        while(percent <= 60){
            P++;
            T++;
            count++;
            percent = (double) P / T * 100;
        }
        System.out.println("       "+"More lectures: "+count);
    }
}
public class Atendance {
    public static void main(String[] args) {
    Calculate ML = new Calculate("ML",9,7,2,2);
    Calculate CN = new Calculate("CN",4,4,2,2);
    Calculate CD = new Calculate("CD",10, 8);
    Calculate DA = new Calculate("DA",4,4);
    Calculate PM = new Calculate("PM",10,9);
    Calculate SD = new Calculate("SD",4,2);


    System.out.println("Total Lectures: " + Calculate.TotalClass);
    System.out.println("Total Present: " + Calculate.TotalPresent);
    System.out.println("Total Absent: " + (Calculate.TotalClass - Calculate.TotalPresent));
    System.out.printf("All Subject total %%: %.2f\n", (double)Calculate.TotalPresent / Calculate.TotalClass * 100);
    }
}