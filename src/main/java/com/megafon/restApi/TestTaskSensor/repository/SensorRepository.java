package com.megafon.restApi.TestTaskSensor.repository;

import com.megafon.restApi.TestTaskSensor.model.SensorData;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Time;
import java.util.HashMap;
import java.util.List;

///api/history: выдать все измерения заданного датчика за заданный интервал времени;
//        Пример запроса:
//        /api/history?sensorId=2&objectId=1&from=1565654400&to=1565827200
//        •	/api/latest: выдать текущие (последние на данных момент) значения всех датчиков для заданного объекта.
//        Пример запроса:
//        /api/latest?objectId=1
//        •	/api/avg: выдать среднее из текущих значений датчиков для каждого объекта.

public interface SensorRepository extends CrudRepository<SensorData, Integer> {

//    @Query(value = "Select * from SENSORDATA", nativeQuery = true)
//    public List<SensorData> apiHistory(Integer sensorId, Integer objectId, Time from, Time to);
//
//    @Query(value = "Select * from SENSORDATA", nativeQuery = true)
//    public Integer[] apiLatest(Integer objectId);
//
//    @Query(value = "Select * from SENSORDATA", nativeQuery = true)
//    public HashMap<Integer, Double> apiAvg(Integer objectId);


}
