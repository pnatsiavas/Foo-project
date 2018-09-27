package org.foo.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoggerTester {

	Logger logger = LoggerFactory.getLogger(LoggerTester.class);

	@Test
	public void loggingLevelTest() {
		logger.trace("trace log message");
		logger.debug("debug log message");
		logger.info("info log message");
		logger.warn("warn log message");
		logger.error("error log message");

		assertTrue(true);
	}
}
