package Css;

import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Screen;

/**
 * Css class used for styling different JavaFX elements
 */
public class Css {
    private static final String FONT = "Montserrat";
    private static final String PANE_STYLE = "-fx-padding: 4;-fx-border-style: solid inside;-fx-border-width: 1px; -fx-border-radius: 15px;-fx-border-color: #DDDDDD; -fx-background-color: white;-fx-background-radius: 15px;";
    private static final String BUTTON_STYLE = "-fx-border-style:solid inside;-fx-border-width: 1px;-fx-border-radius: 15px; -fx-border-color: #DDDDDD; -fx-background-radius: 15px;-fx-background-insets: 0;";
    private static final String UN_HOVERED_BUTTON_STYLE = "-fx-background-color: white;";
    private static final String HOVERED_BUTTON_STYLE = "-fx-background-color: #00000022;-fx-cursor: hand;";
    private static final String TEXTFIELD_STYLE = "-fx-background-color: white;-fx-border-color: #656565; -fx-border-radius: 15px;-fx-background-radius: 15px;";

    /**
     * Private constructor to hinder creation of utility class
     */
    private Css() {
        throw new IllegalStateException("Can not make instance of utility class");
    }

    /**
     * setPane takes in an amount of panes or its subclasses (border pane, grid pane)
     *
     * @param panes an amount of panes
     */
    public static void setPane(Pane... panes) {
        for (Pane pane : panes) {
            pane.setStyle(PANE_STYLE);
        }
    }

    /**
     * Sets styling for the stack pane in the map scene
     *
     * @param stackPane a stack pane
     */
    public static void setMapPane(StackPane stackPane) {
        stackPane.setStyle("-fx-border-style: solid inside;-fx-border-radius: 15px;-fx-border-width: 1px;-fx-border-color: #DDDDDD;");
    }

    /**
     * setButton style takes in width, height, fontSize and an amount of buttons and sets their styling
     *
     * @param width    the preferred width of buttons
     * @param height   the preferred height of the buttons
     * @param fontSize the font size of the text in the buttons
     * @param buttons  an amount of buttons
     */
    public static void setButton(int width, int height, int fontSize, Button... buttons) {
        for (Button button : buttons) {
            button.setStyle(BUTTON_STYLE + UN_HOVERED_BUTTON_STYLE);
            button.setFont(Font.font(FONT, fontSize));
            button.setPrefWidth(width);
            button.setPrefHeight(height);
            button.setOnMouseEntered(e -> button.setStyle(BUTTON_STYLE + HOVERED_BUTTON_STYLE));
            button.setOnMouseExited(e -> button.setStyle(BUTTON_STYLE + UN_HOVERED_BUTTON_STYLE));
        }
    }

    /**
     * Method to style buttons from the tag container class
     *
     * @param buttons Is multiple buttons
     */
    public static void setTagContainerButton(Button... buttons) {
        for (Button button : buttons) {
            button.setMaxSize(10, 10);
            button.setStyle("-fx-background-color: none");
        }
    }

    /**
     * Sets home button styling in the header
     *
     * @param button An button
     */
    public static void setHomeButton(Button button) {
        button.setStyle("-fx-background-color: none;");
        button.setOnMouseEntered(e -> button.setStyle("-fx-background-color: #00000022; -fx-cursor: hand"));
        button.setOnMouseExited(e -> button.setStyle("-fx-background-color: none"));
    }

    /**
     * Sets style in image container class for a button and container
     *
     * @param button    a button
     * @param container a HBox
     */
    public static void setImageContainer(Button button, HBox container) {
        String IMAGE_BUTTON_STYLE = "-fx-background-radius: 15px 0px 0px 15px;";
        button.setStyle(IMAGE_BUTTON_STYLE + UN_HOVERED_BUTTON_STYLE);
        container.setStyle(PANE_STYLE + "-fx-padding: 0; -fx-border-insets: 1; -fx-background-insets: 1");
        button.setOnMouseExited(action -> button.setStyle(IMAGE_BUTTON_STYLE + UN_HOVERED_BUTTON_STYLE));
        button.setOnMouseEntered(action -> button.setStyle(IMAGE_BUTTON_STYLE + HOVERED_BUTTON_STYLE));
        button.setAlignment(Pos.CENTER_LEFT);
        button.setPrefWidth(Screen.getPrimary().getVisualBounds().getWidth());
        button.setMinHeight(160);
        button.setMaxHeight(160);
    }

    /**
     * sets Textfield styling for an amount of text fields
     *
     * @param width      the preferred width of text fields
     * @param height     the preferred height of text fields
     * @param fontSize   the font size of the prompt text in text fields
     * @param textFields an amount of text fields
     */
    public static void setTextField(int width, int height, int fontSize, TextField... textFields) {
        for (TextField textField : textFields) {
            textField.setStyle(TEXTFIELD_STYLE);
            textField.setPrefWidth(width);
            textField.setPrefHeight(height);
            textField.setFont(Font.font(FONT, fontSize));
        }
    }

    /**
     * Sets styling for the scroll pain in albums
     *
     * @param scrollPane A scroll pane
     */
    public static void setAlbumScrollPaneBorder(ScrollPane scrollPane) {
        scrollPane.setStyle("-fx-background-color:transparent;");
    }

    /**
     * Sets styling for choice box in add to album in search scene
     *
     * @param choiceBox A choice box
     */
    public static void setChoiceBoxAlbums(ChoiceBox choiceBox) {
        choiceBox.setPrefHeight(20);
        choiceBox.setPrefWidth(700);
        choiceBox.setStyle("-fx-background-color: white;-fx-border-color: #656565;" +
                "-fx-border-radius: 15px;-fx-background-radius: 15px");
    }

    /**
     * Sets styling for labels
     *
     * @param fontSize the size of the font in the labels
     * @param labels   An amount of Labels
     */
    public static void setLabel(int fontSize, Label... labels) {
        for (Label label : labels) {
            label.setFont(Font.font(FONT, fontSize));
        }
    }

    /**
     * Sets styling for feedback labels
     *
     * @param feedBackType FeedBackType Enum, the type of feedback (success or error)
     * @param fontSize     the size of the font
     * @param labels,      an amount of labels.
     */
    public static void setFeedBackLabel(FeedBackType feedBackType, int fontSize, Label... labels) {
        for (Label label : labels) {
            label.setStyle("-fx-text-fill:" + feedBackType.getColor());
            label.setFont(Font.font(FONT, fontSize));
        }
    }

    /**
     * Styles font of a text in the Action popup class
     *
     * @param fontSize the size of the font
     * @param texts    A number of texts
     */
    public static void setText(int fontSize, Text... texts) {
        for (Text text : texts) {
            text.setFont(Font.font(FONT, fontSize));
        }
    }

    /**
     * setLoadingAnimation styles all ProgressIndicator put as parameter
     *
     * @param progressIndicators an amount of progressIndicators
     */
    public static void setLoadingAnimation(ProgressIndicator... progressIndicators) {
        for (ProgressIndicator progressIndicator : progressIndicators) {
            progressIndicator.setStyle("-fx-progress-color: dimgrey; -fx-cursor: wait");
            progressIndicator.setMaxSize(30, 30);
            progressIndicator.setVisible(false);
        }
    }

}
