package com.megafon.restApi.TestTaskSensor.model;

import javax.persistence.*;
import java.sql.Time;

@Entity
public class SensorData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer objectId;
    private Integer sensorId;
    private Integer time;
    private Double value;

    public SensorData(Integer id, Integer objectId, Integer sensorId, Integer time, Double value) {
        this.id = id;
        this.objectId = objectId;
        this.sensorId = sensorId;
        this.time = time;
        this.value = value;
    }

    public SensorData(Integer objectId, Integer sensorId, Integer time, Double value) {
        this.objectId = objectId;
        this.sensorId = sensorId;
        this.time = time;
        this.value = value;
    }

    public SensorData() {

    }

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public Integer getSensorId() {
        return sensorId;
    }

    public void setSensorId(Integer sensorId) {
        this.sensorId = sensorId;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
