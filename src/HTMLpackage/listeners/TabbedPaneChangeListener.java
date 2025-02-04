package HTMLpackage.listeners;

import HTMLpackage.View;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TabbedPaneChangeListener implements ChangeListener {  //Этот класс будет слушать и обрабатывать изменения состояния панели вкладок
    private View view;

    public TabbedPaneChangeListener(View view) {
        this.view = view;
    }
    @Override
    public void stateChanged(ChangeEvent e) { //Этот метод должен быть обеспечен реализацией ChangeListener.
        view.selectedTabChanged();
    }
}


