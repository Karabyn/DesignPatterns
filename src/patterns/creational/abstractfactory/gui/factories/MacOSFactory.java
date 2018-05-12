package patterns.creational.abstractfactory.gui.factories;

import patterns.creational.abstractfactory.gui.checkboxes.Checkbox;
import patterns.creational.abstractfactory.gui.buttons.MacOSButton;
import patterns.creational.abstractfactory.gui.checkboxes.MacOSCheckbox;
import patterns.creational.abstractfactory.gui.buttons.Button;


/**
 * Created by petro on 04-Jul-17.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Checkbox getCheckbox() {
        return new MacOSCheckbox();
    }

    @Override
    public Button getButton() {
        return new MacOSButton();
    }
}
