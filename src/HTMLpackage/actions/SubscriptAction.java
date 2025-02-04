package HTMLpackage.actions;

import javax.swing.*;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledEditorKit;
import java.awt.event.ActionEvent;

public class SubscriptAction extends StyledEditorKit.StyledTextAction {
    public SubscriptAction() {
        super(StyleConstants.Subscript.toString());
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JEditorPane jEditorPane = getEditor(e);    //Получает целевой редактор для действия.
        if (jEditorPane != null) {
            // Действие, которое предполагает, что оно запускается на JEditorPane
            // с установленным StyledEditorKit (или подклассом)
            MutableAttributeSet mutableAttributeSet = getStyledEditorKit(jEditorPane).getInputAttributes();
            // метод класса StyledEditorKit.StyledTextAction,Получает набор редактора, связанный с областью редактора.
            SimpleAttributeSet simpleAttributeSet = new SimpleAttributeSet();
            //Простая реализация MutableAttributeSet с использованием хеш-таблицы.
            StyleConstants.setSubscript(simpleAttributeSet, !StyleConstants.isSubscript(mutableAttributeSet));
            setCharacterAttributes(jEditorPane, simpleAttributeSet, false);
            //Изменяет атрибуты элемента контента, для данного диапазона существующего контента в документе.
        }
    }
}
