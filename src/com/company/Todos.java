package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Todos extends JPanel {
    JLabel title;
    ArrayList<Todo> my_todos;

    Todos() {
        init();
        buildUI();
    }

    void init() {
        my_todos = new ArrayList<Todo>();
        setPreferredSize(new Dimension(450, 400));
        setLayout(new FlowLayout(FlowLayout.LEFT));
    }

    void buildUI() {
        title = new JLabel("Todos:");
        add(title);
    }

    public void addTodo(String todo_name) {
        Todo newTodo = new Todo(this);
        newTodo.buildUI(todo_name);

        my_todos.add(newTodo);
        add(newTodo);
    }
}
