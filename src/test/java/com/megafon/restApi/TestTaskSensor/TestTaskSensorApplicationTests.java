package com.megafon.restApi.TestTaskSensor;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.megafon.restApi.TestTaskSensor.model.SensorData;
import com.megafon.restApi.TestTaskSensor.service.SensorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestTaskSensorApplicationTests {

    @BeforeEach
    void setUp() {
        generateSendorDataPy();
        List<SensorData> models = readTestData("data.json");
        models.forEach(sensorService::add);
    }

    @Test
    void contextLoads() {
        Assertions.assertTrue(true);
    }

	@Test
	@DisplayName("Проверка количества записей")
	public void testCountPerson() {
		Assertions.assertEquals(30, 30);
	}

}
