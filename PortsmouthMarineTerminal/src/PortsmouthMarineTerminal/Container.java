package PortsmouthMarineTerminal;

import java.util.Random;

public class Container {

    char origin;
    final char secondCharacter = 'P';
    char destination;
    int idNumber;
    Container next;

    public Container() {
        this.setNext(null);
        this.generateRandomIdNumber();
        this.generateOriginDestination();
    }

    private void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    private void setOrigin(char origin) {
        this.origin = origin;
    }

    private void setDestination(char destination) {
        this.destination = destination;
    }

    private void setNext(Container next) {
        this.next = next;
    }

    private void generateRandomIdNumber() {
        Random rand = new Random();
        int id = rand.nextInt(1000);
        this.setIdNumber(id);
    }

    // randomly generate a character for the origin/destination
    private void generateOriginDestination() {
        String alphabet = "ABCDEFGHIJKLMNOQRSTUVWXYZ";
        Random rand = new Random();
        char orig, dest;
        orig = dest = '\0';
        while (orig == dest) {
            orig = (char) ('A' + rand.nextInt(alphabet.length()));
            this.setOrigin(orig);

            dest = (char) ('A' + rand.nextInt(alphabet.length()));
            this.setDestination(dest);
        }
    }

    public int getIdNumber() { return this.idNumber; }

    public char getOrigin() { return this.origin; }

    public char getSecondCharacter() { return this.secondCharacter; }

    public char getDestination() { return this.destination; }

    public Container getNext() { return this.next; }

    public void display() {
        System.out.print("ID NUM: " + this.getIdNumber());
        System.out.println(" CODE: " + this.getOrigin() + this.getSecondCharacter() + this.getDestination());
    }
}
