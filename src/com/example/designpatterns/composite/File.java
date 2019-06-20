package com.example.designpatterns.composite;

public class File implements DirectoryEntry{
    private String name;

    public File(String name) {
        this.name = name;
    }

    public void remove() {
        System.out.println(this.name + "ファイルを削除しました");
    }
}
