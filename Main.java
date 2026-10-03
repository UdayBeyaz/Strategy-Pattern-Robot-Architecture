public class Main {
    public static void main(String[] args) {
        System.out.println("Initial Behaviors");

        Robot worker = new WorkerRobot();
        worker.display();
        worker.performMovement();
        worker.performCommunication();

        Robot explorer = new ExplorerRobot();
        explorer.display();
        explorer.performMovement();
        explorer.performCommunication();

        System.out.println("Changing Behavior at Runtime");


        worker.setMovementBehavior(new FlyBehavior());
        worker.setCommunicationBehavior(new RadioBehavior());
        worker.performMovement();
        worker.performCommunication();


        explorer.setMovementBehavior(new RollBehavior());
        explorer.setCommunicationBehavior(new SpeakBehavior());
        explorer.performMovement();
        explorer.performCommunication();
    }
}
