interface FileSystemComponent {
    void ls();
}

class File implements FileSystemComponent {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void ls() {
        System.out.println("File: " + name);
    }
}

class Directory implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> children;

    public Directory(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public void add(FileSystemComponent component) {
        children.add(component);
    }

    @Override
    public void ls() {
        System.out.println("Directory: " + name);
        for (FileSystemComponent component : children) {
            component.ls();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Directory root = new Directory("Root");
        Directory folder1 = new Directory("Folder 1");
        File file1 = new File("File 1");
        File file2 = new File("File 2");

        root.add(folder1);
        folder1.add(file1);
        folder1.add(file2);

        root.ls();
    }
}
