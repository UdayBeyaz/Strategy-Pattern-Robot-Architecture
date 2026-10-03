public abstract class Robot {
    protected MovementBehavior movementBehavior;
    protected CommunicationBehavior communicationBehavior;

    public abstract void display();

    public void performMovement() {
        movementBehavior.move();
    }

    public void performCommunication() {
        communicationBehavior.communicate();
    }


    public void setMovementBehavior(MovementBehavior mb) {
        this.movementBehavior = mb;
    }

    public void setCommunicationBehavior(CommunicationBehavior cb) {
        this.communicationBehavior = cb;
    }
}
