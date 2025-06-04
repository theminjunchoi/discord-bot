package discordBot;

public class MessageHandler {

    public String handle(String msg) {

        // MEMBER
        if (msg.contains("에드") || msg.contains("에하")) {
            return RandomPicker.chooseFrom(Answer.ED.getMessages());
        }
        if (msg.contains("엠제이") || msg.contains("엠하")) {
            return RandomPicker.chooseFrom(Answer.MJ.getMessages());
        }
        if (msg.contains("칼리") || msg.contains("칼하")) {
            return RandomPicker.chooseFrom(Answer.KALI.getMessages());
        }
        if (msg.contains("제프") || msg.contains("제하")) {
            return RandomPicker.chooseFrom(Answer.JEFF.getMessages());
        }
        if (msg.contains("띠용") || msg.contains("띠하")) {
            return RandomPicker.chooseFrom(Answer.DDIYONG.getMessages());
        }
        if (msg.contains("폰트") || msg.contains("폰하")) {
            return RandomPicker.chooseFrom(Answer.FONT.getMessages());
        }
        if (msg.contains("저스틴") || msg.contains("저하")) {
            return RandomPicker.chooseFrom(Answer.JUSTIN.getMessages());
        }
        if (msg.contains("벡터") || msg.contains("벡하")) {
            return RandomPicker.chooseFrom(Answer.VECTOR.getMessages());
        }
        if (msg.contains("링크") || msg.contains("링하")) {
            return RandomPicker.chooseFrom(Answer.LINK.getMessages());
        }
        if (msg.contains("강산") || msg.contains("강하")) {
            return RandomPicker.chooseFrom(Answer.GANGSAN.getMessages());
        }
        if (msg.contains("율무") || msg.contains("율하")) {
            return RandomPicker.chooseFrom(Answer.YULMOO.getMessages());
        }
        if (msg.contains("행성")) {
            return RandomPicker.chooseFrom(Answer.HANGSEONG.getMessages());
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
        if (msg.contains("ㅋㅋ")) {
            return RandomPicker.chooseFrom(Answer.KKK.getMessages());
        }
        return "";
    }
}
