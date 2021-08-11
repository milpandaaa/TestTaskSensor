package com.megafon.restApi.TestTaskSensor.model;

import java.sql.Time;

public class SensorData {
    private Integer objectId;
    private Integer sensorId;
    private Time time;
    private Double value;

    public SensorData(Integer objectId, Integer sensorId, Time time, Double value) {
        this.objectId = objectId;
        this.sensorId = sensorId;
        this.time = time;
        this.value = value;
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

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
