package com.github.shitenshi.sample;

import com.github.shitenshi.sample.main.MainPanel;
import com.github.shitenshi.sample.start.StartPanel;

import javax.swing.*;

/**
 * Created by 佑貴 on 2016/11/13.
 */

public class Game {

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                final JFrame frame=new JFrame("MSC Game No.1");
                final StartPanel startPanel=new StartPanel();
                startPanel.setOnCharacterSelected(new StartPanel.OnCharacterSelected() {
                    @Override
                    public void onCharacterSelected(String me) {
                        frame.getContentPane().remove(startPanel);
                        frame.getContentPane().add(new MainPanel(me));
                        frame.validate();
                    }
                });
                frame.getContentPane().add(startPanel);
                frame.pack();
                frame.setVisible(true);
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            }
        });
    }

}