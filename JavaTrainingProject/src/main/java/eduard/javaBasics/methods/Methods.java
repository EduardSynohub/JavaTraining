package eduard.javaBasics.methods;

public class Methods {
    public static void main(String[] args) {
//        zadanie 1
        int m = 5;
        int index = 3;
        System.out.println(multiply(m, index));

//        zadanie 2
        System.out.println(square(m));

//        zadanie 3
        double pln = 35;
        System.out.format("%.2f%n", convertToUsd(pln));

//        zadanie 4
        String name = "Ewa";
        String surname = "Nowak";
        String nickname = "Evo";
        System.out.println(createName(name, surname, nickname));

//        zadanie 5
        double gross = 1000;
        double vat = 0.23;
        System.out.println(calculateNetto(gross, vat));

//        zadanie 6
        int age1 = 18;
        int age2 = 50;
        int age3 = 5;
        System.out.println(checkMaturity(age1));
        System.out.println(checkMaturity(age2));
        System.out.println(checkMaturity(age3));

//        zadanie 7
        int num1 = 24;
        int num2 = 23;
        System.out.println(checkEvenOdd(num1));
        System.out.println(checkEvenOdd(num2));

//        zadanie 8
        int num3 = 58;
        System.out.println(maxOfThree(num1, num2, num3));

//    zadanie 9
        int goalsTeamAonFieldA = 0;
        int goalsTeamAonFieldB = 3;
        int goalsTeamBonFieldA = 2;
        int goalsTeamBonFieldB = 1;
        System.out.println(footballWin(goalsTeamAonFieldA, goalsTeamBonFieldA, goalsTeamAonFieldB, goalsTeamBonFieldB));;
    }

//    zadanie 1
    public static int multiply(int multiplier, int index) {
        return multiplier * index;
    }

//    zadanie 2
    public static int square(int num) {
        return (int) Math.pow(num, 2);
    }

//    zadanie 3
    public static double convertToUsd(double pln) {
        return pln/4.04;
    }

//    zadanie 4
    public static String createName(String name, String surname, String nickname) {
        return name + " " + nickname + " " + surname;
    }

//    zadanie 5
    public static double calculateNetto(double gross, double vat) {
        return gross * (1 - vat);
    }

//    zadanie 6
    public static boolean checkMaturity(int age) {
        return age >= 18;
    }

//    zadanie 7
    public static String checkEvenOdd(int number) {
        if (number % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

//    zadanie 8
    public static int maxOfThree(int numberOne, int numberTwo, int numberThree) {
        if (numberOne > numberTwo && numberOne > numberThree) {
            return numberOne;
        } else if (numberTwo > numberOne && numberTwo > numberThree) {
            return numberTwo;
        } else {
            return numberThree;
        }
    }

//    Zadanie 9
    public static String footballWin(int goalsForAonFieldA, int goalsForBonFieldA, int goalsForAonFieldB, int goalsForBonFieldB) {
        if ((goalsForAonFieldA + goalsForAonFieldB) == (goalsForBonFieldA + goalsForBonFieldB)) {
            if (goalsForAonFieldB > goalsForBonFieldA) {
                return "Wygrał zespół A, bo ma więcej bramek na wyjeździe.";
            } else if (goalsForAonFieldB < goalsForBonFieldA){
                return "Wygrał zespół B, bo ma więcej bramek na wyjeździe.";
            } else {
                return "Remis.";
            }
        } else if ((goalsForAonFieldA + goalsForAonFieldB) > (goalsForBonFieldA + goalsForBonFieldB)) {
            return "Wygrał zespół A.";
        } else {
            return "Wygrał zespół B.";
        }
    }
}
