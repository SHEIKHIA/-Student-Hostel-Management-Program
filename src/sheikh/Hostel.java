import java.text.NumberFormat;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.control.TextInputDialog;
import sheikh.TenantList;

/** GUI for the Hostel application
 * @author sheikhishtiakahmed
 * @version 12th December 2020
 */
public class Hostel extends Application {
    private int noOfRooms;
    private TenantList list;
    private final int WIDTH = 800;
    private final int HEIGHT = 500;

    private Label headingLabel = new Label("Hostel Application");
    private Label roomLabel1 = new Label("Room");
    private TextField roomField1 = new TextField();
    private Label nameLabel = new Label("Name");
    private TextField nameField = new TextField();
    private Button addButton = new Button("Add Tenant");
    private Button displayButton = new Button("Display Tenants");
    private Button removeButton = new Button("Remove Tenant");
    private Button saveAndQuitButton = new Button("Save and Quit");
    private TextArea displayArea1 = new TextArea();
    private Label roomLabel2 = new Label("Room");
    private TextField roomField2 = new TextField();
    private Label monthLabel = new Label("Month");
    private TextField monthField = new TextField();
    private Label amountLabel = new Label("Amount");
    private TextField amountField = new TextField();
    private Button paymentButton = new Button("Make Payment");
    private Button listButton = new Button("List Payments");
    private TextArea displayArea2 = new TextArea();

    @Override
    public void start(Stage stage) {
        noOfRooms = getNumberOfRooms();
        list = new TenantList(noOfRooms);
        TenantFileHandler.readRecords(list);

        HBox roomDetails = new HBox(10);
        HBox tenantButtons = new HBox(10);
        HBox paymentDetails = new HBox(10);
        HBox paymentButtons = new HBox(10);

        roomDetails.getChildren().addAll(roomLabel1, roomField1, nameLabel, nameField);
        tenantButtons.getChildren().addAll(addButton, displayButton, removeButton, saveAndQuitButton);
        paymentDetails.getChildren().addAll(roomLabel2, roomField2, monthLabel, monthField, amountLabel, amountField);
        paymentButtons.getChildren().addAll(paymentButton, listButton);

        VBox root = new VBox(10);
        root.getChildren().addAll(headingLabel, roomDetails, tenantButtons, displayArea1, paymentDetails, paymentButtons, displayArea2);

        Scene scene = new Scene(root, Color.LIGHTBLUE);

        Font font = new Font("Calibri", 40);
        headingLabel.setFont(font);

        setAlignment(roomDetails);
        setAlignment(tenantButtons);
        setAlignment(paymentDetails);
        setAlignment(paymentButtons);
        root.setAlignment(Pos.CENTER);

        setMaxWidth(roomField1, roomField2);
        setMinMaxWidth(WIDTH, roomDetails, tenantButtons, paymentDetails);

        setMinMaxSize(WIDTH, HEIGHT, root, displayArea1, displayArea2);

        setCustomStyles(root);

        addButton.setOnAction(e -> addHandler());
        displayButton.setOnAction(e -> displayHandler());
        removeButton.setOnAction(e -> removeHandler());
        paymentButton.setOnAction(e -> paymentHandler());
        listButton.setOnAction(e -> listHandler());
        saveAndQuitButton.setOnAction(e -> saveAndQuitHandler());

        stage.setScene(scene);
        stage.setTitle("Hostel Application");
        stage.setResizable(false);
        stage.show();
    }

    private int getNumberOfRooms() {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setHeaderText("How many rooms?");
        dialog.setTitle("Room Information Request");
        String response = dialog.showAndWait().orElse("0");
        return Integer.parseInt(response);
    }

    private void setAlignment(Pos pos) {
        roomDetails.setAlignment(pos);
        tenantButtons.setAlignment(pos);
        paymentDetails.setAlignment(pos);
        paymentButtons.setAlignment(pos);
    }

    private void setMaxWidth(TextField... textFields) {
        for (TextField textField : textFields) {
            textField.setMaxWidth(50);
        }
    }

    private void setMinMaxWidth(int width, HBox... hBoxes) {
        for (HBox hBox : hBoxes) {
            hBox.setMinWidth(width);
            hBox.setMaxWidth(width);
        }
    }

    private void setMinMaxSize(int width, int height, Region... regions) {
        for (Region region : regions) {
            region.setMinSize(width, height);
            region.setMaxSize(width, height);
        }
    }

    private void setCustomStyles(VBox root) {
        BorderStroke style = new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(0), new BorderWidths(2));
        root.setBackground(new Background(new BackgroundFill(Color.WHITE, new CornerRadii(0), Insets.EMPTY)));
        root.setBorder(new Border(style));

        Button[] buttons = { addButton, displayButton, removeButton, saveAndQuitButton, paymentButton, listButton };
        for (Button button : buttons) {
            button.setBackground(new Background(new BackgroundFill(Color.LIGHTYELLOW, new CornerRadii(10), Insets.EMPTY)));
        }
    }}

