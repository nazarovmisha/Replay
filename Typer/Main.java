package Typer;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Typer typer1 = new Typer("Message first. ");
        Typer typer2 = new Typer("Message second. ");
        typer1.start();
        typer1.join();
        typer2.start();
        typer2.join();
    }
}
