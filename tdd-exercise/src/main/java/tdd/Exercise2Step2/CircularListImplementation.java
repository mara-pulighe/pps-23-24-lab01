package tdd.Exercise2Step2;

import java.util.Iterator;

public class CircularListImplementation implements CircularList {
    private int  index;

    private final tdd.Exercise2Step1.CircularListImplementation list = new tdd.Exercise2Step1.CircularListImplementation(0,null);


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
    public void reset(){
        this.index=0;
    }

    @Override
    public int getIndex() {
        return this.index;
    }

    @Override
    public Iterator<Integer> forwardIterator() {
        return new Iterator<Integer>() {

            @Override
            public boolean hasNext() {
                return !isEmpty();
            }

            @Override
            public Integer next() {
                if (hasNext()) {
                    return list.next().get();
                } else {
                    throw new IllegalStateException();
                }
            }
        };
    }
    

    @Override
    public Iterator<Integer> backwardIterator() {
        return new Iterator<Integer>() {

            @Override
            public boolean hasNext() {
                return !isEmpty();
            }

            @Override
            public Integer next() {
                if (hasNext()) {
                    return list.previous().get();
                } else {
                    throw new IllegalStateException();
                }
            }
        };
    }
}

