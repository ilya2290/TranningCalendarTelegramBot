package runner.controller;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
public class TelegramBot extends TelegramLongPollingBot {


    //  TelegramWebhookBot ?

    @Override
    public String getBotUsername() {
        return "gym_results_bot";
    }

    @Override
    public String getBotToken() {
        return "5984982252:AAEotk-h_f1-T13fs33AO2vNFsCntLbOmeI";
    }

    @Override
    public void onUpdateReceived(Update update) {

        System.out.println(update.getMessage().getText());
        System.out.println(update.getMessage().getFrom().getFirstName());
        System.out.println(update.getMessage().getFrom().getLastName());
        System.out.println(update.getMessage().getFrom().getId());

    }

}
