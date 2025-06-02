package discordBot;

import java.util.List;
import java.util.Random;

public class RandomPicker {

    private static final Random random = new Random();

    public static String chooseFrom(List<String> list) {
        return list.get(random.nextInt(list.size()));
    }
}
