package level17.lvl2;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        new NoteThread().start();
        new NoteThread().start();
    }

    public static class Note {
        public static final List<String> notes = new ArrayList<>();

        public static void addNote(String note) {
            notes.add(0, note);
        }

        public static void removeNote(String threadName) {
            String note = notes.remove(0);
            if (note == null) {
                System.out.println("другая нить удалила нашу заметку");
            } else if (!note.startsWith(threadName)) {
                System.out.println("Нить [" + threadName + "] удалила чужую заметку [" + note + "]");
            } else {
                System.out.println("Нить [" + threadName + "] удалила свою заметку [" + note + "]");
            }

        }
    }

    public static class NoteThread extends Thread {
        String str;

        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                str = getName() + " Note " + i;
                Note.addNote(str);
                try {
                    Thread.sleep(1000);
                    Note.removeNote(Thread.currentThread().getName());
                } catch (InterruptedException e) {

                }

            }
        }
    }
}

