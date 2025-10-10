package org.firstinspires.ftc.teamcode.OpModes;

import androidx.annotation.NonNull;

import com.acmerobotics.dashboard.telemetry.TelemetryPacket;
import com.acmerobotics.roadrunner.Action;
import com.acmerobotics.roadrunner.Pose2d;
import com.acmerobotics.roadrunner.SequentialAction;
import com.acmerobotics.roadrunner.TrajectoryActionBuilder;
import com.acmerobotics.roadrunner.Vector2d;
import com.acmerobotics.roadrunner.ftc.Actions;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.MecanumDrive;
import org.firstinspires.ftc.teamcode.TestServo;
 @TeleOp(name="TouchyTesty1", group="Linear Opmode")
 

public class TouchpadDriverTest1 {
    public static void main() {
    if(gamepad.1_touchpad_finger_1){
        telemetry.adddata("You put 1 finger on the touchpad at this location /n x:"+gamepad.1_touchpad_finger_1_x+"/n y:"+gamepad.1_touchpad_finger_1_y+"/n Thank you for testing!");
        telemetry.update();
    }
}
