package pattern.composite;

public class VideoFile implements AbstractFile {
    @Override
    public void killVirus() {
        System.out.println("查杀视频文件");
    }
}
