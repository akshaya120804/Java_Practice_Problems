package sample;

public class stringweigthcalculator {
    public static int calculateWeight(String str) {
        int weight = 0;

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                weight += Character.toLowerCase(c) - 'a' + 1;  // Assign weights: a=1, b=2, ..., z=26
            }
        }
        return weight;
    }

    public static void main(String[] args) {
        String input = "Hello World!!";
        int weight = calculateWeight(input);
        System.out.println("Weight of \"" + input + "\": " + weight);
    }
}


