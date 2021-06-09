package Array;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TabelTabel {
    private JTextField textData;
    private JPanel rootPanel;
    private JButton simpanButton;
    private JTable tableHasil;
    private JTextField textJumlah;
    private DefaultTableModel tableModel;



    public JPanel getRootPanel() {
        return rootPanel;
    }

    public TabelTabel() {
        this.initComponent();
        simpanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model = (DefaultTableModel) tableHasil.getModel();

                String data = textData.getText();
                if (data.isBlank()) {
                    JOptionPane.showMessageDialog(rootPanel,
                            "Data belum lengkap",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                    return;

                }

                int a = Integer.parseInt(textJumlah.getText());
                String[] tmp = data.split(",");

                for (int i = 0; i < a; i++) {
                    model.addRow(new Object[]{});
                }
                int aa = 0;
                for (int i : Sorting.getHasilAscending(data, a)) {
                    model.setValueAt(i, aa, 0);
                    aa++;
                }
                int bb = 0;
                for (int i : Sorting.getHasilDescending(data, a)) {
                    model.setValueAt(i, bb, 1);
                    bb++;
                }

            }
        });
    }
    private void initComponent(){
        Object[] tableColom = {
                "Ascending","Descending"
        };
        Object[][] iniData = {

        };
        tableModel = new DefaultTableModel(iniData,tableColom);
        //set tabel model
        tableHasil.setModel(tableModel);
        //Menampilkan sorting
        tableHasil.setAutoCreateRowSorter(true);
        //Enable single selection
        tableHasil.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    }
}
