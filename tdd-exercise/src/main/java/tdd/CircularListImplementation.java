package tdd;

import java.util.ArrayList;
import java.util.Optional;

public class CircularListImplementation implements CircularList {

    private int index;
    private ArrayList<Integer> list;

    public CircularListImplementation(int index, ArrayList<Integer> list) {
        this.index = 0;
        this.list = new ArrayList<Integer>();
    }

    @Override
    public void add(final int element){
        list.add(element);
    }

   
    @Override
    public int size(){
        return list.size();
    }

  
    @Override
    public boolean isEmpty(){
        return list.isEmpty();
    }

    
    @Override
    public Optional<Integer> next() {
        if (index < list.size()) {
            int element = list.get(index);
            index = (index == list.size() - 1) ? 0 : index + 1;
            return Optional.of(element);
        } else {
            return Optional.empty();
        }
    }
  

    @Override
    public Optional<Integer> previous() {
        if (list.isEmpty()) {
            return Optional.empty();
        } else {
            index = (index == 0) ? list.size() - 1 : index - 1;
            int element = list.get(index);
            return Optional.of(element);
        }
    }

 /*  
    public Optional<Integer> previous(){
        if (list.isEmpty()) {
            return Optional.empty();
        }
        else {
            if (index==0){
                index= (list.size() -1);}
            else {
                index--;}
            int element=list.get(index);
            return Optional.of(list.get(element));
        }
    } */

    
    @Override
    public void reset(){
        this.index=0;
    }

    @Override
    public int getIndex() {
        return this.index;
    }
}
