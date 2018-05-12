package patterns.creational.builder.general;

/**
 * Created by petro on 01-Oct-17.
 */
// Defines the methods needed for creating parts
// for the robot

public interface RobotBuilderInterface {

    public void buildRobotHead(String head);

    public void buildRobotTorso(String torso);

    public void buildRobotArms(String arms);

    public void buildRobotLegs(String legs);

    public Robot getRobot();

}
