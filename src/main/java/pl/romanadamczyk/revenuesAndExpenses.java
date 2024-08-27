package pl.romanadamczyk;

import java.util.Scanner;

public class revenuesAndExpenses {
    Scanner scanner = new Scanner(System.in);

    int initialBalance;
    int revenue;
    int expense;

    public void closingBalance() {
        System.out.println("Podaj saldo początkowe");
        int initialBalance = scanner.nextInt();
        System.out.println("Ile wynosi Twój przychód?");
        int revenue = scanner.nextInt();
        System.out.println("Ile wynosi Twój wydatek?");
        int expense = scanner.nextInt();
        System.out.println("Twoje saldo końcowe wynosi " + (initialBalance + revenue - expense));
    }
}
