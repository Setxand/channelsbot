package com.channelsbot.controller;

import com.channelsbot.client.TelegramClient;
import com.channelsbot.exception.BotException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	private static final Logger log = Logger.getLogger(GlobalExceptionHandler.class);

	@Autowired TelegramClient telegramClient;

	@ExceptionHandler(BotException.class)
	public void handleBotException(final BotException ex) {
		telegramClient.simpleMessage(ex.getMessage(), ex.getTelegramMessage());
	}

	@ExceptionHandler(Exception.class)
	public void handleException(final Exception ex) {
		log.warn("Failed to process the operation : ", ex);
	}

}
