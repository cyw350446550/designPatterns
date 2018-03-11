package StructuralModel.Composite.Composite;

import StructuralModel.Composite.Component.AbstractFile;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/3/11.
 */
public class Folder implements AbstractFile {
    private String fileName;
    List<AbstractFile> list = new ArrayList<>();

    public Folder(String fileName){

        this.fileName=fileName;
    }

    @Override
    public void add(AbstractFile f) {
        list.add(f);
    }

    @Override
    public void remove(AbstractFile f) {
        list.remove(f);
    }

    @Override
    public void display(int depth) {
        for(int i=0;i<depth;i++){
            System.out.print("  ");
        }
        System.out.println("|"+fileName);
        for(AbstractFile f:list){
            f.display(depth+2);//人为制造缩进
        }
    }


    public static void main(String[] args){
        Folder folder=new Folder("dsbaks");
    }
}
