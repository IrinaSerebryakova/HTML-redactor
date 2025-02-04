package HTMLpackage.listeners;

import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.undo.UndoManager;

public class UndoListener implements UndoableEditListener {
    private UndoManager undoManager = new UndoManager();

    public UndoListener(UndoManager undoManager) {
        this.undoManager = undoManager;
    }
    @Override
    public void undoableEditHappened(UndoableEditEvent e) {   //должен из переданного события получать правку и добавлять ее в undoManager.
        undoManager.addEdit(e.getEdit());
    }
}

