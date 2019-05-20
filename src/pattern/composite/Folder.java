package pattern.composite;

import java.util.ArrayList;
import java.util.List;

/*

容器组件
 */
public class Folder implements AbstractFile{

    //存储该容器下的子节点
    private List<AbstractFile> list = new ArrayList<>();

    @Override
    public void killVirus() {
        System.out.println("文件夹进行查杀");
        for (AbstractFile a :
                list) {
            a.killVirus();
        }
    }

    public void add(AbstractFile abstractFile){
        list.add(abstractFile);
    }

    public void remove(AbstractFile abstractFile){
        list.remove(abstractFile);
    }

    public AbstractFile getChild(int index) {
        return list.get(index);
    }


}
