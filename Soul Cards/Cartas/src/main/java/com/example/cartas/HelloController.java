package com.example.cartas;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class HelloController {
    CardsAdm ca = new CardsAdm();

    @FXML
    private ImageView carta1;

    @FXML
    private ImageView carta2;

    @FXML
    private ImageView carta3;

    @FXML
    private ImageView carta4;

    @FXML
    private ImageView carta5;

    @FXML
    private ImageView carta6;

    @FXML
    private ImageView carta7;

    @FXML
    private ImageView carta8;

    @FXML
    private ImageView imageCartaDois;

    @FXML
    private ImageView imageCartaQuatro;

    @FXML
    private ImageView imageCartaTres;

    @FXML
    private ImageView imageCartaUm;

    @FXML
    private ImageView imageCartaZero;

    @FXML
    private ImageView imageDeck;

    @FXML
    void imageCartaDois(MouseEvent event) {

    }

    @FXML
    void imageCartaQuatro(MouseEvent event) {

    }

    @FXML
    void imageCartaTres(MouseEvent event) {

    }

    @FXML
    void imageCartaUm(MouseEvent event) {


    }

    @FXML
    void imageCartaZero(MouseEvent event) {
        System.out.println(ca.CampeaoSlot1);
    }



    @FXML
    void imageDeck(MouseEvent event) {

        ca.SorteioCartasCampeao();

        //SLOT 1 SET IMAGEM
        if(ca.CampeaoSlot1.equals(ca.Carta1)){
            imageCartaZero.setImage(carta1.getImage());
        }
        if(ca.CampeaoSlot1.equals(ca.Carta2)){
            imageCartaZero.setImage(carta2.getImage());
        }
        if(ca.CampeaoSlot1.equals(ca.Carta3)){
            imageCartaZero.setImage(carta3.getImage());
        }
        if(ca.CampeaoSlot1.equals(ca.Carta4)){
            imageCartaZero.setImage(carta4.getImage());
        }
        if(ca.CampeaoSlot1.equals(ca.Carta5)){
            imageCartaZero.setImage(carta5.getImage());
        }
        if(ca.CampeaoSlot1.equals(ca.Carta6)){
            imageCartaZero.setImage(carta6.getImage());
        }
        if(ca.CampeaoSlot1.equals(ca.Carta7)){
            imageCartaZero.setImage(carta7.getImage());
        }
        if(ca.CampeaoSlot1.equals(ca.Carta8)){
            imageCartaZero.setImage(carta8.getImage());
        }

        //SLOT 2 SET IMAGEM
        if(ca.CampeaoSlot2.equals(ca.Carta1)){
            imageCartaUm.setImage(carta1.getImage());
        }
        if(ca.CampeaoSlot2.equals(ca.Carta2)){
            imageCartaUm.setImage(carta2.getImage());
        }
        if(ca.CampeaoSlot2.equals(ca.Carta3)){
            imageCartaUm.setImage(carta3.getImage());
        }
        if(ca.CampeaoSlot2.equals(ca.Carta4)){
            imageCartaUm.setImage(carta4.getImage());
        }
        if(ca.CampeaoSlot2.equals(ca.Carta5)){
            imageCartaUm.setImage(carta5.getImage());
        }
        if(ca.CampeaoSlot2.equals(ca.Carta6)){
            imageCartaUm.setImage(carta6.getImage());
        }
        if(ca.CampeaoSlot2.equals(ca.Carta7)){
            imageCartaUm.setImage(carta7.getImage());
        }
        if(ca.CampeaoSlot2.equals(ca.Carta8)){
            imageCartaUm.setImage(carta8.getImage());
        }

        //SLOT 3 SET IMAGEM
        if(ca.CampeaoSlot3.equals(ca.Carta1)){
            imageCartaDois.setImage(carta1.getImage());
        }
        if(ca.CampeaoSlot3.equals(ca.Carta2)){
            imageCartaDois.setImage(carta2.getImage());
        }
        if(ca.CampeaoSlot3.equals(ca.Carta3)){
            imageCartaDois.setImage(carta3.getImage());
        }
        if(ca.CampeaoSlot3.equals(ca.Carta4)){
            imageCartaDois.setImage(carta4.getImage());
        }
        if(ca.CampeaoSlot3.equals(ca.Carta5)){
            imageCartaDois.setImage(carta5.getImage());
        }
        if(ca.CampeaoSlot3.equals(ca.Carta6)){
            imageCartaDois.setImage(carta6.getImage());
        }
        if(ca.CampeaoSlot3.equals(ca.Carta7)){
            imageCartaDois.setImage(carta7.getImage());
        }
        if(ca.CampeaoSlot3.equals(ca.Carta8)){
            imageCartaDois.setImage(carta8.getImage());
        }

        //SLOT 4 SET IMAGEM
        if(ca.CampeaoSlot4.equals(ca.Carta1)){
            imageCartaTres.setImage(carta1.getImage());
        }
        if(ca.CampeaoSlot4.equals(ca.Carta2)){
            imageCartaTres.setImage(carta2.getImage());
        }
        if(ca.CampeaoSlot4.equals(ca.Carta3)){
            imageCartaTres.setImage(carta3.getImage());
        }
        if(ca.CampeaoSlot4.equals(ca.Carta4)){
            imageCartaTres.setImage(carta4.getImage());
        }
        if(ca.CampeaoSlot4.equals(ca.Carta5)){
            imageCartaTres.setImage(carta5.getImage());
        }
        if(ca.CampeaoSlot4.equals(ca.Carta6)){
            imageCartaTres.setImage(carta6.getImage());
        }
        if(ca.CampeaoSlot4.equals(ca.Carta7)){
            imageCartaTres.setImage(carta7.getImage());
        }
        if(ca.CampeaoSlot4.equals(ca.Carta8)){
            imageCartaTres.setImage(carta8.getImage());
        }

        //SLOT 5 SET IMAGEM
        if(ca.CampeaoSlot5.equals(ca.Carta1)){
            imageCartaQuatro.setImage(carta1.getImage());
        }
        if(ca.CampeaoSlot5.equals(ca.Carta2)){
            imageCartaQuatro.setImage(carta2.getImage());
        }
        if(ca.CampeaoSlot5.equals(ca.Carta3)){
            imageCartaQuatro.setImage(carta3.getImage());
        }
        if(ca.CampeaoSlot5.equals(ca.Carta4)){
            imageCartaQuatro.setImage(carta4.getImage());
        }
        if(ca.CampeaoSlot5.equals(ca.Carta5)){
            imageCartaQuatro.setImage(carta5.getImage());
        }
        if(ca.CampeaoSlot5.equals(ca.Carta6)){
            imageCartaQuatro.setImage(carta6.getImage());
        }
        if(ca.CampeaoSlot5.equals(ca.Carta7)){
            imageCartaQuatro.setImage(carta7.getImage());
        }
        if(ca.CampeaoSlot5.equals(ca.Carta8)){
            imageCartaQuatro.setImage(carta8.getImage());
        }
    }

}
