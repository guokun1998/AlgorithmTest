package pattern.adapter;

/**
 * 被适配的，耳机，提供处理请求：发出声音
 */
public class Adaptee {
    public void makeVoice(){
        System.out.println("发声了~~~~~~~~~~~~~~~~~~~~");
    }
}
