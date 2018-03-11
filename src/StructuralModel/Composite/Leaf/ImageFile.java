package StructuralModel.Composite.Leaf;

import StructuralModel.Composite.Component.AbstractFile;

/**
 * Created by Administrator on 2018/3/11.
 */
public class ImageFile implements AbstractFile {
    private String fileName;
    public ImageFile(String fileName){
        this.fileName=fileName;
    }
    @Override
    public void add(AbstractFile f) {
        //没有这项业务逻辑就不写
    }

    @Override
    public void remove(AbstractFile f) {
        //没有这项业务逻辑就不写
    }

    @Override
    public void display(int depth) {
        for(int i=0;i<depth;i++){
            System.out.print("  ");
        }
        System.out.println("|"+fileName);
    }
}
