import java.util.Random;
import java.util.Scanner;

/**
 * @author davidlu
 * @version 1.0
 */

public class RepetitionPreOO {
    public static void main(String[] args) {
        RepetitionPreOO obj = new RepetitionPreOO();
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        //OPG 3
        System.out.println("\nOPGAVE 3");
        System.out.println(obj.sum(10, 5)); //Two integers
        System.out.println(obj.sum(10.4, 10.5)); //Two doubles
        System.out.println(obj.sum(10, 12.3)); //Int + double
        System.out.println(obj.sum(14.3, 12)); //Double + int


        //OPG 6
        System.out.println("\nOPGAVE 6");
        System.out.print("Indtast dit fornavn og efternavn: ");
        String navn = obj.modtagInputString(scan);

        System.out.print("Indtast alder: ");
        int age = obj.modtagInputInt(scan);

        System.out.print("Indtast din BMI: ");
        double BMI = obj.modtagDoubleInt(scan);


        System.out.printf("\nLength of chars in name: %6d\n", (navn.length() - 1)); //Subtracts 1, because of the space char
        System.out.printf("Square root of age: %11.2f\n", Math.sqrt(age));
        System.out.printf("BMI squared: %18.2f\n", Math.pow(BMI, 2));

        if (age > BMI) {
            System.out.println("Age is greater than BMI");
        } else if (BMI > age) {
            System.out.println("BMI is greater than age");
        } else {
            System.out.println("Age and BMI have the same value");
        }

        int nextSpace = navn.indexOf(" "); //Finds the next space
        System.out.println(navn.charAt(0) + "." + navn.substring(nextSpace)); //Prints first char in name, finds next space char, and prints rest of the name


        //OPG 8
        System.out.println("\nOPGAVE 8");
        System.out.print("Random number between 1 and ");
        int highestNumber = scan.nextInt();
        System.out.println("Random number: " + obj.randomTal(highestNumber, random));


        //OPG 9
        System.out.println("\nOPGAVE 9");
        System.out.print("Momssats: ");
        double momssats = scan.nextDouble();
        System.out.print("Pris: ");
        double pris = scan.nextDouble();
        System.out.println("Pris eksklusiv moms: " + obj.prisEksklMoms(momssats, pris) + " kr.");

        int varesalg = 82322;
        int variableOmkostninger = 38992;
        System.out.printf("Varesalg %25d kr.\nVariable omk. %20d kr.\n--------------------------------------\nDagens dækningsbidrag %12d kr.\n", varesalg, variableOmkostninger, (varesalg - variableOmkostninger));


        //OPG 10
        System.out.println("\nOPGAVE 10");
        System.out.printf("In 100 cm there are %.2f ft\n", obj.cmTilFod(100));

        System.out.print("Input cm you want converted to ft: ");
        double cm = scan.nextDouble();
        assert cm > 0 : "Input must be greater than 0"; //If input is below 0, system exits and prints message

        double ft = obj.cmTilFod(cm);
        System.out.printf("%.2f cm is %.2f ft\n", cm, ft);


        //OPG 11
        System.out.println("\nOPGAVE 11");
        boolean tennisspiller1 = false;
        boolean tennisspiller2 = false;

        System.out.println("Status på Tennisspiller1 (1/0)");
        int statusSpiller1 = obj.modtagInputInt(scan);
        System.out.println("Status på Tennisspiller2 (1/0)");
        int statusSpiller2 = obj.modtagInputInt(scan);

        if (statusSpiller1 == 1) {
            tennisspiller1 = true;
        }
        if (statusSpiller2 == 1) {
            tennisspiller2 = true;
        }

        if (tennisspiller1 && tennisspiller2) {
            System.out.println("Lad os spille tennis!");
        } else {
            System.out.println("Jeg venter på en træningsmakker");
        }


        //OPG 12
        System.out.println("\nOPGAVE 12");
        System.out.println("Er du glad?");
        scan.nextLine(); //Scanner bug
        String userMood = obj.modtagInputString(scan).toLowerCase();
        String result = (userMood.equals("ja")) ? "Fedt!" : "Surt!";
        System.out.println(result);


        //OPG 13
        System.out.println("\nOPGAVE 13");
        System.out.print("Indtast antal møntkast: ");
        obj.platEllerKrone(obj.modtagInputInt(scan), random);


        //OGP 14
        System.out.println("\n\nOPGAVE 14");
        System.out.print("Indtast antal kort: ");
        obj.hjerteTæller(obj.modtagInputInt(scan), random);


        //OPG 15
        System.out.println("\nOPGAVE 15");
        int botRandom = random.nextInt(10) + 11;
        boolean keepRunning = true;

        System.out.println("Guess a number between 10-20");
        while (keepRunning) {
            int userGuess = scan.nextInt();
            if (userGuess > botRandom) {
                System.out.println("My number is lower");
            } else if (botRandom > userGuess) {
                System.out.println("My number is higher");
            } else {
                System.out.println("That is correct!");
                keepRunning = false;
            }
        }


        //OPG 16
        System.out.println("\nOPGAVE 16");
        switch (botRandom) {
            case 10, 11, 12, 13, 14 -> System.out.println("Interval 10-14");
            case 15, 16, 17, 18, 19, 20 -> System.out.println("Interval 15-20");
        }
        if (botRandom < 10 || botRandom > 20) {
            System.out.println("Ukendt interval");
        }


        //OPG 17
        System.out.println("\nOPGAVE 17");
        System.out.print("Indtast et tal: ");
        obj.ligeTal(obj.modtagInputInt(scan));
    }

