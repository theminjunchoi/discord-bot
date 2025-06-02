package discordBot;

import java.util.List;

public enum Answer {

    SANS(List.of("샌즈! 아시는구나!\n이거 겁나 어렵습니다.")),
    JAM(List.of(
            "잠은 죽어서 잔다",
            "잠이 오니?")),
    ED(List.of(
            "갖고 와~",
            "맛있다~"
    ));

    private final List<String> messages;

    Answer(final List<String> messages) {
        this.messages = messages;
    }

    public List<String> getMessages() {
        return messages;
    }
}
