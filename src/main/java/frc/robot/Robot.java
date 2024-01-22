package frc.robot;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkLowLevel.MotorType; 

public class Robot extends TimedRobot {

  private XboxController joy1 = new XboxController(0);  
  public static final int kCanID = 1;
  private static final MotorType kMotorType = MotorType.kBrushless; 
  public CANSparkMax spark;
  private RelativeEncoder encoder_v;

  @Override
  public void robotInit() {}

  @Override
  public void robotPeriodic () {

  double axis1 = joy1.getRawAxis(1);

  SmartDashboard.putNumber("axis", axis1);
  
  }

  @Override
  public void autonomousInit() {}
 
  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {}

  @Override
  public void teleopPeriodic() {

  double axis1 = joy1.getRawAxis(1);

  spark = new CANSparkMax(kCanID, kMotorType);

  spark.set(axis1);

  encoder_v= spark.getEncoder();

  SmartDashboard.putNumber("Encoder", encoder_v.getPosition());

  }

  @Override
  public void testInit() {}

  @Override
  public void testPeriodic() {}

}