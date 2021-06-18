package com.rbiedrawa.app;

import java.util.UUID;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@RequiredArgsConstructor
public class EventProducer {

	private final KafkaTemplate<String, String> kafkaTemplate;

	@SneakyThrows
	@Scheduled(fixedRate = 500)
	public void sendDummyMessage() {
		var event = UUID.randomUUID().toString();
		kafkaTemplate.send(Application.EVENTS_TOPICS, event, event).get();
		log.info("Successfully send event {}", event);
	}
}
