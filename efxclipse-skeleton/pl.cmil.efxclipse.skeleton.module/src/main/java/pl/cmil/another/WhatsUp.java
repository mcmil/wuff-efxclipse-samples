package pl.cmil.another;

import org.eclipse.e4.ui.workbench.modeling.ESelectionService;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

public class WhatsUp {

    @Inject
    private ESelectionService service;

    @PostConstruct
    public void huhu() {
        System.out.printf("Huhu");
    }

    public void notMuch() {
         service.getSelection();

        System.out.println("service = " + service.getSelection());

    }
}
