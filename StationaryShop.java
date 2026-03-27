import java.awt.*;
import java.awt.event.*;

public class StationaryShop extends Frame implements ItemListener {

    Choice items;
    Label priceLabel;

    StationaryShop() {

        // Frame settings
        setTitle("Stationary Shop");
        setSize(300, 200);
        setLayout(null);

        // Label
        Label l1 = new Label("Select Item:");
        l1.setBounds(50, 60, 80, 20);
        add(l1);

        // Choice (Dropdown list)
        items = new Choice();
        items.add("Pen");
        items.add("Pencil");
        items.add("Notebook");
        items.add("Eraser");

        items.setBounds(140, 60, 100, 20);
        add(items);

        // Price label
        priceLabel = new Label("Price: ");
        priceLabel.setBounds(50, 100, 200, 20);
        add(priceLabel);

        // Register event
        items.addItemListener(this);

        // Window close event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    // Event handling for Choice
    public void itemStateChanged(ItemEvent e) {

        String item = items.getSelectedItem();

        if (item.equals("Pen"))
            priceLabel.setText("Price: Rs.10");

        else if (item.equals("Pencil"))
            priceLabel.setText("Price: Rs.5");

        else if (item.equals("Notebook"))
            priceLabel.setText("Price: Rs.50");

        else if (item.equals("Eraser"))
            priceLabel.setText("Price: Rs.3");
    }

    public static void main(String[] args) {
        new StationaryShop();
    }
}
