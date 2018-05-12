package patterns.creational.builder.general;

/**
 * Created by petro on 01-Oct-17.
 */
// The director / engineer class creates a Robot using the
// builder interface that is defined (RobotBuilder)

public class RobotEngineer {

    private RobotBuilder robotBuilder;

    // RobotBuilder specification is sent to the engineer
    public RobotEngineer(RobotBuilder robotBuilder){
        this.robotBuilder = robotBuilder;
    }

    // Return the Robot made from the RobotBuilder spec
    public Robot getRobot(){
        if(robotBuilder != null) {
            return this.robotBuilder.getRobot();
        }
        else {
            throw new NullPointerException("Robot is not ready. " +
                    "Please, make your robot before trying to get it.");
        }
    }

    public Robot makeRobot() {
         robotBuilder = new RobotBuilder("1");
         robotBuilder.buildRobotHead("Tin Head");
         robotBuilder.buildRobotArms("Torch Arms");
         robotBuilder.buildRobotTorso("Tin Torso");
         robotBuilder.buildRobotLegs("Stainless wheels");
         Robot robot = robotBuilder.getRobot();
         return robot;
    }

}
