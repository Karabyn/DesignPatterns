package patterns.creational.abstractfactory.gui.app;

import patterns.creational.abstractfactory.gui.buttons.Button;
import patterns.creational.abstractfactory.gui.checkboxes.Checkbox;
import patterns.creational.abstractfactory.gui.factories.MacOSFactory;
import patterns.creational.abstractfactory.gui.factories.WindowsFactory;

/**
 * Created by petro on 04-Jul-17.
 */
public class Application {

    public static void main(String[] args) {
        //Application application = new Application();
        MacOSFactory macOSFactory = new MacOSFactory();
        WindowsFactory windowsFactory = new WindowsFactory();

        Button button1 = macOSFactory.getButton();
        button1.info();
        Checkbox checkbox1 = macOSFactory.getCheckbox();
        checkbox1.info();
        Button button2 = windowsFactory.getButton();
        button2.info();
        Checkbox checkbox2 = windowsFactory.getCheckbox();
        checkbox2.info();

    }
}
