package main;
import java.awt.*;
import java.awt.event.*;
import Start.*;
import Game.*;
import Clear.*;
import Over.*;
import javax.swing.*;

/**
 * Created by 佑貴 on 2016/11/13.
 */
public class MainPanel extends JPanel {
    // パネルサイズ
    private static final int WIDTH = 240;
    private static final int HEIGHT = 240;

    public MainPanel() {
        // パネルの推奨サイズを設定、pack()するときに必要
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // 変数などの初期化
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // 盤面を描いたり、フィールドを描いたりする
    }
}