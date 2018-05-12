package patterns.creational.builder.general;

/**
 * Created by petro on 01-Oct-17.
 */
public class Robot {

    private String id;
    private String head;
    private String torso;
    private String arms;
    private String legs;

    public Robot (RobotBuilder robotBuilder) {
        this.id = robotBuilder.getId();
        this.head = robotBuilder.getHead();
        this.torso = robotBuilder.getTorso();
        this.arms = robotBuilder.getArms();
        this.legs = robotBuilder.getLegs();
    }

    // only getters are defined. Setters should not be
    // because client shouldn't be able to change the values once they are set,
    // making this object immutable;
    public String getId() { return this.id; }
    public String getHead() { return this.head; }
    public String getTorso() { return this.torso; }
    public String getArms() { return this.arms; }
    public String getLegs() { return this.legs; }

}
