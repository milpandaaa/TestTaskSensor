package com.megafon.restApi.TestTaskSensor;

import com.megafon.restApi.TestTaskSensor.model.SensorData;
import com.megafon.restApi.TestTaskSensor.repository.SensorRepository;

import java.util.List;

public class ServiceWithDataBase {
    private SensorRepository repository;

    public void addList(List<SensorData> list){
        list.forEach(sensorModel -> repository.save(sensorModel));
    }
}
