package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Teast")
public class Teast extends OpMode {
    private Johnathan_X johnX;

    public void init(){
        johnX = new Johnathan_X(this, Johnathan_X.Drivetrain.JOHNX);
    }
    public void loop(){
        johnX.getHSV();
        double x = gamepad1.left_stick_x;
        double y = gamepad1.left_stick_y;
        double turn = gamepad1.right_stick_x/2;

        x *= x;
        if (gamepad1.left_stick_x < 0){
            x = -x;
        }
        y *= y;
        if (gamepad1.left_stick_y > 0){
            y = -y;
        }
        if (gamepad1.right_trigger > 0){
            x /= 3;
            y /= 3;
            turn /= 2;
        }

        johnX.move(x, y, turn);

        if (gamepad2.dpad_up){

        } else if (gamepad2.dpad_down){

        }
        if (gamepad2.x){

        }
        if (gamepad2.right_trigger > 0){

        }
    }

}
