package com.megafon.restApi.TestTaskSensor;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.megafon.restApi.TestTaskSensor.model.SensorData;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class ServiceParseSensorData {
    static public void start(String pathName){
        try{
        File file = new File(pathName);
        readFile(file);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void readFile(File file) throws IOException {
        StringBuilder str = new StringBuilder();
        BufferedReader b = new BufferedReader(new FileReader(file));
        while (b.ready()) {
            str.append(b.readLine());
        }
        parseJson(str.toString());
    }

    static private void parseJson(String json){
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        Type listType = new TypeToken<List<SensorModel>>() {}.getType();
        List<SensorData> list = gson.fromJson(json, listType);

        ServiceWithDataBase service = new ServiceWithDataBase();
        service.addList(list);
    }
}
