package patterns.creational.builder.nested;

/**
 * Created by petro on 01-Oct-17.
 */
public class Robot {

    private String id;
    private String head;
    private String torso;
    private String arms;
    private String legs;

    // private constructor to allow only Builder1 to instantiate the robot object
    // and avoid clients to set params.
    private Robot(RobotBuilder robotBuilder) {
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

    // static class so that same class can be used to
    // create multiple robots
    public static class RobotBuilder {

        private Robot robot;
        public static int nfInstances = 0;

        private String id;
        private String head;
        private String torso;
        private String arms;
        private String legs;

        public RobotBuilder(String robotId) {
            this.id = robotId; // this is mandatory field for robot creation
            // optional fields can be set through setters
            nfInstances++;
        }

        //appropriate getters defined here
        public String getId() { return this.id; }
        public String getHead() { return this.head; }
        public String getTorso() { return this.torso; }
        public String getArms() { return this.arms; }
        public String getLegs() { return this.legs; }


        public RobotBuilder buildRobotHead(String head) {
            this.head = head;
            return this;
        }
        public RobotBuilder buildRobotTorso(String torso) {
            this.torso = torso;
            return this;
        }
        public Robot.RobotBuilder buildRobotArms(String arms) {
            this.arms = arms;
            return this;
        }
        public RobotBuilder buildRobotLegs(String legs) {
            this.legs = legs;
            return this;
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

}
