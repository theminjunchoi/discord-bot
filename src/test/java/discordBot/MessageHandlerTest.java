package discordBot;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Set;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class MessageHandlerTest {

    private final MessageHandler handler = new MessageHandler();

    @Test
    void test_샌즈반응() {
        var res = handler.handle("와");
        assertTrue(res.contains("샌즈"));
    }

    @RepeatedTest(10)
    void test_자라반응() {
        var res = handler.handle("자라라라");

        Set<String> expected = Set.of("잠은 죽어서 잔다", "잠이 오니?");
        assertTrue(expected.contains(res));
    }

    @Test
    void test_참깨스틱반응() {
        var res1 = handler.handle("참깨스틱 갖고 와");
        var res2 = handler.handle("push 하면 어떡해");

        assertEquals("갖고 와~", res1);
        assertEquals("갖고 와~", res2);
    }

    @Test
    void test_반응없음() {
        var res = handler.handle("아무 반응 없는 말");
        assertEquals("", res);
    }
}
