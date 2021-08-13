package com.megafon.restApi.TestTaskSensor.repository;

import com.megafon.restApi.TestTaskSensor.model.SensorData;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Time;
import java.util.HashMap;
import java.util.List;


public interface SensorRepository extends CrudRepository<SensorData, Integer> {

    @Query(value = "Select * from SENSORDATA WHERE sensorId=? AND time>? AND time<?", nativeQuery = true)
    public List<SensorData> apiHistory(Integer sensorId, Integer from, Integer to);

    @Query(value = "select * from SENSORDATA WHERE (objectId, sensorId, time) IN " +
            "(Select objectId, sensorId, MAX(time) as time from SENSORDATA WHERE objectId=? GROUP BY sensorId )",
            nativeQuery = true)
    public List<SensorData> apiLatest(Integer objectId);

    @Query(value = "Select objectId, AVG(value) from SENSORDATA WHERE objectId=? GROUP BY objectId", nativeQuery = true)
    public HashMap<Integer, Double> apiAvg(Integer objectId);


}
