package views;

import data.entities.Loading;
import data.entities.Operation;
import data.entities.Ship;
import java.util.ArrayList;
import java.util.Objects;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Jhonathan & Kaue
 */
public class ShipRegistration extends javax.swing.JFrame {

    private ArrayList<Ship> loadShips = new ArrayList<>();
    private ArrayList<Ship> unloadShips = new ArrayList<>();
    private ShipTableModel loadTableModel;
    private ShipTableModel unloadTableModel;

    /**
     * Creates new form ShipRegistration
     */
    public ShipRegistration() {
        initComponents();
        initData();
    }

    private void initData() {
        this.loadTableModel = new ShipTableModel(loadShips);
        this.unloadTableModel = new ShipTableModel(unloadShips);
        this.jTableLoading.setModel(loadTableModel);
        this.jTableUnloading.setModel(unloadTableModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        jScrollPaneLoading = new javax.swing.JScrollPane();
        jTableLoading = new javax.swing.JTable();
        jScrollPaneUnloading = new javax.swing.JScrollPane();
        jTableUnloading = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de navios");
        setResizable(false);

        jTableLoading.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPaneLoading.setViewportView(jTableLoading);

        jTableUnloading.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPaneUnloading.setViewportView(jTableUnloading);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Carga");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Descarga");

        jButton1.setText("Adicionar Navio ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 255, 204));
        jButton2.setText("Iniciar Operação");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(151, 151, 151))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jScrollPaneLoading, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(jScrollPaneUnloading, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPaneLoading)
                    .addComponent(jScrollPaneUnloading))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        NewShip newShip = new NewShip(this, true);
        newShip.setLocationRelativeTo(null);
        newShip.setVisible(true);

        if (newShip.confirmado) {
            if (newShip.newShip.getOperation() instanceof Loading) {
                this.loadShips.add(newShip.newShip);
                this.loadTableModel.ships = this.loadShips;
                this.loadTableModel.fireTableDataChanged();

            } else {
                this.unloadShips.add(newShip.newShip);
                this.unloadTableModel.ships = this.unloadShips;
                this.unloadTableModel.fireTableDataChanged();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ArrayList<Ship> allShips = new ArrayList<>();
        allShips.addAll(this.loadShips);
        allShips.addAll(this.unloadShips);

        Harbor harbor = new Harbor(allShips);
        harbor.setLocationRelativeTo(null);
        harbor.setVisible(true);
        harbor.start();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JScrollPane jScrollPaneLoading;
    private javax.swing.JScrollPane jScrollPaneUnloading;
    private javax.swing.JTable jTableLoading;
    private javax.swing.JTable jTableUnloading;
    // End of variables declaration//GEN-END:variables

    private class ShipTableModel extends AbstractTableModel {

        private ArrayList<Ship> ships;
        private String[] columns;

        public ShipTableModel(ArrayList<Ship> ships) {
            super();
            this.ships = ships;
            columns = new String[]{"Nome", "Tipo de mercadoria"};
        }

        public int getColumnCount() {
            return columns.length;
        }

        public int getRowCount() {
            return ships.size();
        }

        public Object getValueAt(int row, int col) {
            try {
                Ship ship = this.ships.get(row);
                switch (col) {
                    case 0:
                        return ship.getName();

                    case 1:
                        if (Objects.equals(ship.getOperation().getType(), Operation.NORMAL)) {
                            return "Normal";
                        } else {
                            return "Perecivel";
                        }
                    default:
                        return null;
                }
            } catch (Exception e) {
                return "Erro";
            }
        }

        public String getColumnName(int col) {
            return columns[col];
        }

    }
}
