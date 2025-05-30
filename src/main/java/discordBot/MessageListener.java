package discordBot;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class MessageListener extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        String msg = event.getMessage().getContentRaw();

        if (event.getAuthor().isBot()) {
            return;
        }

        if (msg.startsWith("와")) {
            event.getChannel().sendMessage("샌즈! 아시는구나!\n이거 겁나 어렵습니다.").queue();
        } else if (msg.contains("자라")) {
            event.getChannel().sendMessage("잠은 죽어서 잔다").queue();
        } else if (msg.contains("참깨스틱") || msg.contains("push")) {
            event.getChannel().sendMessage("갖고와~").queue();
        }
    }
}
