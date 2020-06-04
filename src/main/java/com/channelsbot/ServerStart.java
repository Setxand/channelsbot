package com.channelsbot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import telegram.client.TelegramClient;

import javax.annotation.PostConstruct;

@Component
public class ServerStart {

	@Autowired TelegramClient telegramClient;

	@PostConstruct
	public void serverStart() {
		telegramClient.setWebHooks();
	}

}
