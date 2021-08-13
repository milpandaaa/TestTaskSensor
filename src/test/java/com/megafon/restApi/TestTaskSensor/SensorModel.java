package com.megafon.restApi.TestTaskSensor;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.sql.Time;

public class SensorModel {
    @SerializedName("objectId")
    @Expose
    private Integer objectId;
    @SerializedName("sensorId")
    @Expose
    private Integer sensorId;
    @SerializedName("time")
    @Expose
    private Integer time;
    @SerializedName("value")
    @Expose
    private Double value;

    public SensorModel(Integer objectId, Integer sensorId, Integer time, Double value) {
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
