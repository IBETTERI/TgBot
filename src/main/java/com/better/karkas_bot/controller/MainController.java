package com.better.karkas_bot.controller;


import com.better.karkas_bot.bot.Bot;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Update;

@RestController
@RequestMapping
@FieldDefaults(level = AccessLevel.PUBLIC, makeFinal = true)
public class MainController {
    Bot bot;

    @PostMapping()
    public BotApiMethod<?> listeners(@RequestBody Update update ) {
        return bot.onWebhookUpdateReceived(update);

    }

}
