package it.unibo.oop.lab.mvcio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

import it.unibo.oop.lab.mvc.Controller;

public class ControllerImpl implements Controller {

    private LinkedList<String> InsiemeDiStringhe = new LinkedList<>();
    private String NextToPrint;
    
    
    public void setNextStringToPrint(String NextString) {
        if(NextString == null) {
            throw new IllegalArgumentException("nullo");
        } else {
            NextToPrint = NextString;
        }
    }

    public String getNextStringToPrint() {
        return NextToPrint;
    }

    public LinkedList<String> getHistoryPrinted() {
        return InsiemeDiStringhe;
    }


    public void PrintCurrentString() {
        if(NextToPrint == null) {
            throw new IllegalStateException("non ci sono stringhe");
        } else {
            System.out.println(NextToPrint);
        }

    }
    

}
