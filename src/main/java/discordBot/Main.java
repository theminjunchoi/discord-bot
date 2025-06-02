package discordBot;

import java.util.EnumSet;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;

public class Main {
    public static void main(String[] args) {
        String token = System.getenv("DISCORD_BOT_TOKEN");

        JDABuilder.createDefault(token)
                .enableIntents(EnumSet.of(GatewayIntent.MESSAGE_CONTENT, GatewayIntent.GUILD_MESSAGES))
                .addEventListeners(new MessageListener())
                .build();
    }
}
