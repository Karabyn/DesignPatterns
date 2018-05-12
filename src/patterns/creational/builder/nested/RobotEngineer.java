package patterns.creational.builder.nested;

/**
 * Created by petro on 01-Oct-17.
 */
public class RobotEngineer {

    public Robot makeRobot() {
        Robot robot = new Robot.RobotBuilder("1")
                .buildRobotHead("Terminator head")
                .buildRobotArms("Spiderman arms")
                .buildRobotLegs("Real Steel legs")
                .buildRobotTorso("Hulk torso")
                .getRobot();
        return robot;
    }
}
