package discordBot;

public class MessageHandler {

    public String handle(String msg) {
        if (msg.startsWith("와")) {
            return RandomPicker.chooseFrom(Answer.SANS.getMessages());
        }

        if (msg.contains("자라")) {
            return RandomPicker.chooseFrom(Answer.JAM.getMessages());
        }

        if (msg.contains("참깨스틱") || msg.contains("push")) {
            return RandomPicker.chooseFrom(Answer.ED.getMessages());
        }

        return "";
    }
}
