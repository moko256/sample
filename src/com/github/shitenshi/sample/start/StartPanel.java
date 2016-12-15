package com.github.shitenshi.sample.start;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by 佑貴 on 2016/11/13.
 */
public class StartPanel extends JPanel {
    // パネルサイズ
    private static final int WIDTH = 640;
    private static final int HEIGHT = 360;

    private OnCharacterSelected action;

    public StartPanel() {
        setLayout(new BoxLayout(this,BoxLayout.X_AXIS));
        // パネルの推奨サイズを設定、pack()するときに必要
        setPreferredSize(new Dimension(WIDTH, HEIGHT));

        // 変数などの初期化
        final String[] characters=new String[]{//適切なクラスが実装されたら置き換えます
                "Maki",
                "Yukari",
                "Aoi",
                "Akane"
        };

        for (final String charName : characters) {

            JButton button = new JButton(charName);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (action != null) {
                        action.onCharacterSelected(charName);
                    }
                }
            });
            button.setSize(WIDTH / characters.length, HEIGHT / characters.length);
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
