package patterns.creational.builder.general;

/**
 * Created by petro on 01-Oct-17.
 */
public class RobotBuilder implements RobotBuilderInterface {

    private Robot robot;

    private String id;
    private String head;
    private String torso;
    private String arms;
    private String legs;

    public RobotBuilder(String robotId) {
        this.id = robotId; // this is mandatory field for robot creation
        // optional fields can be set through setters
    }

    //appropriate getters defined here
    public String getId() { return this.id; }
    public String getHead() { return this.head; }
    public String getTorso() { return this.torso; }
    public String getArms() { return this.arms; }
    public String getLegs() { return this.legs; }

    public void buildRobotHead(String head) {
        this.head = head;
    }
    public void buildRobotTorso(String torso) {
        this.torso = torso;
    }
    public void buildRobotArms(String arms) {
        this.arms = arms;
    }
    public void buildRobotLegs(String legs) {
        this.legs = legs;
    }

    public Robot getRobot() {
        if (robot == null) {
            robot = build();
        }
        return robot;
    }

    //finally the build method
    private Robot build() {
        return new Robot(this);
    }
}