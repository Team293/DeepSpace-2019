// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc293.Drivetrain2019.subsystems;


import org.usfirst.frc293.Drivetrain2019.commands.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.PIDSource;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.sensors.PigeonIMU;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class Drivetrain extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private WPI_TalonSRX leftTalonSRX1;
    private WPI_TalonSRX leftTalonSRX2;
    private WPI_TalonSRX rightTalonSRX3;
    private WPI_TalonSRX rightTalonSRX4;
    private Encoder lQuadratureEncoder;
    private Encoder rQuadratureEncoder;
    private PigeonIMU iMU;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public Drivetrain() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        leftTalonSRX1 = new WPI_TalonSRX(2);
        
        
        
        leftTalonSRX2 = new WPI_TalonSRX(3);
        
        
        
        rightTalonSRX3 = new WPI_TalonSRX(4);
        
        
        
        rightTalonSRX4 = new WPI_TalonSRX(5);
        
        
        
        lQuadratureEncoder = new Encoder(0, 1, false, EncodingType.k4X);
        addChild("LQuadratureEncoder",lQuadratureEncoder);
        lQuadratureEncoder.setDistancePerPulse(1.0);
        lQuadratureEncoder.setPIDSourceType(PIDSourceType.kRate);
        
        rQuadratureEncoder = new Encoder(2, 3, false, EncodingType.k4X);
        addChild("RQuadratureEncoder",rQuadratureEncoder);
        rQuadratureEncoder.setDistancePerPulse(1.0);
        rQuadratureEncoder.setPIDSourceType(PIDSourceType.kRate);
        
        iMU = new PigeonIMU(15);
        
        
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop

    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

}

