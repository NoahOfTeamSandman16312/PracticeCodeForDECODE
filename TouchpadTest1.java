package org.firstinspires.ftc.robotcontroller.external.samples;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;


public class TouchpadDriverTest1 {
    public static void main() {
    if(gamepad.1_touchpad_finger_1){
        telemetry.adddata("You put 1 finger on the touchpad at this location /n x:"+gamepad.1_touchpad_finger_1_x+"/n y:"+gamepad.1_touchpad_finger_1_y+"/n Thank you for testing!");
        telemetry.update();
    }
}
