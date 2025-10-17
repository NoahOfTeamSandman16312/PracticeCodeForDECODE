package org.firstinspires.ftc.teamcode.OpModes;

import androidx.annotation.NonNull;

import com.acmerobotics.dashboard.telemetry.TelemetryPacket;
import com.acmerobotics.roadrunner.Action;
import com.acmerobotics.roadrunner.Pose2d;
import com.acmerobotics.roadrunner.SequentialAction;
import com.acmerobotics.roadrunner.TrajectoryActionBuilder;
import com.acmerobotics.roadrunner.Vector2d;
import com.acmerobotics.roadrunner.ftc.Actions;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.MecanumDrive;
import org.firstinspires.ftc.teamcode.TestServo;
 @TeleOp(name="TouchyTesty2", group="Linear Opmode")

	 
public class TouchpadDriverTest2 {
    public static void main() {
    if(gamepad1.touchpad_finger_1){
        telemetry.adddata("You put 1 finger on the touchpad at this location \n x:"+gamepad1.touchpad_finger_1_x+"\n y:"+gamepad1.touchpad_finger_1_y+"\n Thank you for testing!\n");
				}if else(gamepad1.touchpad_finger_2){
					 telemetry.adddata("You put 2 fingers on the touchpad at this location \n x:"+gamepad1.touchpad_finger_2_x+"\n y:"+gamepad1.touchpad_finger_2_y+"\n Thank you for testing!");
    }else{
					telemetry.adddata("You have put no fingers on the touchpad");
				}
					telemetry.update();
		
}
