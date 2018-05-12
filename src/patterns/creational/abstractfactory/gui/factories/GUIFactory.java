package patterns.creational.abstractfactory.gui.factories;

import patterns.creational.abstractfactory.gui.checkboxes.Checkbox;
import patterns.creational.abstractfactory.gui.buttons.Button;

/**
 * Created by petro on 04-Jul-17.
 */
public interface GUIFactory {

    Button getButton();
    Checkbox getCheckbox();
}
