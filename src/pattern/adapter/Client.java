package pattern.adapter;

/**
 * 客户端,有发出Target请求的能力，
 */
public class Client{
    public void musicModel(Target target){
        System.out.println("来到音乐模块，放音乐");
        target.playMusic();
    }

    public static void main(String[] args) {
        Client client = new Client();

        Adaptee adaptee = new Adaptee();

        Target target = new Adapter(adaptee);

        client.musicModel(target);
    }

}
