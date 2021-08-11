package com.megafon.restApi.TestTaskSensor.service;

import com.megafon.restApi.TestTaskSensor.model.SensorData;
import com.megafon.restApi.TestTaskSensor.repository.SensorRepository;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.util.HashMap;
import java.util.List;

@Service
public class SensorService {

    private final SensorRepository sensorRepository;

    public SensorService(SensorRepository sensorRepository) {
        this.sensorRepository = sensorRepository;
    }

    public void add(SensorData sensorData) {
        sensorRepository.save(sensorData);
    }

//    public List<SensorData> apiHistoryapiHistory(Integer sensorId, Integer objectId, Time from, Time to) {
//        return sensorRepository.apiHistory(sensorId, objectId, from, to);
//    }
//
//    public Integer[] apiLatest(Integer objectId) {
//        return sensorRepository.apiLatest(objectId);
//    }
//
//
//    public HashMap<Integer, Double> apiAvg(Integer objectId) {
//        return sensorRepository.apiAvg(objectId);
//    }
}
