package com.better.karkas_bot.service.handler;

import com.better.karkas_bot.bot.Bot;
import com.better.karkas_bot.service.contract.AbstractHandler;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Message;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class CommandHandler extends AbstractHandler {
    @Override
    public BotApiMethod<?> answer(BotApiObject object, Bot bot) {
        var query = (Message) object;
        throw new UnsupportedOperationException();
    }
}
