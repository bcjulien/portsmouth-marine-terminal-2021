package PortsmouthMarineTerminal;

public class Train {

    int idNumber;
    int numberOfCars;
    char destination;
    int numberOfFreight;
    TrainCar freight;
    Container firstContainer;

    Train() {
        this.freight = null;
        this.destination = 'z';
        this.idNumber = 0;
        this.numberOfCars = 0;
        this.numberOfFreight = 0;
    }

    void display() {
        TrainCar current;
        current = this.freight;
        while (current != null) {
            current.display();
            current = current.getNext();
        }
    }

}
