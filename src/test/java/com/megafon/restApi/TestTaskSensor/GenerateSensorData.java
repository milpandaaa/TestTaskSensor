package com.megafon.restApi.TestTaskSensor;

import java.io.IOException;

public class GenerateSensorData {
    static public void run(){
        try {
            Process runtimeProcess = Runtime.getRuntime().exec(new String[] {"cmd.exe",
                    "chmod 755 ./generate_sensor_data.py",
                    "python ./generate_sensor_data.py"});
            int processComplete = runtimeProcess.waitFor();
        } catch (IOException | InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
