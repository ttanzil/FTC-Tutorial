package org.firstinspires.ftc.teamcode.TaseenCode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

@Autonomous()
public class HelloTaseen extends OpMode {
    @Override
    public void init() {
        telemetry.addData("Hello","Taseen");
    }

    @Override
    public void loop() {

    }
}
