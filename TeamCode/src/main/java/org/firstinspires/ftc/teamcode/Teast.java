package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "BotOp")
public class Teast extends OpMode {
    private Johnathan_X johnX;

    public void init(){
        johnX = new Johnathan_X(this, Johnathan_X.Drivetrain.JOHNX);

    }
    public void loop(){
        johnX.moveForwardInches(20, .7);
    }
}