package com.example.design.mode.behavior;

import com.example.design.mode.behavior.memento.Document;
import com.example.design.mode.behavior.memento.History;
import org.junit.Test;

/**
 * 备忘录模式
 */
public class MementoTest {

    @Test
    public void test() {
        History history = new History();

        Document document = new Document();

        document.change("abc");
        history.add(document.save());

        document.change("def");
        history.add(document.save());

        document.change("ccc");
        document.resume(history.getLastVersion());
        document.print();

        document.resume(history.getLastVersion());
        document.print();
    }

}
