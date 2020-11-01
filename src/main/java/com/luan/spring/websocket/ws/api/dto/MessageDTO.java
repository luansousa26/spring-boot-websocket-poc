package com.luan.spring.websocket.ws.api.dto;

public class MessageDTO {

	private String content;
	private String sender;
	private MessageTypeEnum type;

	public enum MessageTypeEnum {
		CHAT, LEAVE, JOIN
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public MessageTypeEnum getType() {
		return type;
	}

	public void setType(MessageTypeEnum type) {
		this.type = type;
	}
}
