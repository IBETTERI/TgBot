package com.better.karkas_bot.service.contract;

import com.better.karkas_bot.bot.Bot;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;

public abstract class AbstractHandler {
    public abstract   BotApiMethod<?> answer(BotApiObject object, Bot bot);

}
