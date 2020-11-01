package com.luan.spring.websocket.ws.api.rest;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

import com.luan.spring.websocket.ws.api.dto.MessageDTO;

@Controller
public class ChatRest {
	
	@MessageMapping("/chat.register")
	@SendTo("/topic/public")
	public MessageDTO register(@Payload MessageDTO chatMessage, SimpMessageHeaderAccessor headerAccessor) {
		headerAccessor.getSessionAttributes().put("username", chatMessage.getSender());
		return chatMessage;
	}
	
	@MessageMapping("/chat.send")
	@SendTo("/topic/public")
	public MessageDTO sendMessage(@Payload MessageDTO message) {
		return message;
	}
	
}
