package pattern.composite;

public class ImageFile implements AbstractFile {
    @Override
    public void killVirus() {
        System.out.println("查杀图像文件");
    }
}
