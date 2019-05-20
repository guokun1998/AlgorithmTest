package pattern.composite;

/**
 * 容器
 */
public interface Composite extends Component {
    void add(Component component);
    void remove(Component component);
    Component getChild(int index);
}
