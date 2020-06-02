package com.channelsbot.client;

import com.channelsbot.configconst.UrlConfig;
import org.springframework.stereotype.Component;

@Component
public class TelegramClient extends telegram.client.TelegramClient {

	public TelegramClient(UrlConfig urlConfig) {
		super(urlConfig.getServer(), urlConfig.getWebhook(), urlConfig.getTelegramUrls());
	}


}
