package chap_09;

public class Chatting {
    void startChat(String chatId) {
        String nickName = null;
       /* nickName = chatId;
       * 로컬 변수는 final 특성을 가지므로,
       * 아래와 같이 익명 객체 내부에서 사용할 수 없다.
       * */
        Chat chat = new Chat() {
            @Override
            public void start() {
                while (true) {
                    String inputData = "안녕하세요";
                    String message = "[" + nickName + "]" + inputData;
                    sendMessage(message);
                }
            }
        };
        chat.start();
    }

    class Chat {
        void start() {}
        void sendMessage(String message) {}
    }
}
