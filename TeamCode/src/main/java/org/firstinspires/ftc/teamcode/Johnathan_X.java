package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.IMU;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.vision.VisionPortal;
import org.firstinspires.ftc.vision.apriltag.AprilTagProcessor;

public class Johnathan_X {
    private HardwareMap hwMap;
    LinearOpMode auton;
    OpMode teleop;

    public enum Drivetrain {
        JOHNX,
        TEST
    }

    private Drivetrain drive;
    private Telemetry telem;

    public DcMotor motorFL, motorFR, motorBL, motorBR;
    public DcMotor[] allDriveMotors;

    public IMU imu;
    private IMU.Parameters parameters;
    public AprilTagProcessor aprilTag;
    public VisionPortal visionPortal;
    private static final boolean USE_WEBCAM = true;
    static final double X_INCH_TICKS = 45;
    static final double Y_INCH_TICKS = 45;

    //I don't use comments
    public Johnathan_X(OpMode opmode, Drivetrain drivetrain){
        this.teleop = opmode;
        //this.hwMap = opmode.hardwareMap;
        this.drive = drivetrain;
        this.telem = opmode.telemetry;
        //setupHardware();

    }

}