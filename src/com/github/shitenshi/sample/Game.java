package com.github.shitenshi.sample;

import com.github.shitenshi.sample.main.MainPanel;
import javafx.application.Application;
import javafx.stage.Stage;

import javax.swing.*;

/**
 * Created by 佑貴 on 2016/11/13.
 */

public class Game {

    public static void main(String[] args){
        MainPanel mainPanel=new MainPanel();

        JFrame frame=new JFrame("MSC Game No.1");
        frame.getContentPane().add(mainPanel);
        frame.pack();
        frame.setVisible(true);
    }
}
