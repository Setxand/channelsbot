package com.channelsbot.service;

import com.channelsbot.client.TelegramClient;
import com.channelsbot.exception.BotException;
import com.channelsbot.model.User;
import org.springframework.stereotype.Service;
import telegram.Message;

import javax.transaction.Transactional;


@Service
public class CommandService {

	private final TelegramClient telegramClient;

	public CommandService(TelegramClient telegramClient) {
		this.telegramClient = telegramClient;
	}

	@Transactional
	public void commandToBot(Message message, User user) {
		user.setStatus(null);
		String command = message.getText();

		switch (command) {
			case "/start":
				telegramClient.helloMessage(message);
				break;

			default:
				throw new BotException(message, "Invalid command");
		}

	}
}
