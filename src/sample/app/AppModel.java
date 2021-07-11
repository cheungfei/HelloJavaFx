package sample.app;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-07-11 9:19
 */
public class AppModel {
    private final StringProperty text = new SimpleStringProperty();

    public StringProperty textProperty() {
        return text;
    }

    public String getText() {
        return text.get();
    }

    public void setText(String text) {
        this.text.set(text);
    }
}
