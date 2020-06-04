package com.channelsbot.service;

import com.channelsbot.client.TelegramClient;
import com.channelsbot.model.User;
import org.springframework.stereotype.Service;
import telegram.CallBackQuery;

import javax.transaction.Transactional;

@Service
public class CallBackQueryService {

	private final UserService userService;
	private final TelegramClient telegramClient;

	public CallBackQueryService(UserService userService, TelegramClient telegramClient) {
		this.userService = userService;
		this.telegramClient = telegramClient;
	}

	@Transactional
	public void callBackQueryToBot(CallBackQuery callBackQuery, User user) {
//		String commonPayload = PayloadUtils.getCommonPayload(callBackQuery.getData());
//		switch (CallBackQueryPayload.valueOf(commonPayload)) {
//
//			case QUESTION_PL:
//				question(callBackQuery, user);
//				break;
//
//			default:
//				throw new BotException(callBackQuery.getMessage(), "This feature has not been implemented yet");
//		}

	}
}
