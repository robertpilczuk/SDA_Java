package tasks.date_20_10_2019.task3;

public class Storage {

    private SingleElement[] elements;

    public Storage() {
        this.elements = new SingleElement[5];

    }

    public SingleElement[] getElements() {
        return elements;
    }

    public void add(SingleElement element) {
        if (size()==elements.length){
            createNewTable();
        }
        int i = 0;
        do {
            if (elements[i] == null) {
                elements[i] = element;
                i=elements.length+1;
            }else {
                i++;
            }
        } while (i < elements.length);


    }

    public int size(){
        int size = 0;
        for (SingleElement e: elements){
            if (e!= null){
                size++;
            }
        }
        return size;
    }


    private void createNewTable(){
        if (size()== elements.length){
            SingleElement[] temp = new SingleElement[elements.length+5];
            for (int i = 0; i < elements.length; i++) {
                temp[i] = elements[i];
            }
            elements = temp;
        }
    }
}
