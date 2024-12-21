package Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import Item.item;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
public class controller {
    public TextField name;
    public TextField price;
    public TextField quantity;
    public TableView table;
    public TableColumn colname;
    public TableColumn colquantity;
    public TableColumn colprice;

    ArrayList<item>Itemlist=new ArrayList<>();

    public void btnaddnaction(ActionEvent actionEvent) {
        String txtname= name.getText();
        String txtquantity= quantity.getText();
        String txtprice= price.getText();

        item c1=Item(txtname,txtprice,txtquantity);
        Itemlist.add(c1);
        System.out.println(Itemlist);
    }

    private item Item(String txtname, String txtprice, String txtquantity) {
        return null;
    }

    public void btnviewaction(ActionEvent actionEvent) {
    }
}
