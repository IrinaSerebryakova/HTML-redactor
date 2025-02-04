package HTMLpackage.listeners;

import HTMLpackage.View;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.*;

public class TextEditMenuListener implements MenuListener { //Этот класс будет работать аналогично классу UndoMenuListener только для других пунктов меню.
    //Пункты меню, отвечающие за стиль, шрифт, цвет и т.д. должны быть доступны только тогда, когда в нашем редакторе выбрана первая вкладка.
    private View view;

    public TextEditMenuListener(View view) {
        this.view = view;
    }

    @Override
    public void menuSelected(MenuEvent e) {
        JMenu jMenuSelected = (JMenu) e.getSource();
        //Из переданного параметра получать объект, над которым было совершено действие.
        // В нашем случае это будет объект с типом JMenu.
        for (Component component : jMenuSelected.getMenuComponents()) {
            component.setEnabled(view.isHtmlTabSelected());

            // У полученного меню получать список компонентов (пунктов меню).
            // Для каждого пункта меню вызывать метод setEnabled, передав в качестве параметра результат вызова метода isHtmlTabSelected() из представления.
            //Запусти приложение и убедись, что пункты меню стиль, выравнивание, цвет и шрифт доступны только, когда активна закладка HTML и не доступны для закладки Текст.
        }
    }

    @Override
    public void menuDeselected(MenuEvent e) {

    }

    @Override
    public void menuCanceled(MenuEvent e) {

    }
}
