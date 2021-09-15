package PortsmouthMarineTerminal;

public class TrainCar {

    int idNumber;
    TrainCar next;
    Container c1;
    Container c2;

    TrainCar() {
        this.next = null;
        this.c1 = null;
        this.c2 = null;
        this.idNumber = 0;
    }

    public TrainCar getNext() {
        return this.next;
    }

    public void display() {

    }

}
