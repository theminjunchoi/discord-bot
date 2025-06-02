package discordBot;

public class MessageHandler {

    public String handle(String msg) {

        // MEMBER
        if (msg.contains("에드")) {
            return RandomPicker.chooseFrom(Answer.ED.getMessages());
        }
        if (msg.contains("엠제이")) {
            return RandomPicker.chooseFrom(Answer.MJ.getMessages());
        }
        if (msg.contains("칼리")) {
            return RandomPicker.chooseFrom(Answer.KALI.getMessages());
        }
        if (msg.contains("제프")) {
            return RandomPicker.chooseFrom(Answer.JEFF.getMessages());
        }
        if (msg.contains("띠용")) {
            return RandomPicker.chooseFrom(Answer.DDIYONG.getMessages());
        }
        if (msg.contains("폰트")) {
            return RandomPicker.chooseFrom(Answer.FONT.getMessages());
        }
        if (msg.contains("저스틴")) {
            return RandomPicker.chooseFrom(Answer.JUSTIN.getMessages());
        }
        if (msg.contains("벡터")) {
            return RandomPicker.chooseFrom(Answer.VECTOR.getMessages());
        }
        if (msg.contains("링크")) {
            return RandomPicker.chooseFrom(Answer.LINK.getMessages());
        }
        if (msg.contains("강산")) {
            return RandomPicker.chooseFrom(Answer.GANGSAN.getMessages());
        }
        if (msg.contains("율무")) {
            return RandomPicker.chooseFrom(Answer.YULMOO.getMessages());
        }

        // ETC
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
