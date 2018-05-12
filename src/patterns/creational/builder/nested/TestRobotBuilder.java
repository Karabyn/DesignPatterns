package patterns.creational.builder.nested;

/**
 * Created by petro on 01-Oct-17.
 */
public class TestRobotBuilder {
    public static void main(String[] args) {
        Robot firstRobot = new Robot.RobotBuilder("1")
                .buildRobotHead("Terminator head")
                .buildRobotArms("Spiderman arms")
                .buildRobotLegs("Real Steel legs")
                .buildRobotTorso("Hulk torso")
                .getRobot();

        Robot secondRobot = new Robot.RobotBuilder("2")
                .buildRobotHead("H")
                .buildRobotArms("S")
                .buildRobotLegs("R")
                .buildRobotTorso("H")
                .getRobot();



        /*
        RobotEngineer re = new RobotEngineer();
        Robot firstRobot = re.makeRobot();
        */

        System.out.println("Robot Built");

        System.out.println("Robot Head Type: " + firstRobot.getHead());

        System.out.println("Robot Torso Type: " + firstRobot.getTorso());

        System.out.println("Robot Arm Type: " + firstRobot.getArms());

        System.out.println("Robot Leg Type: " + firstRobot.getLegs());

        System.out.println("Robot Built");

        System.out.println("Robot Head Type: " + secondRobot.getHead());

        System.out.println("Robot Torso Type: " + secondRobot.getTorso());

        System.out.println("Robot Arm Type: " + secondRobot.getArms());

        System.out.println("Robot Leg Type: " + secondRobot.getLegs());

        System.out.println("builder insances: " + Robot.RobotBuilder.nfInstances);
    }
}
