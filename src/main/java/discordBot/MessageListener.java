package discordBot;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class MessageListener extends ListenerAdapter {

    private final MessageHandler handler = new MessageHandler();

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if (event.getAuthor().isBot()) {
            return;
        }

        String res = handler.handle(event.getMessage().getContentRaw());

        if (!res.isEmpty()) {
            event.getChannel().sendMessage(res).queue();
        }
    }
}
