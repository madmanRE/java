package dz6;

import java.io.*;
import java.util.ArrayList;

public class ToJSON {
    public static void toJson(ArrayList<Notebook> base) {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("notebooks.json"))) {
            for (Notebook note : base) {
                Notebook notebook = new Notebook(note.getTitle(), note.getPrice(), note.getOzu(), note.getColor(), note.getOs(), note.getHardware());
                oos.writeObject(notebook);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
