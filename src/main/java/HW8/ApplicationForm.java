package HW8;

import HW8.components.NumberJButton;
import HW8.components.OperatorJButton;
import HW8.listeners.ButtonListener;
import HW8.listeners.ClearButtonActionListener;
import HW8.listeners.ExitButtonListener;
import HW8.listeners.TestButtonListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ApplicationForm extends JFrame {

    private JTextField inputField;


    public ApplicationForm(String title) throws HeadlessException {
        super(title);
        setBounds(200, 200, 310, 370);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        //    TestButton();

        setJMenuBar(createMenu());

        setLayout(new BorderLayout());
        add(createTopPanel(), BorderLayout.NORTH);
        add(createCenterPanel(), BorderLayout.CENTER);


        setVisible(true);
    }

    private JMenuBar createMenu() {
        JMenuBar menuBar = new JMenuBar();

        JMenu menuFile = new JMenu("File");

        menuBar.add(menuFile);
        //menuBar.add(new JMenuItem("About"));
        // menuBar.add(new JMenuItem("Help"));

        menuFile.add(new JMenuItem("Clear"));
        JMenuItem exitItem = menuFile.add(new JMenuItem("Exit"));
        menuBar.add(exitItem);

      /*  exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });*/
        exitItem.addActionListener(new ExitButtonListener());

        return menuBar;
    }

    private JPanel createTopPanel() {
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());

        inputField = new JTextField();
        inputField.setEditable(false);
        top.add(inputField);
        inputField.setFont(new Font("TimesRoman", Font.PLAIN, 25));
        inputField.setMargin(new Insets(9, 5, 9, 0));
        inputField.setBackground(new Color(154, 152, 161));

        inputField.setText("(1 + 5) * 2 = 12");


        return top;
    }

    private JPanel createCenterPanel() {
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout());

        ActionListener buttonListener = new ButtonListener(inputField);

        centerPanel.add(createDigitsPanel(buttonListener), BorderLayout.CENTER);
        centerPanel.add(createOperatorsPanel(buttonListener), BorderLayout.WEST);


        return centerPanel;
    }

    private JPanel createOperatorsPanel(ActionListener buttonListener) {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        JButton minus = new OperatorJButton("-");
        minus.addActionListener(buttonListener);
        panel.add(minus);


        JButton plus = new OperatorJButton("+");
        plus.addActionListener(buttonListener);
        panel.add(plus);

        JButton multiply = new OperatorJButton("x");
        multiply.addActionListener(buttonListener);
        panel.add(multiply);

        JButton divide = new OperatorJButton("/");
        divide.addActionListener(buttonListener);
        panel.add(divide);

        JButton leftBracket = new OperatorJButton("(");
        leftBracket.addActionListener(buttonListener);
        panel.add(leftBracket);

        JButton rightBracket = new OperatorJButton(")");
        rightBracket.addActionListener(buttonListener);
        panel.add(rightBracket);

        JButton clearOne = new OperatorJButton("<");
        clearOne.addActionListener(e -> {
            String str = inputField.getText();
            if (str.length() == 0) {
                return;
            }
            inputField.setText(str.substring(0, str.length() - 1));
        });
        panel.add(clearOne);

        JButton degree = new OperatorJButton("^");
        degree.addActionListener(buttonListener);
        panel.add(degree);

        return panel;
    }

    private JPanel createDigitsPanel(ActionListener buttonListener) {
        JPanel digitsPanel = new JPanel();

        digitsPanel.setLayout(new GridLayout(4, 3));

        for (int i = 0; i < 10; i++) {

            String buttonTitle = (i == 9) ? "0" : String.valueOf(i + 1);
            JButton btn = new NumberJButton(buttonTitle);
            btn.addActionListener(buttonListener);
            digitsPanel.add(btn);
        }

        JButton calc = new OperatorJButton("=");
        digitsPanel.add(calc);
        calc.setEnabled(true);


        JButton clear = new OperatorJButton("C");
        digitsPanel.add(clear);
        clear.addActionListener(new ClearButtonActionListener(inputField));
        return digitsPanel;
    }

    private void TestButton() {
        Button button = new Button("Кнопка");
        button.addActionListener(new TestButtonListener());
        button.addActionListener(e -> System.out.println("Событие через лямбду"));

        super.add(button);
    }


}
