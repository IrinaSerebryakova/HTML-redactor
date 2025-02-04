package HTMLpackage.actions;

import javax.swing.*;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledEditorKit;
import java.awt.event.ActionEvent;

public class StrikeThroughAction extends StyledEditorKit.StyledTextAction {
    public StrikeThroughAction() {
        super(StyleConstants.StrikeThrough.toString());
    }
    public void actionPerformed(ActionEvent actionEvent) {
        JEditorPane jEditorPane = getEditor(actionEvent);
        if (jEditorPane != null) {
            MutableAttributeSet mutableAttributeSet = getStyledEditorKit(jEditorPane).getInputAttributes();
            SimpleAttributeSet simpleAttributeSet = new SimpleAttributeSet();
            StyleConstants.setStrikeThrough(simpleAttributeSet, !StyleConstants.isStrikeThrough(mutableAttributeSet));
            setCharacterAttributes(jEditorPane, simpleAttributeSet, false);
        }
    }
}
