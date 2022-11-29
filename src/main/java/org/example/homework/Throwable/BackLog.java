package org.example.homework.Throwable;

import java.util.List;

public class BackLog implements AutoCloseable {
    private static final List<Task> backLogTask = null;

    public List<Task> getBackLogTask() {
        return backLogTask;
    }

    @Override
    public void close() throws Exception {

    }


}
