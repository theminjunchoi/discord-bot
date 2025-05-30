package discordBot;

import javax.security.auth.login.LoginException;
import net.dv8tion.jda.api.JDABuilder;

public class Main {
    public static void main(String[] args) throws LoginException {
        String token = System.getenv("DISCORD_BOT_TOKEN");

        JDABuilder.createDefault(token)
                .addEventListeners(new MessageListener())
                .build();
    }
}
