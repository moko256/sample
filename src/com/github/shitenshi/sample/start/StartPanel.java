package com.github.shitenshi.sample.start;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by 佑貴 on 2016/11/13.
 */
public class StartPanel extends JPanel {
    // パネルサイズ
    private static final int WIDTH = 800;
    private static final int HEIGHT = 450;

    private OnCharacterSelected action;

    public StartPanel() {
        setLayout(null);
        // パネルの推奨サイズを設定、pack()するときに必要
        setPreferredSize(new Dimension(WIDTH, HEIGHT));

        // 変数などの初期化
        final String[] characters=new String[]{//適切なクラスが実装されたら置き換えます
                "Maki",
                "Yukari",
                "Aoi",
                "Akane"
        };

        for (int i = 0; i < characters.length; i++) {
            final String charName = characters[i];

            BufferedImage image=null;
            try {
                image=ImageIO.read(ClassLoader.getSystemResource("./res/png/girl.png"));
            } catch (IOException e) {
                e.printStackTrace();
                System.exit(1);
            }

            JButton button = new JButton(charName,new ImageIcon(image));
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (action != null) {
                        action.onCharacterSelected(charName);
                    }
                }
            });
            button.setBounds(i*WIDTH / characters.length, 0, WIDTH / characters.length, HEIGHT);
            button.setBackground(Color.WHITE);
            button.setVerticalTextPosition(SwingConstants.BOTTOM);
            button.setHorizontalTextPosition(SwingConstants.CENTER);
            button.setIconTextGap(20);
            button.invalidate();
            add(button);

        }

    }

    public interface OnCharacterSelected{
        void onCharacterSelected(String me);//適切なクラスが実装されたらStringから置き換えます
    }

    public void setOnCharacterSelected(OnCharacterSelected l){
        action = l;
    }
}
