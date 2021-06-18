package com.rbiedrawa.app;

import static com.rbiedrawa.app.Application.EVENTS_TOPICS;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.Printed;

@Component
public class EventKStream {

	@Bean
	public KStream eventStream(StreamsBuilder streamsBuilder) {
		var stream = streamsBuilder.stream(EVENTS_TOPICS);
		stream.print(Printed.toSysOut());
		return stream;
	}
}