package assignment5;

public class DisplayPattern {

    public void patternGenerator(){
        for (int i = 1; i<=5; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        DisplayPattern ob = new DisplayPattern();
        ob.patternGenerator();
    }
}
