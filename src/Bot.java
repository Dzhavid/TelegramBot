import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


public class Bot extends TelegramLongPollingBot {
    public void onUpdateReceived(Update update) { // функция выполняется при получении сообщения
        SendMessage sendMessage = new SendMessage().setChatId(update.getMessage().getChatId());

        sendMessage.setText("Улыбнись, ты студент МИРЭА");
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

        if (update.getMessage().getText().equals("Понедельник")) {
            sendMessage.setText("3 пара \n13-10:14-40\nI(Нечетная неделя) МПТ в М и РТ лк Трипольский П.Э.\n" +
                    "\n\t\t\tII(Четная неделя) 2,6,14н МПТ в М и РТ\tпр\tТрипольский П.Э.\n" +
                    "4 пара\t14-50\t16-20\tI\tТеория автоматич. упр-я\tлк\tЛохин В.М.\n" +
                    "\t\t\tII\tкр 10 н. Теория автоматич. упр-я\tлк\tЛохин В.М.\n" +
                    "5 пара \t16-30\t18-00\tI\tФиз.культура и спорт\t\t\n" +
                    "\t\t\tII\tФиз.культура и спорт\t\t\n" +
                    "6 пара\t18-10\t19-40\tI\t\"9,11 н. Средства связи в СУ АР\n" +
                    "13 н. МПТ в М и РТ\"\t\"пр+лаб\n" +
                    "пр\"\t\"Калач Г.П.\n" +
                    "Трипольский П.Э.\"\n" +
                    "\t\t\tII\t12 н. Теория автоматич. упр-я\tлк\tЛохин В.М.");
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        else if (update.getMessage().getText().equals("Вторник")) {
            sendMessage.setText("2 пара \t10-40\t12-10\tI\tТеория автоматич. упр-я\tлаб\tЧеплакова М.В.\n" +
                    "\t\t\tII\tТеория автоматич. упр-я\tлаб\tЧеплакова М.В.\n" +
                    "3 пара\t13-10\t14-40\tI\tИнф. элементы РТС\tлк\tЦыпкин В.Н.\n" +
                    "\t\t\tII\tИнф. элементы РТС\tлк\tЦыпкин В.Н.\n");
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        else if (update.getMessage().getText().equals("Среда")) {
            // BotApiMethod<? extends Serializable> sendMessage;
            sendMessage.setText("1\t9-00\t10-30\tI\tОперацион. системы РВ\tлаб\tСмирнов М.Ю\n" +
                    "\t\t\tII\tМат. основы К и Д Р\tлаб\tТягунов О.А.\n" +
                    "2\t10-40\t12-10\tI\tТеория автоматич. упр-я\tпр\tКарабутов Н.Н.\n" +
                    "\t\t\tII\tТеория автоматич. упр-я\tпр\tКарабутов Н.Н.\n" +
                    "3\t13-10\t14-40\tI\t\t\t\n" +
                    "\t\t\tII\tМПТ в М и РТ\tпр\tТрипольский П.Э.\n" +
                    "4\t14-50\t16-20\tI\t\t\t\n" +
                    "\t\t\tII\t4,8,12,16н МПТ в М и РТ\tлаб\tМаркарян М.М.\n" +
                    "5\t16-30\t18-00\tI\t\t\t\n" +
                    "\t\t\tII\t4,8,12,16н МПТ в М и РТ\tлаб\tМаркарян М.М.\n");
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        else if(update.getMessage().getText().equals("Четверг")){
            sendMessage.setText("1\t9-00\t10-30\tI\t\t\t\n" +
                    "\t\t\tII\tМат. основы К и Д Р\tпр\tТягунов О.А.\n" +
                    "2\t10-40\t12-10\tI\tОперацион. системы РВ\tпр\tСмирнов М.Ю\n" +
                    "\t\t\tII\tОперацион. системы РВ\tлк\tСмирнов М.Ю\n" +
                    "3\t13-10\t14-40\tI\tМат. основы К и Д Р\tлк\tТягунов О.А.\n" +
                    "\t\t\tII\tМат. основы К и Д Р\tлк\tТягунов О.А.\n" +
                    "4\t14-50\t16-20\tI\t\"3,7,11,15 н Инф. элем. РТС (1 п/г)\n" +
                    "1,5,9,13 н. Инф. элем. РТС (2 п/г)\"\t\"лаб\n" +
                    "лаб\"\t\"Цыпкин В.Н.\n" +
                    "Цыпкин В.Н.\"\n" +
                    "\t\t\tII\tИнф. элементы РТС \tпр\tЦыпкин В.Н.\n");
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        else if(update.getMessage().getText().equals("Пятница")){
            sendMessage.setText("1\t9-00\t10-30\tI\tДетали ММР и их констр.\tлк\tТрофимова Г.Н.\n" +
                    "\t\t\tII\t\t\t\n" +
                    "2\t10-40\t12-10\tI\tДетали ММР и их констр.\tпр\tТрофимова Г.Н.\n" +
                    "\t\t\tII\t\t\t\n" +
                    "3\t13-10\t14-40\tI\t\t\t\n" +
                    "\t\t\tII\tМПТ в М и РТ\tлк\tТрипольский П.Э.\n" +
                    "4\t14-50\t16-20\tI\t\t\t\n" +
                    "\t\t\tII\tФиз.культура и спорт\t\t\n");
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        else if(update.getMessage().getText().equals("Суббота")){
            sendMessage.setText("3\t13-10\t14-40\tI\tкр 9 н. Средства связи в СУ АР\tлк\tКалач Г.П.\n" +
                    "\t\t\tII\tСредства связи в СУ АР\tлк\tКалач Г.П.\n" +
                    "4\t14-50\t16-20\tI\tкр 9 н. Средства связи в СУ АР\tпр\tКалач Г.П.\n" +
                    "\t\t\tII\t8 н. Средства связи в СУ АР\tлк\tКалач Г.П.\n" +
                    "5\t16-30\t18-00\tI\tкр 9 н. Средства связи в СУ АР\tлаб\tКалач Г.П.\n" +
                    "\t\t\tII\t\t\t\n");
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }


    public String getBotUsername(){ // получение имени бота
        return "@scheduleMireabot";
    }
    public String getBotToken(){ // получение токена
        return "1001854402:AAHTKYLN-Om883Ro9D8d_9pPaMjHXiotnDs";
    }
}
