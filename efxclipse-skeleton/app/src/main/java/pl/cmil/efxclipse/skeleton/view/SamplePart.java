package pl.cmil.efxclipse.skeleton.view;

import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

import javax.annotation.PostConstruct;

public class SamplePart {

    @PostConstruct
    public void initialize(BorderPane borderPane) {
        borderPane.setCenter(new Label("This is a Java FX control"));

    }

}
