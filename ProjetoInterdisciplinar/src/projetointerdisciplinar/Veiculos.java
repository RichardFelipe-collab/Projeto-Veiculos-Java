/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetointerdisciplinar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Richa
 */
public class Veiculos extends javax.swing.JFrame {
 String gta;
    /**
     * Creates new form Veiculos
     */
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jTextField8 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(220, 10, 100, 30);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTextArea1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 260, 260, 110);

        jLabel1.setText("Placa:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 20, 50, 14);

        jLabel2.setText("Selecione uma Marca:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(330, 50, 130, 14);

        jLabel3.setText("Ano:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(340, 20, 50, 14);

        jLabel4.setText("Preço:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 10, 50, 14);

        jLabel5.setText("Estados:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 70, 50, 14);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(390, 10, 100, 30);

        jLabel7.setText("Selecione Um modelo:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(330, 150, 140, 14);

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(300, 260, 90, 23);

        jButton2.setText("Alterar(Digite Placa Existente)");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(300, 300, 190, 23);

        jButton3.setText("Excluir(Digite Placa Existente");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(300, 340, 180, 23);

        jList1.setModel(new DefaultListModel());
        jList1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jList1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(330, 70, 220, 77);

        jList2.setModel(new DefaultListModel());
        jScrollPane3.setViewportView(jList2);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(330, 170, 220, 77);

        jList3.setModel(new DefaultListModel());
        jList3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jList3AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane4.setViewportView(jList3);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(70, 70, 180, 77);

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField8);
        jTextField8.setBounds(50, 10, 100, 30);

        jLabel8.setText("Lojas:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 160, 50, 14);

        jList4.setModel(new DefaultListModel());
        jScrollPane5.setViewportView(jList4);

        getContentPane().add(jScrollPane5);
        jScrollPane5.setBounds(70, 160, 180, 77);

        jButton4.setText("Sair");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(300, 380, 73, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private Connection con = null;
    private Statement stm = null;
    private ResultSet rs = null;
     private String placa, marca, modelo,Estado,Loja;
    private String Ano;
    private String date;
    private float preco;

   public Veiculos() {
        initComponents();
   
        
        abrirConexao();
        carregaJLIstMarca();
        carregaJlistEstado();
        carregaJlistLoja();
        fecharObjetos();
    }

    public void carregarDriverMySQL() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception exdr) {
            JOptionPane.showMessageDialog(this, "Erro carregando o driver do MySQL. \nPor favor, adicione a biblioteca no projeto (Driver JDBC do MySQL).",
                    "Erro carregamento do driver", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public boolean abrirConexao() {
        try {
            String url = "jdbc:mysql://localhost/projeto" + "?useLegacyDatetimeCode=false&serverTimezone=America/Sao_Paulo";
            con = DriverManager.getConnection(url, "root", "");
        } catch (Exception exdr) {
            JOptionPane.showMessageDialog(this, "Erro abrindo a conexão com o BD MySQL. \nPor favor, importe o banco de dados MySQL (com o SQLyog, por exemplo). Verifique login/senha, nome do BD etc.",
                    "Erro preparando a conexão com o BD", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        return true;
    }

    public void fecharObjetos() {
        try {
            if (rs != null) {
                rs.close();
                rs = null;
            }
            if (stm != null) {
                stm.close();
                stm = null;
            }
            if (con != null) {
                con.close();
                con = null;
            }
        } catch (Exception exfech) {
        }
    }

    private void carregaJLIstMarca() {
        if (!abrirConexao()) {
            fecharObjetos();
            return;
        }
        PreparedStatement pstm = null;
        String sql = "SELECT nomemarca FROM marcas";
       
        
        try {
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                String pais = rs.getString("nomemarca");
                DefaultListModel modelo = (DefaultListModel) (jList1.getModel());
                modelo.addElement(pais);
            }
        } catch (Exception exquery) {
            JOptionPane.showMessageDialog(this, "Erro executando o processamento do BD MySQL. \nPor favor, verifique a sintaxe dos comandos.\n"+ exquery.toString(),
                    "Erro processando os dados do BD", JOptionPane.INFORMATION_MESSAGE);
        }
        fecharObjetos();
    }
    
    private void carregaJlistEstado(){
         if (!abrirConexao()) {
            fecharObjetos();
            return;
        }
        PreparedStatement pstm = null;
        String sql = "SELECT nomeestado FROM estado";
       
        
        try {
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                String pais = rs.getString("nomeestado");
                DefaultListModel modelo = (DefaultListModel) (jList3.getModel());
                modelo.addElement(pais);
            }
        } catch (Exception exquery) {
            JOptionPane.showMessageDialog(this, "Erro executando o processamento do BD MySQL. \nPor favor, verifique a sintaxe dos comandos.\n"+ exquery.toString(),
                    "Erro processando os dados do BD", JOptionPane.INFORMATION_MESSAGE);
        }
        fecharObjetos();
    }
    
    private void carregaJlistLoja(){
         if (!abrirConexao()) {
            fecharObjetos();
            return;
        }
        PreparedStatement pstm = null;
        String sql = "SELECT idloja, nomeloja FROM loja";
       
        
        try {
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                String pais = rs.getString("nomeloja");
                DefaultListModel modelo = (DefaultListModel) (jList4.getModel());
                modelo.addElement(pais);
            }
        } catch (Exception exquery) {
            JOptionPane.showMessageDialog(this, "Erro executando o processamento do BD MySQL. \nPor favor, verifique a sintaxe dos comandos.\n"+ exquery.toString(),
                    "Erro processando os dados do BD", JOptionPane.INFORMATION_MESSAGE);
        }
        fecharObjetos();
    }
   
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
       
       
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextArea1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTextArea1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1AncestorAdded

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked

       
        if (!abrirConexao()) {
            fecharObjetos();
            return;
        }
         
         PreparedStatement pstO = null;
         String lis = jList1.getSelectedValue();
        String sqO = "SELECT nomemodelo FROM modelos WHERE nomemarca = '"+lis+"'";
        if(jList1.getSelectedValue().equals(lis)){
            DefaultListModel list = (DefaultListModel) (jList2.getModel());
              list.clear();
       try {
            pstO= con.prepareStatement(sqO);
            rs = pstO.executeQuery();
            while (rs.next()) {
               String model = rs.getString("nomemodelo");
                DefaultListModel modelo = (DefaultListModel) (jList2.getModel());
                
                modelo.addElement(model);
                }
        } catch (Exception exquery) {
            JOptionPane.showMessageDialog(this, "Erro executando o processamento do BD MySQL. \nPor favor, verifique a sintaxe dos comandos.\n"+ exquery.toString(),
                    "Erro processando os dados do BD", JOptionPane.INFORMATION_MESSAGE);
        }
        fecharObjetos();
        } 

    }//GEN-LAST:event_jList1MouseClicked

    private void jList1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jList1AncestorAdded
         
    }//GEN-LAST:event_jList1AncestorAdded

    private void jList3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jList3AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jList3AncestorAdded

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Botão Cadastrar disciplina:
        Connection con = null;
        Statement pstm = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");  
            String url = "jdbc:mysql://localhost/projeto" + "?useLegacyDatetimeCode=false&serverTimezone=America/Sao_Paulo"; 
            con = DriverManager.getConnection(url,"root", ""); 
            pstm = con.createStatement();
            placa = jTextField1.getText();
            Ano = jTextField3.getText();
            preco = Float.parseFloat(jTextField8.getText());
            marca = jList1.getSelectedValue();
            modelo = jList2.getSelectedValue();
            Estado = jList3.getSelectedValue();
            Loja = jList4.getSelectedValue();
            String query = "INSERT INTO veiculos (modelo, marca, placa, ano, preco, estado, loja) VALUES ('"+modelo+"','"+marca+"','"+placa+"','"
                    +Ano+"','"+preco+"','"+Estado+"','"+Loja+"')";
                    
            pstm = con.prepareStatement(query);
            
            int res = pstm.executeUpdate(query);     
            if(res > 0)jTextArea1.setText("Veiculo Inserido Com Sucesso"); else jLabel3.setText("O Veiculo não foi inserido"); 
        }
        catch (Exception e1) {
            jTextArea1.setText("Erro inserindo na tabela 'veiculos': " + e1.getMessage());
        }
        finally {
            try {         
              if(pstm!=null){pstm.close(); pstm=null;}
              if(con!=null){con.close(); con=null;}
            }
            catch (Exception e2) {}
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         Connection con = null;
        
        Statement pstm = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");  
            String url = "jdbc:mysql://localhost/projeto" + "?useLegacyDatetimeCode=false&serverTimezone=America/Sao_Paulo"; 
            con = DriverManager.getConnection(url,"root", ""); 
            pstm = con.createStatement();
            placa = jTextField1.getText();
            Ano = jTextField3.getText();
            preco = Float.parseFloat(jTextField8.getText());
            marca = jList1.getSelectedValue();
            modelo = jList2.getSelectedValue();
            Estado = jList3.getSelectedValue();  
            Loja = jList4.getSelectedValue();
            String query = "UPDATE veiculos SET modelo = '"+modelo+"', marca = '"+marca+"', placa= '"+placa+"', ano = '"+Ano+"', preco ='"+preco+"', estado = '"+Estado+"', loja = '"+Loja+"' WHERE placa = '"+placa+"'";
                    
            pstm = con.prepareStatement(query);
            
            int res = pstm.executeUpdate(query);     
            if(res > 0)jTextArea1.setText("Veiculos Alterado com sucesso"); else jTextArea1.setText("O Veiculo não foi inserido"); 
        }
        catch (Exception e1) {
            jTextArea1.setText("Erro inserindo na tabela 'veiculos': " + e1.getMessage());
        }
        finally {
            try {         
              if(pstm!=null){pstm.close(); pstm=null;}
              if(con!=null){con.close(); con=null;}
            }
            catch (Exception e2) {}
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
       Statement pstm = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");  
            String url = "jdbc:mysql://localhost/projeto" + "?useLegacyDatetimeCode=false&serverTimezone=America/Sao_Paulo"; 
            con = DriverManager.getConnection(url,"root", ""); 
            pstm = con.createStatement();
            placa = jTextField1.getText();
           
            String query = "DELETE FROM veiculos WHERE placa = '"+placa+"'";
                    
            pstm = con.prepareStatement(query);
            
            int res = pstm.executeUpdate(query);     
            if(res > 0)jTextArea1.setText("Veiculo Deletado Com Sucesso"); else jTextArea1.setText("O Veiculo não foi inserido"); 
        }
        catch (Exception e1) {
            jTextArea1.setText("Erro inserindo na tabela 'veiculos': " + e1.getMessage());
        }
        finally {
            try {         
              if(pstm!=null){pstm.close(); pstm=null;}
              if(con!=null){con.close(); con=null;}
            }
            catch (Exception e2) {}
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      
        if(javax.swing.JOptionPane.showConfirmDialog(null,"Deseja Fechar?","ATENÇÂO ",javax.swing.JOptionPane.YES_NO_OPTION )==0){
            this.dispose();
        }
    
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Veiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Veiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Veiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Veiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Veiculos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JList<String> jList4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
