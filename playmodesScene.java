import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class playmodesScene extends Scene {

    Background transparentBackground = new Background(new BackgroundFill(Color.TRANSPARENT, CornerRadii.EMPTY, javafx.geometry.Insets.EMPTY));
    DropShadow dropShadow = new DropShadow();
    Image CUizLogo = new Image("CUiz Logo.png");
    ImageView CUizView = new ImageView();
    Background orangeBackground = new Background(new BackgroundFill(Color.rgb(232, 123, 56), CornerRadii.EMPTY, javafx.geometry.Insets.EMPTY));

    Insets offset = new Insets(10,10,10,10);

    public playmodesScene(Stage primaryStage) {
        super(new VBox(), 520, 360);
        CUizView.setFitWidth(440);
        CUizView.setFitHeight(250);
        CUizView.setImage(CUizLogo);


        Image CUizPenguin = new Image("CUizPenguin.png");
        ImageView CUizPenguinView = new ImageView();
        CUizPenguinView.setFitWidth(75);
        CUizPenguinView.setFitHeight(75);
        CUizPenguinView.setImage(CUizPenguin);

        ImageView CUizPenguinView1 = new ImageView();
        CUizPenguinView1.setFitWidth(75);
        CUizPenguinView1.setFitHeight(75);
        CUizPenguinView1.setImage(CUizPenguin);

        dropShadow.setRadius(8); // Set the radius of the shadow
        dropShadow.setColor(Color.BLACK);
        Button incDifficultyButton = new Button("Increasing\n"
                + "Difficulty");
        incDifficultyButton.setFont(Font.font("ADLam Display", FontWeight.NORMAL, 20));
        incDifficultyButton.setTextFill(Color.WHITE);
        incDifficultyButton.setBackground(transparentBackground);
        incDifficultyButton.setEffect(dropShadow);
        incDifficultyButton.setTextAlignment(TextAlignment.CENTER);
        incDifficultyButton.setOnAction(e -> {
            Stage stage = (Stage) incDifficultyButton.getScene().getWindow();
            gameplayScene.gamemodeInt = 0;
            primaryStage.setScene(gameplayScene.createScene(stage));
            primaryStage.setFullScreen(true);
        });

        Button incScoreButton = new Button("Increasing\n"
                + "Score");
        incScoreButton.setFont(Font.font("ADLam Display", FontWeight.NORMAL, 20));
        incScoreButton.setTextFill(Color.WHITE);
        incScoreButton.setBackground(transparentBackground);
        incScoreButton.setEffect(dropShadow);
        incScoreButton.setTextAlignment(TextAlignment.CENTER);
        incScoreButton.setOnAction(e -> {
        Stage stage = (Stage) incScoreButton.getScene().getWindow();
            gameplayScene.gamemodeInt = 1;
            primaryStage.setScene(gameplayScene.createScene(stage));
            primaryStage.setFullScreen(true);
    });

        Button randomPlayButton = new Button("Random\n"
                + "Play");
        randomPlayButton.setFont(Font.font("ADLam Display", FontWeight.NORMAL, 20));
        randomPlayButton.setTextFill(Color.WHITE);
        randomPlayButton.setBackground(transparentBackground);
        randomPlayButton.setEffect(dropShadow);
        randomPlayButton.setTextAlignment(TextAlignment.CENTER);
        randomPlayButton.setOnAction(e -> {
            Stage stage = (Stage) randomPlayButton.getScene().getWindow();
            gameplayScene.gamemodeInt = 2;
            primaryStage.setScene(gameplayScene.createScene(stage));
            primaryStage.setFullScreen(true);
        });

        ImageView CUizView1 = new ImageView();
        CUizView1.setFitWidth(50);
        CUizView1.setFitHeight(25);
        CUizView1.setImage(CUizLogo);


        Label currentUserLabel1 = new Label("Currently Logged in: " + launcher.user_ID );
        currentUserLabel1.setFont(Font.font("ADLam Display", FontWeight.NORMAL, 10));
        currentUserLabel1.setTextFill(Color.WHITE);

        Label chooseModeLabel= new Label("Choose a Game Mode");
        chooseModeLabel.setFont(Font.font("ADLam Display", FontWeight.NORMAL, 40));
        chooseModeLabel.setTextFill(Color.WHITE);
        chooseModeLabel.setBackground(orangeBackground);
        chooseModeLabel.setEffect(dropShadow);
        chooseModeLabel.setTextAlignment(TextAlignment.CENTER);

        GridPane BottomPlayModesLay = new GridPane();
        BottomPlayModesLay.setVgap(10);
        BottomPlayModesLay.setHgap(5);
        BottomPlayModesLay.setAlignment(Pos.CENTER);
        BottomPlayModesLay.setConstraints(CUizPenguinView1, 0, 0);
        BottomPlayModesLay.setConstraints(currentUserLabel1, 1, 0);
        BottomPlayModesLay.getChildren().addAll(CUizPenguinView1, currentUserLabel1);

        GridPane CenterPlayModesLay = new GridPane();
        CenterPlayModesLay.setPadding(offset);
        CenterPlayModesLay.setVgap(10);
        CenterPlayModesLay.setHgap(5);
        CenterPlayModesLay.setAlignment(Pos.CENTER);
        CenterPlayModesLay.setConstraints(incDifficultyButton, 0, 1);
        CenterPlayModesLay.setHalignment(incDifficultyButton, HPos.CENTER);
        CenterPlayModesLay.setConstraints(incScoreButton, 10, 1);
        CenterPlayModesLay.setHalignment(incScoreButton, HPos.CENTER);
        CenterPlayModesLay.setConstraints(randomPlayButton, 5, 1);
        CenterPlayModesLay.setHalignment(randomPlayButton, HPos.CENTER);
        CenterPlayModesLay.getChildren().addAll(incDifficultyButton, incScoreButton, randomPlayButton);

        GridPane TopPlayModesLay = new GridPane();
        TopPlayModesLay.setVgap(10);
        TopPlayModesLay.setHgap(5);
        TopPlayModesLay.setAlignment(Pos.CENTER);
        TopPlayModesLay.setConstraints(CUizView1, 2, 1);
        TopPlayModesLay.setConstraints(chooseModeLabel, 0, 8);
        TopPlayModesLay.getChildren().addAll(CUizView1, chooseModeLabel);


        BorderPane PlayModesLay = new BorderPane();
        PlayModesLay.setStyle("-fx-background-color: #FFD966;");
        PlayModesLay.setPadding(offset);
        PlayModesLay.setTop(TopPlayModesLay);
        PlayModesLay.setBottom(BottomPlayModesLay);
        PlayModesLay.setCenter(CenterPlayModesLay);


        // Add the button to the scene's layout
        VBox root = (VBox) this.getRoot();
        root.getChildren().addAll(PlayModesLay);

    }
    public static playmodesScene createScene(Stage primaryStage) {
        return new playmodesScene(primaryStage);
    }

}
