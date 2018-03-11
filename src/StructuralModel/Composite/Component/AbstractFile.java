package StructuralModel.Composite.Component;

/**
 * Created by Administrator on 2018/3/11.
 */
public interface AbstractFile {
    void add(AbstractFile f);

    void remove(AbstractFile f);

    void display(int depth);
}
