package StructuralModel.Composite;

import StructuralModel.Composite.Component.AbstractFile;
import StructuralModel.Composite.Composite.Folder;
import StructuralModel.Composite.Leaf.ImageFile;
import StructuralModel.Composite.Leaf.TextFile;

/**
 * Created by Administrator on 2018/3/11.
 */
public class Client {
    public static void main(String[] args) {
        AbstractFile folder1 = new Folder("文件夹1");
        AbstractFile folder2 = new Folder("文件夹2");
        AbstractFile folder3 = new Folder("文件夹3");
        AbstractFile folder4 = new Folder("文件夹4");

        AbstractFile image1 = new ImageFile("图片1");
        AbstractFile image2 = new ImageFile("图片2");
        AbstractFile text1 = new TextFile("文本1");

        folder1.add(folder2);
        folder1.add(folder3);
        folder3.add(text1);

        folder2.add(folder4);
        folder4.add(image1);
        folder2.add(image2);
        System.out.println("目录结构为：");
        folder1.display(0);
    }
}
