package pattern.composite;

public class Client {
    public static void main(String[] args) {
        AbstractFile a1 = new Folder();
        AbstractFile a2 = new ImageFile();
        AbstractFile a3 = new TextFile();
        AbstractFile a4 = new VideoFile();
        ((Folder) a1).add(a2);
        ((Folder) a1).add(a3);
        ((Folder) a1).add(a4);

        a2.killVirus();
        a3.killVirus();
        a4.killVirus();
        a1.killVirus();


    }
}
