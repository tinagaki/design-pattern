package com.example.designpatterns.composite;

public class ExecComposite {
    public static void main(String[] args) {
        File file1= new File("file1");
        File file2= new File("file2");
        File file3= new File("file3");
        File file4= new File("file4");
        File file5= new File("file5");
        File file6= new File("file6");
        File file7= new File("file7");
        File file8= new File("file8");
        File file9= new File("file9");
        Directory directory = new Directory("directory");
        directory.add(file1);
        directory.add(file2);
        directory.add(file3);
        directory.add(file4);
        directory.add(file5);
        directory.add(file6);
        directory.add(file7);
        directory.add(file8);
        directory.add(file9);
        directory.remove();

    }
}
