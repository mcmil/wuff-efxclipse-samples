package pl.cmil.efxclipse.skeleton.view;

import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import pl.cmil.another.WhatsUp;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

public class SamplePart {

    @Inject
    private IEclipseContext context;

    @PostConstruct
    public void initialize(BorderPane borderPane) {
        borderPane.setCenter(new Label("This is a Java FX control"));

        WhatsUp whatsUp = new WhatsUp();
        ContextInjectionFactory.inject(whatsUp, context);
        whatsUp.notMuch();

    }

}
