package it.unibo.oop.lab.mvcio;

import java.util.ArrayList;
import java.util.List;

import it.unibo.oop.lab.mvc.Controller;

public class ControllerImpl implements Controller {
    private String current;
    private ArrayList<String> list;
    @Override
    
    
    public void SetString(String s) {
        if(s== null) {
            throw new IllegalArgumentException();
        }
        else  {
            list.add(s);
            this.current = s;
        }
        // TODO Auto-generated method stub

    }

    public ControllerImpl() {
        super();
        
        this.list = new ArrayList<>();
    } 

    @Override
    public String NextString() {
        // TODO Auto-generated method stub
        return list.get(list.indexOf(current) + 1);
    }

    @Override
    public List<String> History() {
        ArrayList<String> arr = new ArrayList<>();
        int i;
        for(i=0; i<= list.indexOf(current); i++) {
            arr.add(list.get(i));
        }
        // TODO Auto-generated method stub
        return arr;
    }

    @Override
    public void PrintCurrent() {
        // TODO Auto-generated method stub
        System.out.println("Stringa corrente :" +this.current);
    }

}
