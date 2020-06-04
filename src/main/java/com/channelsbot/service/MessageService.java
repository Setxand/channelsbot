package com.channelsbot.service;


import com.channelsbot.client.TelegramClient;
import com.channelsbot.exception.BotException;
import com.channelsbot.model.User;
import org.springframework.stereotype.Service;
import telegram.Message;

@Service
public class MessageService {

	private final CommandService commandService;
	private final UserService userService;
	private final TelegramClient telegramClient;

	public MessageService(CommandService commandService, UserService userService, TelegramClient telegramClient) {
		this.commandService = commandService;
		this.userService = userService;
		this.telegramClient = telegramClient;
	}

	public void messageFromBot(Message message, User user) {


		if (message.getText().contains("/")) {
			commandService.commandToBot(message, user);

		} else if (user.getStatus() != null) {
			messageByStatus(message, user);
		} else {
			throw new BotException(message, "I don't know this command");
		}

	}

	private void messageByStatus(Message message, User user) {

		switch (user.getStatus()) {
			/// message by status implementation
			default:
				throw new BotException(message, "This feature is not done yet");
		}

	}
}
