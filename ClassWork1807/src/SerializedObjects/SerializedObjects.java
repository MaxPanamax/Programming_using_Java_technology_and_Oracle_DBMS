package SerializedObjects;


import java.io.*;

public class SerializedObjects {

    public static void main(String[] args) {
        Book b = new Book();
        serialize(b, "somefile.txt");

        Book bb = (Book) deserialize("somefile.txt");
        System.out.println(bb);
        NotABook noBook = new NotABook("The Great Gatsby", "Max Panama");
        try (FileOutputStream fileOut = new FileOutputStream("book.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(noBook);
        } catch (Exception e) {
            e.printStackTrace();
      
        }
        if(noBook!=null)
        {
        	System.out.println("Название книги"+noBook.getTitle());
        	System.out.println("АВтор"+noBook.getAuthor());
        }
    }

    public static void serialize(Object obj, String fileName) {
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
            
        }
    }

    public static Object deserialize(String fileName) {
        FileInputStream fis = null;
        Object obj = null;
        try {
            fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            obj = ois.readObject();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }
}

class Book implements Serializable {
    private static final long serialVersionUID = 1L;

    private String author = "Oleg";//если мы хотим чтобы текст был невидимым мы используем transient
    transient private String text = "Иногда в литературе в связи с сериализаций можно\r\n"
            + "встретить термин персистентность. Что это такое? Обычно,\r\n"
            + "объект существует в оперативной памяти максимум до\r\n"
            + "тех пор, пока выполняется приложение. При завершении\r\n"
            + "приложения мусорщик удаляет в оперативной памяти\r\n"
            + "все объекты. Так вот, сериализация позволяет сохранить\r\n"
            + "объект в файл, а затем позже десериализовать его и про-\r\n"
            + "должить работу с объектом. Таким образом, жизненный\r\n"
            + "цикл объекта уже не ограничивается временем выполнения\r\n"
            + "приложения. Это и есть персистентность — продление\r\n"
            + "времени жизни объекта за пределы времени выполнения\r\n" + "приложения.";


    public String toString() {
        return author + "   " + text;
    }

    public String checkAuthor() {
        return author;
    }
}

class NotABook implements Externalizable {
    private String title;
    private String author;

    public NotABook() {
        //конструктор без аргументов
    }

    public NotABook(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        //здесь выполняется запись состояния объекта в поток
        out.writeObject(title);
        out.writeObject(author);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        //здесь выполняется чтение объекта из потока
        title = (String) in.readObject();
        author = (String) in.readObject();
    }
}
