package com.better.karkas_bot.service.contract;


import com.better.karkas_bot.bot.Bot;
import com.better.karkas_bot.service.handler.CallbackQueryHandler;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Message;

public abstract class AbstractManager  {

    public abstract BotApiMethod<?> mainMenu(Message message, Bot bot  );

    public abstract BotApiMethod<?> mainMenu(CallbackQuery callbackQuery);



}
