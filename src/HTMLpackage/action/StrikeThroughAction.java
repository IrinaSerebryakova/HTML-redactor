package HTMLpackage.action;

import javax.swing.*;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledEditorKit;
import java.awt.event.ActionEvent;

public class StrikeThroughAction extends StyledEditorKit.StyledTextAction{
    /**
     * Creates a new StyledTextAction from a string action name.
     *
     * @param nm the name of the action
     */
    public StrikeThroughAction() {
        super(StyleConstants.StrikeThrough.toString());
    }

    public void actionPerformed(ActionEvent actionEvent) {
            JEditorPane jEditorPane = getEditor(actionEvent);
            if(jEditorPane != null){
                MutableAttributeSet mutableAttributeSet = getStyledEditorKit(jEditorPane).getInputAttributes();
                SimpleAttributeSet simpleAttributeSet = new SimpleAttributeSet();
                StyleConstants.setStrikeThrough(simpleAttributeSet, !StyleConstants.isStrikeThrough(mutableAttributeSet));
                setCharacterAttributes(jEditorPane,simpleAttributeSet,false);


            }
    }
}
