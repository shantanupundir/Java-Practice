import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class ApplicationForm extends JFrame {

    private static final Color BG_DARK       = new Color(10, 14, 26);
    private static final Color BG_CARD       = new Color(18, 24, 42);
    private static final Color BG_FIELD      = new Color(26, 34, 58);
    private static final Color ACCENT_GOLD   = new Color(212, 175, 55);
    private static final Color TEXT_PRIMARY  = new Color(240, 235, 220);
    private static final Color TEXT_MUTED    = new Color(140, 135, 120);
    private static final Color BORDER_COLOR  = new Color(40, 52, 80);
    private static final Color SUCCESS_GREEN = new Color(72, 199, 142);
    private static final Color ERROR_RED     = new Color(255, 90, 95);

    private static final Font FONT_LABEL  = new Font("Segoe UI", Font.BOLD, 11);
    private static final Font FONT_INPUT  = new Font("Segoe UI", Font.PLAIN, 14);
    private static final Font FONT_BUTTON = new Font("Georgia", Font.BOLD, 15);

    private JTextField tfFirstName, tfLastName, tfAge, tfEmail, tfPhone;
    private JComboBox<String> cbDay, cbMonth, cbYear;
    private JTextArea taAddress;
    private JLabel statusLabel;

    public ApplicationForm() {
        setTitle("Application Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 820);
        setLocationRelativeTo(null);
        setResizable(false);

        // Main panel
        JPanel mainPanel = new JPanel(new BorderLayout()) {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(BG_DARK);
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        mainPanel.setBorder(new EmptyBorder(30, 40, 30, 40));
        mainPanel.setBackground(BG_DARK);

        // ── Header ──
        JPanel header = new JPanel();
        header.setOpaque(false);
        header.setLayout(new BoxLayout(header, BoxLayout.Y_AXIS));
        header.setBorder(new EmptyBorder(0, 0, 20, 0));

        JLabel titleLabel = new JLabel("APPLICATION FORM", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Georgia", Font.BOLD, 28));
        titleLabel.setForeground(TEXT_PRIMARY);
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel subLabel = new JLabel("PERSONAL INFORMATION", SwingConstants.CENTER);
        subLabel.setFont(new Font("Georgia", Font.ITALIC, 13));
        subLabel.setForeground(TEXT_MUTED);
        subLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JSeparator sep1 = new JSeparator();
        sep1.setForeground(ACCENT_GOLD);
        sep1.setBackground(ACCENT_GOLD);
        sep1.setMaximumSize(new Dimension(Integer.MAX_VALUE, 2));

        JSeparator sep2 = new JSeparator();
        sep2.setForeground(ACCENT_GOLD);
        sep2.setBackground(ACCENT_GOLD);
        sep2.setMaximumSize(new Dimension(Integer.MAX_VALUE, 2));

        header.add(sep1);
        header.add(Box.createVerticalStrut(12));
        header.add(titleLabel);
        header.add(Box.createVerticalStrut(6));
        header.add(subLabel);
        header.add(Box.createVerticalStrut(12));
        header.add(sep2);

        mainPanel.add(header, BorderLayout.NORTH);

        // ── Card ──
        JPanel card = new JPanel(new GridBagLayout());
        card.setBackground(BG_CARD);
        card.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(BORDER_COLOR, 1, true),
            new EmptyBorder(28, 32, 28, 32)
        ));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 6, 8, 6);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Row 1: First Name | Last Name
        tfFirstName = styledField("e.g. John");
        tfLastName  = styledField("e.g. Doe");
        gbc.gridx = 0; gbc.gridy = 0; gbc.weightx = 0.5;
        card.add(makeGroup("FIRST NAME", tfFirstName), gbc);
        gbc.gridx = 1;
        card.add(makeGroup("LAST NAME", tfLastName), gbc);

        // Row 2: Age | DOB
        tfAge = styledField("e.g. 25");

        String[] days = new String[32];
        days[0] = "DD";
        for (int i = 1; i <= 31; i++) days[i] = String.format("%02d", i);

        String[] months = {"MM","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};

        int curYear = 2026;
        String[] years = new String[curYear - 1923];
        years[0] = "YYYY";
        for (int i = 1; i < years.length; i++) years[i] = String.valueOf(curYear - i + 1);

        cbDay   = styledCombo(days);
        cbMonth = styledCombo(months);
        cbYear  = styledCombo(years);

        JPanel dobPanel = new JPanel(new GridLayout(1, 3, 6, 0));
        dobPanel.setOpaque(false);
        dobPanel.add(cbDay);
        dobPanel.add(cbMonth);
        dobPanel.add(cbYear);

        gbc.gridx = 0; gbc.gridy = 1; gbc.weightx = 0.35;
        card.add(makeGroup("AGE", tfAge), gbc);
        gbc.gridx = 1; gbc.weightx = 0.65;
        card.add(makeGroup("DATE OF BIRTH", dobPanel), gbc);

        // Row 3: Phone | Email
        tfPhone = styledField("e.g. +91 98765 43210");
        tfEmail = styledField("e.g. john@email.com");
        gbc.gridx = 0; gbc.gridy = 2; gbc.weightx = 0.5;
        card.add(makeGroup("PHONE NUMBER", tfPhone), gbc);
        gbc.gridx = 1;
        card.add(makeGroup("EMAIL ADDRESS", tfEmail), gbc);

        // Row 4: Address (full width)
        taAddress = new JTextArea(3, 20);
        taAddress.setFont(FONT_INPUT);
        taAddress.setBackground(BG_FIELD);
        taAddress.setForeground(TEXT_MUTED);
        taAddress.setCaretColor(ACCENT_GOLD);
        taAddress.setLineWrap(true);
        taAddress.setWrapStyleWord(true);
        taAddress.setBorder(new EmptyBorder(10, 12, 10, 12));
        taAddress.setText("Street, City, State, PIN Code");
        taAddress.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                if (taAddress.getForeground().equals(TEXT_MUTED)) {
                    taAddress.setText("");
                    taAddress.setForeground(TEXT_PRIMARY);
                }
            }
            public void focusLost(FocusEvent e) {
                if (taAddress.getText().trim().isEmpty()) {
                    taAddress.setText("Street, City, State, PIN Code");
                    taAddress.setForeground(TEXT_MUTED);
                }
            }
        });

        JScrollPane addrScroll = new JScrollPane(taAddress);
        addrScroll.setBorder(BorderFactory.createLineBorder(BORDER_COLOR, 1));
        addrScroll.setBackground(BG_FIELD);

        gbc.gridx = 0; gbc.gridy = 3; gbc.gridwidth = 2; gbc.weightx = 1.0;
        card.add(makeGroup("ADDRESS", addrScroll), gbc);
        gbc.gridwidth = 1;

        // Status label
        statusLabel = new JLabel(" ", SwingConstants.CENTER);
        statusLabel.setFont(new Font("Segoe UI", Font.BOLD, 12));
        statusLabel.setForeground(SUCCESS_GREEN);
        gbc.gridx = 0; gbc.gridy = 4; gbc.gridwidth = 2;
        gbc.insets = new Insets(4, 6, 0, 6);
        card.add(statusLabel, gbc);

        // Submit button
        JButton submitBtn = new JButton("SUBMIT APPLICATION") {
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                GradientPaint gp = new GradientPaint(0, 0, new Color(212, 175, 55),
                                                     getWidth(), getHeight(), new Color(180, 140, 20));
                g2.setPaint(gp);
                g2.fillRoundRect(0, 0, getWidth(), getHeight(), 14, 14);
                super.paintComponent(g);
            }
        };
        submitBtn.setFont(FONT_BUTTON);
        submitBtn.setForeground(BG_DARK);
        submitBtn.setPreferredSize(new Dimension(300, 50));
        submitBtn.setMaximumSize(new Dimension(Integer.MAX_VALUE, 50));
        submitBtn.setContentAreaFilled(false);
        submitBtn.setBorderPainted(false);
        submitBtn.setFocusPainted(false);
        submitBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        submitBtn.addActionListener(e -> handleSubmit());

        gbc.gridx = 0; gbc.gridy = 5; gbc.gridwidth = 2;
        gbc.insets = new Insets(16, 6, 4, 6);
        card.add(submitBtn, gbc);

        mainPanel.add(card, BorderLayout.CENTER);

        // Footer
        JLabel footer = new JLabel("© 2026 Application Portal  •  All fields are required", SwingConstants.CENTER);
        footer.setFont(new Font("Segoe UI", Font.PLAIN, 10));
        footer.setForeground(TEXT_MUTED);
        footer.setBorder(new EmptyBorder(14, 0, 0, 0));
        mainPanel.add(footer, BorderLayout.SOUTH);

        setContentPane(mainPanel);
    }

    // ── Helpers ──

    private JTextField styledField(String placeholder) {
        JTextField tf = new JTextField(placeholder);
        tf.setFont(FONT_INPUT);
        tf.setBackground(BG_FIELD);
        tf.setForeground(TEXT_MUTED);
        tf.setCaretColor(ACCENT_GOLD);
        tf.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(BORDER_COLOR, 1),
            new EmptyBorder(8, 12, 8, 12)
        ));
        tf.setPreferredSize(new Dimension(200, 42));
        tf.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                if (tf.getForeground().equals(TEXT_MUTED)) {
                    tf.setText("");
                    tf.setForeground(TEXT_PRIMARY);
                    tf.setBorder(BorderFactory.createCompoundBorder(
                        BorderFactory.createLineBorder(ACCENT_GOLD, 1),
                        new EmptyBorder(8, 12, 8, 12)
                    ));
                }
            }
            public void focusLost(FocusEvent e) {
                if (tf.getText().trim().isEmpty()) {
                    tf.setText(placeholder);
                    tf.setForeground(TEXT_MUTED);
                    tf.setBorder(BorderFactory.createCompoundBorder(
                        BorderFactory.createLineBorder(BORDER_COLOR, 1),
                        new EmptyBorder(8, 12, 8, 12)
                    ));
                }
            }
        });
        return tf;
    }

    private JComboBox<String> styledCombo(String[] items) {
        JComboBox<String> cb = new JComboBox<>(items);
        cb.setFont(FONT_INPUT);
        cb.setBackground(BG_FIELD);
        cb.setForeground(TEXT_PRIMARY);
        cb.setPreferredSize(new Dimension(100, 42));
        return cb;
    }

    private JPanel makeGroup(String labelText, JComponent field) {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setOpaque(false);
        JLabel lbl = new JLabel(labelText);
        lbl.setFont(FONT_LABEL);
        lbl.setForeground(ACCENT_GOLD);
        lbl.setBorder(new EmptyBorder(0, 2, 5, 0));
        panel.add(lbl);
        panel.add(field);
        return panel;
    }

    private String getFieldValue(JTextField tf) {
        String val = tf.getText().trim();
        if (tf.getForeground().equals(TEXT_MUTED)) return "";
        return val;
    }

    // ── Submit ──

    private void handleSubmit() {
        String firstName = getFieldValue(tfFirstName);
        String lastName  = getFieldValue(tfLastName);
        String age       = getFieldValue(tfAge);
        String phone     = getFieldValue(tfPhone);
        String email     = getFieldValue(tfEmail);
        String address   = taAddress.getForeground().equals(TEXT_MUTED) ? "" : taAddress.getText().trim();
        String day   = (String) cbDay.getSelectedItem();
        String month = (String) cbMonth.getSelectedItem();
        String year  = (String) cbYear.getSelectedItem();

        // Validation
        if (firstName.isEmpty() || lastName.isEmpty() || age.isEmpty() ||
            phone.isEmpty() || email.isEmpty() || address.isEmpty() ||
            "DD".equals(day) || "MM".equals(month) || "YYYY".equals(year)) {
            showStatus("⚠  Please fill in all required fields.", ERROR_RED);
            shake(this);
            return;
        }
        if (!email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
            showStatus("⚠  Please enter a valid email address.", ERROR_RED);
            return;
        }
        if (!age.matches("\\d+") || Integer.parseInt(age) < 1 || Integer.parseInt(age) > 120) {
            showStatus("⚠  Please enter a valid age (1-120).", ERROR_RED);
            return;
        }
        if (!phone.matches("[+\\d\\s\\-()]{7,15}")) {
            showStatus("⚠  Please enter a valid phone number.", ERROR_RED);
            return;
        }

        String dob = day + " " + month + " " + year;
        String summary = String.format(
            "<html><body style='font-family:Segoe UI; padding:12px;'>" +
            "<h2 style='color:#D4AF37;'>Application Submitted!</h2>" +
            "<table>" +
            "<tr><td><b>Name:</b></td><td>%s %s</td></tr>" +
            "<tr><td><b>Age:</b></td><td>%s years</td></tr>" +
            "<tr><td><b>DOB:</b></td><td>%s</td></tr>" +
            "<tr><td><b>Phone:</b></td><td>%s</td></tr>" +
            "<tr><td><b>Email:</b></td><td>%s</td></tr>" +
            "<tr><td valign='top'><b>Address:</b></td><td>%s</td></tr>" +
            "</table></body></html>",
            firstName, lastName, age, dob, phone, email, address.replace("\n", "<br>")
        );

        JEditorPane ep = new JEditorPane("text/html", summary);
        ep.setEditable(false);
        ep.setPreferredSize(new Dimension(400, 260));
        JOptionPane.showMessageDialog(this, ep, "Success", JOptionPane.PLAIN_MESSAGE);
        showStatus("✔  Application submitted successfully!", SUCCESS_GREEN);
    }

    private void showStatus(String msg, Color color) {
        statusLabel.setText(msg);
        statusLabel.setForeground(color);
    }

    private void shake(JFrame frame) {
        Point orig = frame.getLocation();
        int[] steps = {-8, 8, -6, 6, -4, 4, -2, 2, 0};
        int[] idx = {0};
        Timer t = new Timer(30, null);
        t.addActionListener(e -> {
            if (idx[0] >= steps.length) { t.stop(); frame.setLocation(orig); return; }
            frame.setLocation(orig.x + steps[idx[0]++], orig.y);
        });
        t.start();
    }

    // ── Main ──

    public static void main(String[] args) {
        try { UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); }
        catch (Exception ignored) {}
        SwingUtilities.invokeLater(() -> new ApplicationForm().setVisible(true));
    }
}
