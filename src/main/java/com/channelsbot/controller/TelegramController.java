package com.channelsbot.controller;

import com.channelsbot.service.DirectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import telegram.Update;

@RestController
public class TelegramController {

	@Autowired
	DirectionService directionService;

	@PostMapping("/webhook")
	public void webhookEvent(@RequestBody Update update) {
		directionService.directUpdate(update);
	}

}
