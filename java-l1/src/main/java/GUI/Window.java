package GUI;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.*;

public class Window extends JFrame {
    static final int size = 5;
    static int cnt=0;
    static  boolean b=false;
    private static final ImageIcon ICON_X = new ImageIcon("java-l1/x.png");
    private static final ImageIcon ICON_O = new ImageIcon("java-l1/o.png");
    private static final ImageIcon ICON_DEFAULT = new ImageIcon("java-l1/def.png");
    static JButton [][] buttons = new JButton[size][size];

    public Window() throws HeadlessException {
        cnt=0;
        setSize(500, 500);
        setLocation(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("FILE");
        JMenuItem item1 = new JMenuItem("open");
        JMenuItem item3 = new JMenuItem("exit");
        item3.addActionListener(e -> dispose());
        item1.addActionListener(e -> {
            new Window();
            dispose();
        });
        file.add(item1);
        file.add(item3);
        menuBar.add(file);
        add(menuBar);
        JPanel panel = new JPanel(new BorderLayout());
        JLabel label = new JLabel("");
        JPanel fp = new JPanel(new GridLayout(size,size));

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].setIcon(ICON_DEFAULT);

                buttons[i][j].setDisabledIcon(ICON_DEFAULT);

                final int finalI = i;
                final int finalJ = j;
                buttons[i][j].addActionListener(e -> {
                    setTrue();
                    cntPlus();
                    System.out.println(finalI + " " + finalJ);
                    buttons[finalI][finalJ].setIcon(ICON_X);

                    buttons[finalI][finalJ].setEnabled(false);
                    buttons[finalI][finalJ].setDisabledIcon(ICON_X);
                    chek(buttons);
                    if (b){
                        moveAI(buttons);
                        cntPlus();
                        chek(buttons);
                    }
                });
                fp.add(buttons[i][j]);
            }
        }

        panel.add(menuBar, BorderLayout.NORTH);
        panel.add(label, BorderLayout.SOUTH);
        panel.add(fp, BorderLayout.CENTER);
        add(panel);
        panel.setVisible(true);
        setResizable(false);
        setVisible(true);
    }

    private void setTrue() {
        b=true;
    }

    private void chek(JButton[][] buttons) {
        if (cnt == 25) {
            JOptionPane.showMessageDialog(this, "Ничья", "Message header", JOptionPane.DEFAULT_OPTION);
            b=false;
            new Window();
            dispose();
            //break;
        }
        else if (cnt == 7) {
            if (chekWi(ICON_X,buttons)) {
                JOptionPane.showMessageDialog(this, "Вы победили", "Message header", JOptionPane.DEFAULT_OPTION);
                b=false;
                new Window();
                dispose();
                //break;
            }
        }
        else if (cnt >= 8) {
            if (chekWi(ICON_X,buttons)) {
                b=false;
                JOptionPane.showMessageDialog(this, "Вы победили", "Message header", JOptionPane.DEFAULT_OPTION);
                new Window();
                dispose();
            }
            else if (chekWi(ICON_O,buttons)) {
                b=true;
                JOptionPane.showMessageDialog(this, "Вы проиграли", "Message header", JOptionPane.DEFAULT_OPTION);
                new Window();
                dispose();
            }
        }
    }

    void cntPlus(){
        cnt++;
    }
    static boolean chekWin(char sym) {return true;}
    static boolean chekWi(ImageIcon ic, JButton[][] buttons) {
        boolean vert = false, horiz = false, diag = false, diagP = false;
        int vertC = 0, horizC = 0, diagC = 0, diagPC = 0;
        for (int i = 0; i < size; i++) {
            vert = false;
            horiz = false;
            vertC = 0;
            horizC = 0;
            for (int j = 0; j < size; j++) {
                final int xF=i, yF=j;
                if (vertC == 4 || horizC == 4 || diagC == 4 || diagPC == 4) {
                    break;
                }
                if (buttons[xF][yF].getIcon() == ic) {
                    horiz = true;
                    horizC++;
                }
                if (buttons[yF][xF].getIcon() == ic) {
                    vert = true;
                    vertC++;
                }
                if (i == j) {
                    if (buttons[xF][yF].getIcon() == ic) {
                        diag = true;
                        diagC++;
                    }
                }
                if (i == size - 1 - j) {
                    if (buttons[xF][yF].getIcon() == ic) {
                        diagP = true;
                        diagPC++;
                    }
                }

                if (buttons[xF][yF].getIcon() != ic) {
                    horiz = false;
                    horizC = 0;
                }
                if (buttons[yF][xF].getIcon() != ic) {
                    vert = false;
                    vertC = 0;
                }
                if (i == j) {
                    if (buttons[xF][yF].getIcon() != ic) {
                        diag = false;
                        diagC = 0;
                    }
                }
                if (i == size - 1 - j) {
                    if (buttons[xF][yF].getIcon() != ic) {
                        diagP = false;
                        diagPC = 0;
                    }
                }

            }
            if ((vert && vertC == 4) || (horiz && horizC == 4) || (diag && diagC == 4) || (diagP && diagPC == 4)) {
                return true;
            }
        }
        return false;
    }



    public  void moveAI(JButton[][] buttons) {
        int x, y;
        boolean flag = false;
        do {
            x = (int) (1 + Math.random() * 5);
            y = (int) (1 + Math.random() * 5);
        } while (!isCellValid(x, y, buttons));
        final int xF=x-1, yF=y-1;
        buttons[xF][yF].setIcon(ICON_O);

        buttons[xF][yF].setEnabled(false);
        buttons[xF][yF].setDisabledIcon(ICON_O);


    }
    boolean isCellValid(int x, int y, JButton[][] buttons){
        final int xF=x-1, yF=y-1;
        boolean isInF = x > 0 && x <= size && y > 0 && y <= size;
        return isInF && buttons[xF][yF].getIcon() == ICON_DEFAULT;

    }

    public static void main(String[] args) {
        new Window();
    }
}
