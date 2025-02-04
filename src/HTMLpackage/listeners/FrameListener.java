package HTMLpackage.listeners;

import HTMLpackage.View;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameListener extends WindowAdapter { //класс для удобства создания объектов-прослушивателей
    private View view;

    public FrameListener(View view) {
        this.view = view;
    }
    @Override
    public void windowClosing(WindowEvent e) { // Вызывается, когда окно находится в процессе закрытия.
        view.exit();
    }
}
