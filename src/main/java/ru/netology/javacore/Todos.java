package ru.netology.javacore;

import java.util.*;
import java.util.stream.Collectors;

public class Todos {
    private List<String> taskList = new ArrayList<>();

    public void addTask(String task) {
        taskList.add(task);
    }

    public void removeTask(String task) {
        taskList.remove(task);

    }

    public String getAllTasks() {
        return taskList.stream().sorted().collect(Collectors.joining(" "));
    }

}