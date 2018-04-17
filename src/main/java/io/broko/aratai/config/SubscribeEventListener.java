package io.broko.aratai.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionSubscribeEvent;


@Component
public class SubscribeEventListener implements ApplicationListener<SessionSubscribeEvent> {

	 private static final Logger logger = LoggerFactory.getLogger(SubscribeEventListener.class);
	 
	@Override
	public void onApplicationEvent(SessionSubscribeEvent sessionSubscribeEvent) {
		StompHeaderAccessor headerAccessor = StompHeaderAccessor.wrap(sessionSubscribeEvent.getMessage());
		logger.info("Session Id: {}",headerAccessor.getSessionAttributes().get("sessionId").toString());
	}


}
