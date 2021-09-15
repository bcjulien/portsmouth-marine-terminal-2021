package PortsmouthMarineTerminal;

public class Ship {

    boolean docked;
    char status;    // unloading, loading, waiting
    String name;
    int idNumber;
    int cargoNumber;
    int delayDays;
    char destination;

    // what are these?
    char destinationLeft;
    char destinationRight;

    Ship next;
    Container cargo;

    Ship() {
        this.next = null;
        this.cargo = null;
        this.name = "";
        this.idNumber = 0;
        this.destination = 'z';
        this.docked = false;
        this.status = 'W';
        this.cargoNumber = 0;
        this.delayDays = 0;
    }
}
