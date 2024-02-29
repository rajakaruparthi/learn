import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChemicalExperiment {

    private int calculateMixture(int i1, int i2) {
        return i1 * i2;
    }

    public static void main(String[] args) {
        ChemicalExperiment ce = new ChemicalExperiment();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total chemicals");
        int num = sc.nextInt();
        List<Integer> vapourRates = new ArrayList<>();
        System.out.println(" Enter " + num + " vapor rates");
        for (int i = 0; i < num; i++) {
            vapourRates.add(sc.nextInt());
        }
    }
}

