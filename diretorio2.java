package Facul;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class MyFileVisitor extends SimpleFileVisitor<Path> {
    public FileVisitResult visitFile(Path path, BasicFileAttributes fileAttributes){
        System.out.println("Nome do arquivo: " + path.getFileName());
        return FileVisitResult.CONTINUE;
    }
    public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes fileAttributes){
        System.out.println("----------Nome do diretório: " + path + "----------");
        return FileVisitResult.CONTINUE;
    }
}

public class diretorio2 {
    public static void main(String[] args) {
        Path source = Paths.get("C:\\xampp\\htdocs\\biblia1");
        try {
            Files.walkFileTree(source, new MyFileVisitor());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
