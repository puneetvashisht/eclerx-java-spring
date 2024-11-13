package com.eclerx.spring_boot_final_demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.eclerx.spring_boot_final_demo.services.WorkoutService;

@SpringBootTest
class SpringBootFinalDemoApplicationTests {

	@Autowired
	WorkoutService workoutService;

	@Test
	void testWorkoutServiceSayHello() {
		String result = workoutService.sayHello();
		assertEquals("Hello from WorkoutService!", result);
	}

}
