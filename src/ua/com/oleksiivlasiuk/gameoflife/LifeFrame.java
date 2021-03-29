package ua.com.oleksiivlasiuk.gameoflife;

import javax.swing.JFrame;

public class LifeFrame extends JFrame {

    public LifeFrame() {

        add(new LifePanel());
        setSize(777, 800);
        setResizable(false);
        setVisible(true);
        setTitle("Conway's Game of Life");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new LifeFrame();
    }
}
