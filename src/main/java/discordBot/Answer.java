package discordBot;

import java.util.List;

public enum Answer {

    // ETC
    SANS(List.of("샌즈! 아시는구나!\n이거 겁나 어렵습니다.")),
    JAM(List.of(
            "잠은 죽어서 잔다",
            "잠이 오니?"
    )),
    KKK(List.of(
            "ㅋㅎㅋㅎㅋㅎㅋㅋㅎㅋㅎㅋㅋㅎㅎ",
            "ㅋㅋ 그정도는 아닌데",
            "뭐가 웃김?",
            "ㅋ",
            "하암"
    )),

    // MEMBER 관련
    ED(List.of(
            "갖고 와~",
            "맛있다~",
            "밤을 안 샐 이유가 없어",
            "강산 할 거 하러 가야지",
            "ㅖ?"
    )),
    MJ(List.of(
            "미션 어디까지 함?",
            "집 갈 사람??",
            "나 부름?",
            "나약하네?"
    )),
    KALI(List.of(
            "야야",
            "와이!",
            "홀리쉬잇!",
            "푸하핳",
            "오마이갓쉬!"
    )),
    JEFF(List.of(
            "부볶 ㄱㄱ?",
            "농구하러 갈 사람?",
            "갖고 와~"
    )),
    DDIYONG(List.of(
            "칼퇴라는 말은 없어",
            "띠용?",
            "계단실 문 좀 열어줘",
            "롤 할 사람?"
    )),
    FONT(List.of(
            "담배피러 갈 사람?",
            "폭풍자X영재",
            "폭자영",
            "야미~",
            "플젝 뒤-졌다"
    )),
    JUSTIN(List.of(
            "롯댔네",
            "다 지우고 push 날려",
            "엠제이 오버워치 잘하더라",
            "아잉",
            "오늘은 내가 쏜다!",
            "임금님?"
    )),
    VECTOR(List.of(
            "ㅇㅇ 맞긴해",
            "율무의 공식 남자친구",
            "으헤헤",
            "기호 2번 지지자, 응원송을 부르고 다닌다는 소문이 있다."
    )),
    LINK(List.of(
            "슈... 슈슉",
            "링교수님",
            "귀요미"
    )),
    GANGSAN(List.of(
            "에드 할 거 하러 가야지",
            "맞다 아니야?",
            "오늘은 진짜 ㄹㅈㄷ 먹어야지"
    )),
    YULMOO(List.of(
            "칼리의 언니",
            "칼리와 싸우면 진다는 소문이 있다.",
            "GDD 창시자",
            "하남자",
            "진짜 귀요미"
    )),
    HANGSEONG(List.of(
            "왜 불러",
            "나 부름?",
            "뭐 임마",
            "그만 불러",
            "Why?",
            "ㅋ?",
            "ㅖ?"
    ));

    private final List<String> messages;

    Answer(final List<String> messages) {
        this.messages = messages;
    }

    public List<String> getMessages() {
        return messages;
    }
}
