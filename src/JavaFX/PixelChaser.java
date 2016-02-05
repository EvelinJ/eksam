package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;



/**
 * Joonista ekraanile hunnik ristkülikuid, erinevatel positsioonidel. Ühe korra kastile klikates
 * muutub ta 2x väiksemaks. Teist korda klikates kaob ta sootuks.
 */
public class PixelChaser extends Application{
    GridPane gridPane;
    Rectangle ruut;
    int laualRidasid = 5;
    int laualTulpasid = 5;

    int ristkülikuPikkus = 60;
    int ristkülikuKorgus = 30;
    int piksleidLai = laualRidasid*ristkülikuPikkus;
    int piksleidKorge = laualTulpasid*ristkülikuKorgus;
    private Rectangle klikitud;


    @Override
    public void start(Stage primaryStage) throws Exception {
        Stage stage =new Stage();
        gridPane = new GridPane();
        ruut=new Rectangle();

        Scene scene = new Scene(gridPane, piksleidLai, piksleidKorge);
        stage.setScene(scene);
        stage.show();

        genereeriRuudud();
        reageeriKlikile();


    }

    private void reageeriKlikile() {
        gridPane.setOnMouseClicked(event -> {
            Rectangle ruut = (Rectangle) event.getTarget();



            if (ruut.getId().equals("ruut")) {
                System.out.println("Klikiti");
                ruut.setHeight(ristkülikuKorgus / 2);
                ruut.setWidth(ristkülikuPikkus / 2);
                ruut.setId("Väike");
                klikitud = ruut;
                System.out.println(ruut.getId());
            } /*else if (ruut.getId().equals("väike")) {
                ruut.setFill(Color.WHITE);
                System.out.println("teine klikk");
                //ruut.setHeight(0);
                //ruut.setWidth(0);
            }*/




        });
    }




    public void genereeriRuudud() {
        int ruudud = 0;
        for (int i = 0; i < laualRidasid; i++) {
            for (int j = 0; j < laualRidasid; j++) {
                Rectangle ruut = new Rectangle(ristkülikuPikkus, ristkülikuKorgus);
                ruut.setFill(Color.BLUE);
                ruut.setStroke(Color.DARKBLUE);
                ruut.setId("ruut");
                gridPane.add(ruut, j, i);
            }
        }



    }
}
