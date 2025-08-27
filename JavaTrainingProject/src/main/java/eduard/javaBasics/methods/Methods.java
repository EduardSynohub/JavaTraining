package eduard.javaBasics.methods;

public class Methods {
    public static void main(String[] args) {
        int m = 5;
        int index = 3;
        System.out.println(multiply(m, index));

        System.out.println(square(m));

        double pln = 35;
        System.out.format("%.2f%n", convertToUsd(pln));

        String name = "Ewa";
        String surname = "Nowak";
        String nickname = "Evo";

        System.out.println(createName(name, surname, nickname));
    }

    public static int multiply(int multiplier, int index) {
        return multiplier * index;
    }

    public static int square(int num) {
        return (int) Math.pow(num, 2);
    }

    public static double convertToUsd(double pln) {
        return pln/4.04;
    }

    public static String createName(String name, String surname, String nickname) {
        return name + " " + nickname + " " + surname;
    }
}
