public class WorkerRobot extends Robot {
    public WorkerRobot() {

        movementBehavior = new WalkBehavior();
        communicationBehavior = new SpeakBehavior();
    }

    @Override
    public void display() {
        System.out.println("I am a Worker Robot. I build things!");
    }
}
