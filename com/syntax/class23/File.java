package com.syntax.class23;

public abstract class File {
    void edit(){
        System.out.println("Editing");
    }
    void close(){
        System.out.println("Closing");
    }
    abstract void open();
}
class JavaFile extends File{

    @Override
    void open() {
        System.out.println("Use IntelliJ to open file");
    }
}
class WordFile extends File{

    @Override
    void open() {
        System.out.println("Use Microsoft to open");
    }
}

