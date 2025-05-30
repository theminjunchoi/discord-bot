package discordBot;

import javax.security.auth.login.LoginException;
import net.dv8tion.jda.api.JDABuilder;

public class Main {
    public static void main(String[] args) throws LoginException {
        String token = System.getenv("MTM3ODAyNjkzNjUwODQ4NTczMw.GLPfVq.fk-l8QcT2e2DGk9N5St6S_NhLnbb_ZOKLrFKxM");

        JDABuilder.createDefault(token)
                .addEventListeners(new MessageListener())
                .build();
    }
}
