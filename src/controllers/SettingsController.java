
package controllers;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import views.SystemView;


public class SettingsController implements MouseListener{
    private SystemView views;
    
    public SettingsController(SystemView views){
        this.views = views;
        this.views.jLabelProducts.addMouseListener(this);
        this.views.jLabelPurchases.addMouseListener(this);
        this.views.jLabelCustomers.addMouseListener(this);
        this.views.jLabelEmployees.addMouseListener(this);
        this.views.jLabelSuppliers.addMouseListener(this);
        this.views.jLabelCategories.addMouseListener(this);
        this.views.jLabelReports.addMouseListener(this);
        this.views.jLabelSettings.addMouseListener(this);
        
        
    }
    @Override
    public void mouseClicked(MouseEvent e) {
       
    }

    @Override
    public void mousePressed(MouseEvent e) {
    
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    
    }
    //  EFECTO HOVER SOBRE LOS LABEL
    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource() == views.jLabelProducts){
            views.jPanelProducts.setBackground(new Color(153, 229, 225));
        }else if(e.getSource() == views.jLabelPurchases){
            views.jPanelPurchases.setBackground(new Color(153, 229, 225));
        }else if(e.getSource() == views.jLabelCustomers){
            views.jPanelCustomers.setBackground(new Color(153, 229, 225));
        }else if(e.getSource() == views.jLabelEmployees){
            views.jPanelEmployees.setBackground(new Color(153, 229, 225));
        }else if(e.getSource() == views.jLabelSuppliers){
            views.jPanelSuppliers.setBackground(new Color(153, 229, 225));
        }else if(e.getSource() == views.jLabelCategories){
            views.jPanelCategories.setBackground(new Color(153, 229, 225));
        }else if(e.getSource() == views.jLabelReports){
            views.jPanelReports.setBackground(new Color(153, 229, 225));
        }else if(e.getSource() == views.jLabelSettings){
            views.jPanelSettings.setBackground(new Color(153, 229, 225));
        }
        
    }
    //  RETORNO A ESTADO ORIGINAL
    @Override
    public void mouseExited(MouseEvent e) {
    if(e.getSource() == views.jLabelProducts){
            views.jPanelProducts.setBackground(new Color(18, 45, 61));
        }else if(e.getSource() == views.jLabelPurchases){
            views.jPanelPurchases.setBackground(new Color(18, 45, 61));
        }else if(e.getSource() == views.jLabelCustomers){
            views.jPanelCustomers.setBackground(new Color(18, 45, 61));
        }else if(e.getSource() == views.jLabelEmployees){
            views.jPanelEmployees.setBackground(new Color(18, 45, 61));
        }else if(e.getSource() == views.jLabelSuppliers){
            views.jPanelSuppliers.setBackground(new Color(18, 45, 61));
        }else if(e.getSource() == views.jLabelCategories){
            views.jPanelCategories.setBackground(new Color(18, 45, 61));
        }else if(e.getSource() == views.jLabelReports){
            views.jPanelReports.setBackground(new Color(18, 45, 61));
        }else if(e.getSource() == views.jLabelSettings){
            views.jPanelSettings.setBackground(new Color(18, 45, 61));
        }
        
    }
    
}