    //////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////

    //----------SUM OF INTEGERS----------||OPG 3\\
    private int sum(int x, int y) {
        return x + y;
    }

    //----------SUM OF DOUBLES----------||OPG 3\\
    private double sum(double x, double y) {
        return x + y;
    }


    //----------MODTAG INPUT STRING----------||OPG 4\\
    private String modtagInputString(Scanner scan) {
        return scan.nextLine();
    }


    //----------MODTAG INPUT INT----------||OPG 5\\
    private int modtagInputInt(Scanner scan) {
        return scan.nextInt();
    }

    //----------MODTAG INPUT DOUBLE----------||OPG 5\\
    private double modtagDoubleInt(Scanner scan) {
        return scan.nextDouble();
    }


    //----------RANDOM NUMBER----------||OPG 7\\
    private int randomTal(int input, Random random) {
        int number = 0;

        if (input == 0) {
            return number;
        } else if (input < 0) {
            number = -1;
        } else {
            number = random.nextInt(input) + 1;
        }
        return number;
    }


    //----------PRIS EKSKLUSIV MOMS----------||OPG 9\\
    private double prisEksklMoms (double momssats, double prisInklMoms) {
        return prisInklMoms * (1 - (momssats * 0.01));
    }


    //----------CM TO FOOT----------||OPG 10\\
    private double cmTilFod (double cm) {
        double foot = 30.48;
        return cm / foot;
    }


    //----------COINFLIP----------||OPG 13\\
    private void platEllerKrone (int antalKast, Random random) {
        int[] coins = new int[antalKast];
        int plat = 0;
        int krone = 0;

        for (int i = 0; i < coins.length; i++) {
            coins[i] = random.nextInt(2);

            switch (coins[i]) {
                case 0 -> plat++;
                case 1 -> krone++;
            }
        }
        System.out.printf("Plat: %5d\nKrone: %4d", plat, krone);
    }


    //----------HEART COUNTER----------||OPG 14\\
    private void hjerteTæller(int cardInput, Random random) {
        int[] cards = new int[cardInput];
        int oneCount = 0; int twoCount = 0; int threeCount = 0; int fourCount = 0; int fiveCount = 0; int sixCount = 0; int sevenCount = 0; int eightCount = 0; int nineCount = 0; int tenCount = 0; int elevenCount = 0; int twelveCount = 0; int thirteenCount = 0;

        for (int i = 0; i < cards.length; i++) {
            cards[i] = random.nextInt(13) + 1;

            switch (cards[i]) {
                case 1 -> oneCount++;
                case 2 -> twoCount++;
                case 3 -> threeCount++;
                case 4 -> fourCount++;
                case 5 -> fiveCount++;
                case 6 -> sixCount++;
                case 7 -> sevenCount++;
                case 8 -> eightCount++;
                case 9 -> nineCount++;
                case 10 -> tenCount++;
                case 11 -> elevenCount++;
                case 12 -> twelveCount++;
                case 13 -> thirteenCount++;
            }
        }
        System.out.printf("1'ere: %5d\n2'ere: %5d\n3'ere: %5d\n4'ere: %5d\n5'ere: %5d\n6'ere: %5d\n7'ere: %5d\n8'ere: %5d\n9'ere: %5d\n10'ere: %4d\n11'ere: %4d\n12'ere: %4d\n13'ere: %4d\n", oneCount, twoCount, threeCount, fourCount, fiveCount, sixCount, sevenCount, eightCount, nineCount, tenCount, elevenCount, twelveCount, thirteenCount);
    }

    //----------EVEN OR ODD----------||OPG 17\\
    private boolean ligeTal(int input) {
        boolean even = true;
        if (input % 2 == 0) {
            System.out.println("Tallet er lige");
        } else {
            System.out.println("Tallet er ulige");
            even = false;
        }
        return even;
    }
}
