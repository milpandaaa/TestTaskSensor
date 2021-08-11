package com.megafon.restApi.TestTaskSensor.controller;

import com.megafon.restApi.TestTaskSensor.model.SensorData;
import com.megafon.restApi.TestTaskSensor.service.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Time;
import java.util.HashMap;
import java.util.List;

@RestController
public class SensorController {

    @Autowired
    private SensorService sensorService;

    @PostMapping("/api/save")
    public void saveSensor(@RequestBody SensorData sensor) {
        sensorService.add(sensor);

    }

//    @GetMapping("/api/history")
//    public List<SensorData> getSensor(@PathVariable("sensorId") Integer sensorId,
//                                      @PathVariable("objectId") Integer objectId,
//                                      @PathVariable("from") Time from,
//                                      @PathVariable("to") Time to
//                                      ) {
//        return sensorService.apiHistoryapiHistory(sensorId, objectId, from, to);
//    }
//
//    @GetMapping("/api/latest")
//    public Integer[] apiLatest(@PathVariable("objectId") Integer objectId) {
//        return sensorService.apiLatest(objectId);
//    }
//
//    @GetMapping("/api/avg:")
//    public HashMap<Integer, Double> apiAvg(@PathVariable("objectId") Integer objectId) {
//        return sensorService.apiAvg(objectId);
//    }

}
