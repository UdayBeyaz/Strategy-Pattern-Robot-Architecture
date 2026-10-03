public class ExplorerRobot extends Robot {
    public ExplorerRobot() {

        movementBehavior = new FlyBehavior();
        communicationBehavior = new RadioBehavior();
    }


    public void display() {
        System.out.println("I am an Explorer Robot. I discover new places!");
    }
}
