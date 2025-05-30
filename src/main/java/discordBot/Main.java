package discordBot;

import io.github.cdimascio.dotenv.Dotenv;
import javax.security.auth.login.LoginException;
import net.dv8tion.jda.api.JDABuilder;

public class Main {
    public static void main(String[] args) throws LoginException {
        Dotenv dotenv = Dotenv.load(); // .env 자동 읽음
        String token = dotenv.get("DISCORD_BOT_TOKEN");

        JDABuilder.createDefault(token)
                .addEventListeners(new MessageListener())
                .build();
    }
}
