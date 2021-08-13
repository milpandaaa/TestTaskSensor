package com.megafon.restApi.TestTaskSensor;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.megafon.restApi.TestTaskSensor.model.SensorData;
import com.megafon.restApi.TestTaskSensor.service.SensorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.io.InputStream;

import com.fasterxml.jackson.core.type.TypeReference;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestTaskSensorApplicationTests {

    private static final TypeReference<List<SensorData>> VALUE_TYPE_REF = new TypeReference<List<SensorData>>() {
    };

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper().configure(FAIL_ON_IGNORED_PROPERTIES, false);

    @Autowired
    private SensorService sensorService;

    @BeforeEach
    @DisplayName("Добавление в бд данных, сгенерированных в файле data.json")
    void setUp() {
        generateSendorDataPy();
        List<SensorData> models = readTestData("data.json");
        models.forEach(sensorService::add);
    }

    @Test
    @DisplayName("Проверка сброки проекта")
    void contextLoads() {
        Assertions.assertTrue(true);
    }


    private List<SensorData> readTestData(String fileName) {
        InputStream is = getClass().getClassLoader().getResourceAsStream(fileName);
        try {
            return OBJECT_MAPPER.readValue(is, VALUE_TYPE_REF);
        } catch (IOException e) {
            throw new RuntimeException("Error load test data");
        }
    }

    private void generateSendorDataPy(){
        try {
        Runtime.getRuntime().exec(new String[] {"cmd.exe",
                "python .\\src\\test\\resources\\generate_sensor_data.py", "D:\\heroku\\IMG_20210719_172923.jpg"});
        } catch (IOException e) {
            throw new RuntimeException("Error generate test data");
        }
    }
}
