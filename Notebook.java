public class Notebook {
    Note[] notes = new Note[1000];
    int id = 0;
    
    public boolean addNote(String info) {
        Note newNote = new Note(info);
        notes[id] = newNote;
        id++;
        return true;
    }
}
