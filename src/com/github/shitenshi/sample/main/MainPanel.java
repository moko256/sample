package com.github.shitenshi.sample.main;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.text.TextAction;

/**
 * Created by 佑貴 on 2016/11/13.
 */
public class MainPanel extends JPanel {
    // パネルサイズ
    private static final int WIDTH = 640;
    private static final int HEIGHT = 360;

    public MainPanel() {
        // パネルの推奨サイズを設定、pack()するときに必要
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // 変数などの初期化

        //表示テスト
        setBackground(Color.gray);
        JLabel text = new JLabel("Hello,World!");
        add(text);
        JPopupMenu menu = new JPopupMenu();
        menu.add("Apple");
        menu.add("Banana");
        menu.add("Cookie");
        menu.add("Damage");
        menu.add(new TextAction("Exit") {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        setComponentPopupMenu(menu);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // 盤面を描いたり、フィールドを描いたりする
    }
}