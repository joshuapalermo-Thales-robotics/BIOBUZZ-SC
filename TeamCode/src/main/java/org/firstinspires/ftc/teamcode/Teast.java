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
        double x = gamepad1.left_stick_x;
        double y = gamepad1.left_stick_y;
        double turn = gamepad1.right_stick_x/2;

        x *= x;
        if (gamepad1.left_stick_x < 0){
            x = -x;
        }
        y *= y;
        if (gamepad1.left_stick_y < 0){
            y = -y;
        }
        johnX.move(x, y, turn);
    }
}