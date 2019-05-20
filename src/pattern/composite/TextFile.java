package pattern.composite;

public class TextFile implements AbstractFile {
    @Override
    public void killVirus() {
        System.out.println("查杀文本文件");
    }
}
