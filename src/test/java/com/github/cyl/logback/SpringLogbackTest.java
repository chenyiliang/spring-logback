package com.github.cyl.logback;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/applicationContext_logback.xml" })
public class SpringLogbackTest {
	private static final Logger LOG = LoggerFactory.getLogger(SpringLogbackTest.class);

	@Test
	public void testSpringLogback() {
		LOG.debug("Hello Debug");
		LOG.info("Hello Info");
		LOG.error("Hello Error");
	}
}
