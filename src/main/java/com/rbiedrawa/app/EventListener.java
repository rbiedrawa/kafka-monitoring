package com.rbiedrawa.app;

import static com.rbiedrawa.app.Application.EVENTS_TOPICS;

import java.util.concurrent.TimeUnit;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class EventListener {
	private static final String GROUP_ID = "hello-events-listener";

	@SneakyThrows
	@KafkaListener(id = GROUP_ID, topics = EVENTS_TOPICS)
	public void listen(String event) {
		TimeUnit.SECONDS.sleep(1);
		log.info("Received event {}", event);
	}
}