package tasks.date_20_10_2019.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StorageTest {


    @Test
    void shouldAddElement() {
        //given
        Storage storage = new Storage();
        //when
        storage.add(new SingleElement(""));
        //then
        Assertions.assertEquals(1,storage.size());
        Assertions.assertEquals(5,storage.getElements().length);
    }
 @Test
    void shouldAdd9Elements() {
        //given
        Storage storage = new Storage();
        //when
        storage.add(new SingleElement(""));
        storage.add(new SingleElement(""));
        storage.add(new SingleElement(""));
        storage.add(new SingleElement(""));
        storage.add(new SingleElement(""));
        storage.add(new SingleElement(""));
        storage.add(new SingleElement(""));
        storage.add(new SingleElement(""));
        storage.add(new SingleElement(""));

        //then
        Assertions.assertEquals(9,storage.size());
        Assertions.assertEquals(10 ,storage.getElements().length);
    }
}