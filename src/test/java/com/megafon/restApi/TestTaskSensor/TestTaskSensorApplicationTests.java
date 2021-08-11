package com.megafon.restApi.TestTaskSensor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestTaskSensorApplicationTests {

	@BeforeEach
	void setUp() {
		//падает тест
		GenerateSensorData.run();


		ServiceParseSensorData.start(".\\src\\test\\java\\com\\megafon\\restApi\\TestTaskSensor\\data.json");
	}

	@Test
	void contextLoads() {
	}

	@Test
	@DisplayName("Проверка количества записей")
	public void testCountPerson() {
		Assertions.assertEquals(30, 30);
	}

}
