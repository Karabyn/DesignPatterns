package patterns.creational.builder.general;

/**
 * Created by petro on 01-Oct-17.
 */
public class TestRobotBuilder {
    public static void main(String[] args) {

        RobotBuilder robotBuilder = new RobotBuilder("1");
        robotBuilder.buildRobotHead("Tin Head");
        robotBuilder.buildRobotArms("Torch Arms");
        robotBuilder.buildRobotTorso("Tin Torso");
        robotBuilder.buildRobotLegs("Stainless wheels");
        Robot firstRobot = robotBuilder.getRobot();

        RobotBuilder robotBuilder2 = new RobotBuilder("2");
        robotBuilder2.buildRobotHead("H");
        robotBuilder2.buildRobotArms("A");
        robotBuilder2.buildRobotTorso("T");
        robotBuilder2.buildRobotLegs("S");
        Robot secondRobot = robotBuilder2.getRobot();


        /*
        RobotBuilder robotBuilder = new RobotBuilder("1");
        RobotEngineer robotEngineer = new RobotEngineer(robotBuilder);
        Robot firstRobot = robotEngineer.makeRobot();
        */

        System.out.println("Robot Built " + firstRobot.getId());

        System.out.println("Robot Head Type: " + firstRobot.getHead());

        System.out.println("Robot Torso Type: " + firstRobot.getTorso());

        System.out.println("Robot Arm Type: " + firstRobot.getArms());

        System.out.println("Robot Leg Type: " + firstRobot.getLegs());


        System.out.println("Robot Built " + secondRobot.getId());

        System.out.println("Robot Head Type: " + secondRobot.getHead());

        System.out.println("Robot Torso Type: " + secondRobot.getTorso());

        System.out.println("Robot Arm Type: " + secondRobot.getArms());

        System.out.println("Robot Leg Type: " + secondRobot.getLegs());

    }
}
