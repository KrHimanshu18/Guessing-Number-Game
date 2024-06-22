
import java.util.Scanner;

class task1 {

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        double input;

        System.out.print("\nChoose the difficulty level (EASY, MEDIUM, HARD): ");
        String difficulty = keyboardInput.nextLine();
        difficulty = difficulty.toUpperCase();

        System.out.print("Enter the number of rounds : ");
        int rounds = keyboardInput.nextInt();

        int attempts, points = 0;

        while (rounds > 0) {
            System.out.println("\nChoosing a random number between 1 - 100");
            double num = Math.random();
            num = (num * 100) + 1;
            num = Math.floor(num);
            System.out.println("Number choosen successfully!\n");

            switch (difficulty) {
                case "EASY":
                    points += 15;
                    attempts = 15;
                    do {
                        System.out.print("Guess the number : ");
                        input = keyboardInput.nextDouble();
                        attempts -= 1;

                        if (input < num) {
                            System.out.println("TOO LOW");
                            points--;
                        } else if (input > num) {
                            System.out.println("TOO HIGH");
                            points--;
                        } else if (input > 100 || input <= 0) {
                            attempts++;
                            System.out.println("INVALID INPUT");
                        } else if (input == num) {
                            rounds--;
                            attempts += 1;
                            System.out.println("CORRECT");
                            points += 5;
                            System.out.println("Points scored : " + points);
                            break;
                        }
                        System.out.println("Attempts left : " + attempts + "\n");
                    } while (input != num && attempts != 0);
                    if (attempts == 0) {
                        rounds--;
                        System.out.println("YOU LOSE THE GAME");
                    }
                    break;

                case "MEDIUM":
                    points += 15;
                    attempts = 11;
                    do {
                        System.out.print("Guess the number : ");
                        input = keyboardInput.nextDouble();
                        attempts -= 1;

                        if (input < num) {
                            System.out.println("TOO LOW");
                            points--;
                        } else if (input > num) {
                            System.out.println("TOO HIGH");
                            points--;
                        } else if (input > 100 || input <= 0) {
                            attempts++;
                            System.out.println("INVALID INPUT");
                        } else if (input == num) {
                            attempts += 1;
                            rounds--;
                            System.out.println("CORRECT");
                            points += 5;
                            System.out.println("Points scored : " + points);
                            break;
                        }
                        System.out.println("Attempts left : " + attempts + "\n");
                    } while (input != num && attempts != 0);
                    if (attempts == 0) {
                        rounds--;
                        System.out.println("YOU LOSE THE GAME");
                    }
                    break;

                case "DIFFICULT":
                    points += 15;
                    attempts = 7;
                    do {
                        System.out.print("Guess the number : ");
                        input = keyboardInput.nextDouble();
                        attempts -= 1;

                        if (input < num) {
                            System.out.println("TOO LOW");
                            points--;
                        } else if (input > num) {
                            System.out.println("TOO HIGH");
                            points--;
                        } else if (input > 100 || input <= 0) {
                            attempts++;
                            System.out.println("INVALID INPUT");
                        } else if (input == num) {
                            attempts += 1;
                            rounds--;
                            System.out.println("CORRECT");
                            points += 5;
                            System.out.println("Points scored : " + points);
                            break;
                        }
                        System.out.println("Attempts left : " + attempts + "\n");
                    } while (input != num && attempts != 0);
                    if (attempts == 0) {
                        rounds--;
                        System.out.println("YOU LOSE THE GAME");
                    }
                    break;

                default:
                    System.out.println("INVALID INPUT");
                    break;

            }
        }

    }
}
