package patterns.creational.abstractfactory.gui.factories;

import patterns.creational.abstractfactory.gui.checkboxes.Checkbox;
import patterns.creational.abstractfactory.gui.checkboxes.WindowsCheckbox;
import patterns.creational.abstractfactory.gui.buttons.Button;
import patterns.creational.abstractfactory.gui.buttons.WindowsButton;

/**
 * Created by petro on 04-Jul-17.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Checkbox getCheckbox() {
        return new WindowsCheckbox();
    }

    @Override
    public Button getButton() {
        return new WindowsButton();
    }
}
