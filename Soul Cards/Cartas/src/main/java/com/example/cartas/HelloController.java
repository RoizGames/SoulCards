package com.example.cartas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class HelloController {
    CardsAdm ca = new CardsAdm();
    Inimigo enemy = new Inimigo();
    static Campeao champ = new Campeao();
    int ultimaSlotCarta;

    private static String EscolhaSlot1;
    private static String EscolhaSlot2;
    private static String EscolhaSlot3;
    private static String EscolhaSlot4;
    private static String EscolhaSlot5;

    @FXML
    private Button BotaoJogar;

    @FXML
    private ImageView imageCartaInimigo;
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
    private Text intHp;

    @FXML
    private Text intHpInimigo;

    @FXML
    private Text txtHp;

    @FXML
    private Text txtHpInimigo;

    void BatalhaLT(){

            if(ca.Escolha == null) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Soul Cards");
                alert.setHeaderText("Escolha da carta não foi feita.");
                alert.setContentText("Por favor escolha uma carta antes de jogar.");

                alert.showAndWait();
            }else{
                ca.Batalha();

                intHp.setText(ca.hpCampeaoShow);
                intHpInimigo.setText(ca.hpInimigoShow);


                if (EscolhaSlot1!=null) {
                    imageCartaZero.setVisible(false);
                }
                if (EscolhaSlot2!=null) {
                    imageCartaUm.setVisible(false);
                }
                if (EscolhaSlot3!=null) {
                    imageCartaDois.setVisible(false);
                }
                if (EscolhaSlot4!=null) {
                    imageCartaTres.setVisible(false);
                }
                if (EscolhaSlot5!=null) {
                    imageCartaQuatro.setVisible(false);
                }

                ca.ReposicaoCampeao();



        }

    }
    void BatalhaIT(){
        ca.AtaqueInimigo();


        if (ca.ultimaCartaInimigo.equals("Carta1")) {
            imageCartaInimigo.setImage(carta1.getImage());
        }
        if (ca.ultimaCartaInimigo.equals(ca.Carta2)) {
            imageCartaInimigo.setImage(carta2.getImage());
        }
        if (ca.ultimaCartaInimigo.equals(ca.Carta3)) {
            imageCartaInimigo.setImage(carta3.getImage());
        }
        if (ca.ultimaCartaInimigo.equals(ca.Carta4)) {
            imageCartaInimigo.setImage(carta4.getImage());
        }
        if (ca.ultimaCartaInimigo.equals(ca.Carta5)) {
            imageCartaInimigo.setImage(carta5.getImage());
        }
        if (ca.ultimaCartaInimigo.equals(ca.Carta6)) {
            imageCartaInimigo.setImage(carta6.getImage());
        }
        if (ca.ultimaCartaInimigo.equals(ca.Carta7)) {
            imageCartaInimigo.setImage(carta7.getImage());
        }
        if (ca.ultimaCartaInimigo.equals(ca.Carta8)) {
            imageCartaZero.setImage(carta8.getImage());
        }
        ca.ReposicaoInimigo();

        intHp.setText(ca.hpCampeaoShow);
        intHpInimigo.setText(ca.hpInimigoShow);
    }


    @FXML
    void BotaoJogar(ActionEvent event) {
        if (BotaoJogar.getText().equals("Jogar")) {
            if (EscolhaSlot1 != null) {
                ca.Escolha = EscolhaSlot1;
                BatalhaLT();
            }
            if (EscolhaSlot2 != null) {
                ca.Escolha = EscolhaSlot2;
                BatalhaLT();
            }
            if (EscolhaSlot3 != null) {
                ca.Escolha = EscolhaSlot3;
                BatalhaLT();
            }
            if (EscolhaSlot4 != null) {
                ca.Escolha = EscolhaSlot4;
                BatalhaLT();
            }
            if (EscolhaSlot5 != null) {
                ca.Escolha = EscolhaSlot5;
                BatalhaLT();
            }
            BatalhaIT();

            BotaoJogar.setText("Again");


            System.out.println(ca.maoInimigo);


        }else{
            imageCartaInimigo.setImage(imageDeck.getImage());

            //SLOT 1 SET IMAGEM
            if (ca.CampeaoSlot1.equals(ca.Carta1)) {
                imageCartaZero.setImage(carta1.getImage());
            }
            if (ca.CampeaoSlot1.equals(ca.Carta2)) {
                imageCartaZero.setImage(carta2.getImage());
            }
            if (ca.CampeaoSlot1.equals(ca.Carta3)) {
                imageCartaZero.setImage(carta3.getImage());
            }
            if (ca.CampeaoSlot1.equals(ca.Carta4)) {
                imageCartaZero.setImage(carta4.getImage());
            }
            if (ca.CampeaoSlot1.equals(ca.Carta5)) {
                imageCartaZero.setImage(carta5.getImage());
            }
            if (ca.CampeaoSlot1.equals(ca.Carta6)) {
                imageCartaZero.setImage(carta6.getImage());
            }
            if (ca.CampeaoSlot1.equals(ca.Carta7)) {
                imageCartaZero.setImage(carta7.getImage());
            }
            if (ca.CampeaoSlot1.equals(ca.Carta8)) {
                imageCartaZero.setImage(carta8.getImage());
            }

            //SLOT 2 SET IMAGEM
            if (ca.CampeaoSlot2.equals(ca.Carta1)) {
                imageCartaUm.setImage(carta1.getImage());
            }
            if (ca.CampeaoSlot2.equals(ca.Carta2)) {
                imageCartaUm.setImage(carta2.getImage());
            }
            if (ca.CampeaoSlot2.equals(ca.Carta3)) {
                imageCartaUm.setImage(carta3.getImage());
            }
            if (ca.CampeaoSlot2.equals(ca.Carta4)) {
                imageCartaUm.setImage(carta4.getImage());
            }
            if (ca.CampeaoSlot2.equals(ca.Carta5)) {
                imageCartaUm.setImage(carta5.getImage());
            }
            if (ca.CampeaoSlot2.equals(ca.Carta6)) {
                imageCartaUm.setImage(carta6.getImage());
            }
            if (ca.CampeaoSlot2.equals(ca.Carta7)) {
                imageCartaUm.setImage(carta7.getImage());
            }
            if (ca.CampeaoSlot2.equals(ca.Carta8)) {
                imageCartaUm.setImage(carta8.getImage());
            }

            //SLOT 3 SET IMAGEM
            if (ca.CampeaoSlot3.equals(ca.Carta1)) {
                imageCartaDois.setImage(carta1.getImage());
            }
            if (ca.CampeaoSlot3.equals(ca.Carta2)) {
                imageCartaDois.setImage(carta2.getImage());
            }
            if (ca.CampeaoSlot3.equals(ca.Carta3)) {
                imageCartaDois.setImage(carta3.getImage());
            }
            if (ca.CampeaoSlot3.equals(ca.Carta4)) {
                imageCartaDois.setImage(carta4.getImage());
            }
            if (ca.CampeaoSlot3.equals(ca.Carta5)) {
                imageCartaDois.setImage(carta5.getImage());
            }
            if (ca.CampeaoSlot3.equals(ca.Carta6)) {
                imageCartaDois.setImage(carta6.getImage());
            }
            if (ca.CampeaoSlot3.equals(ca.Carta7)) {
                imageCartaDois.setImage(carta7.getImage());
            }
            if (ca.CampeaoSlot3.equals(ca.Carta8)) {
                imageCartaDois.setImage(carta8.getImage());
            }

            //SLOT 4 SET IMAGEM
            if (ca.CampeaoSlot4.equals(ca.Carta1)) {
                imageCartaTres.setImage(carta1.getImage());
            }
            if (ca.CampeaoSlot4.equals(ca.Carta2)) {
                imageCartaTres.setImage(carta2.getImage());
            }
            if (ca.CampeaoSlot4.equals(ca.Carta3)) {
                imageCartaTres.setImage(carta3.getImage());
            }
            if (ca.CampeaoSlot4.equals(ca.Carta4)) {
                imageCartaTres.setImage(carta4.getImage());
            }
            if (ca.CampeaoSlot4.equals(ca.Carta5)) {
                imageCartaTres.setImage(carta5.getImage());
            }
            if (ca.CampeaoSlot4.equals(ca.Carta6)) {
                imageCartaTres.setImage(carta6.getImage());
            }
            if (ca.CampeaoSlot4.equals(ca.Carta7)) {
                imageCartaTres.setImage(carta7.getImage());
            }
            if (ca.CampeaoSlot4.equals(ca.Carta8)) {
                imageCartaTres.setImage(carta8.getImage());
            }

            //SLOT 5 SET IMAGEM
            if (ca.CampeaoSlot5.equals(ca.Carta1)) {
                imageCartaQuatro.setImage(carta1.getImage());
            }
            if (ca.CampeaoSlot5.equals(ca.Carta2)) {
                imageCartaQuatro.setImage(carta2.getImage());
            }
            if (ca.CampeaoSlot5.equals(ca.Carta3)) {
                imageCartaQuatro.setImage(carta3.getImage());
            }
            if (ca.CampeaoSlot5.equals(ca.Carta4)) {
                imageCartaQuatro.setImage(carta4.getImage());
            }
            if (ca.CampeaoSlot5.equals(ca.Carta5)) {
                imageCartaQuatro.setImage(carta5.getImage());
            }
            if (ca.CampeaoSlot5.equals(ca.Carta6)) {
                imageCartaQuatro.setImage(carta6.getImage());
            }
            if (ca.CampeaoSlot5.equals(ca.Carta7)) {
                imageCartaQuatro.setImage(carta7.getImage());
            }
            if (ca.CampeaoSlot5.equals(ca.Carta8)) {
                imageCartaQuatro.setImage(carta8.getImage());
            }
            imageCartaZero.setVisible(true);
            imageCartaUm.setVisible(true);
            imageCartaDois.setVisible(true);
            imageCartaTres.setVisible(true);
            imageCartaQuatro.setVisible(true);



            BotaoJogar.setText("Jogar");
            System.out.println(ca.ultimaCartaInimigo);

            EscolhaSlot1 = null;
            EscolhaSlot2 = null;
            EscolhaSlot3 = null;
            EscolhaSlot4 = null;
            EscolhaSlot5 = null;

        }

        if(ca.enemy.hpInimigo<=0) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Soul Cards");
            alert.setHeaderText("Vitoria");

            alert.showAndWait();
        }
    }

        @FXML
    void imageCartaDois(MouseEvent event) {
        EscolhaSlot3 = ca.CampeaoSlot3;
            ultimaSlotCarta = 3;
    }

    @FXML
    void imageCartaQuatro(MouseEvent event) {
        EscolhaSlot5 = ca.CampeaoSlot5;
        ultimaSlotCarta = 5;


    }

    @FXML
    void imageCartaTres(MouseEvent event) {
        EscolhaSlot4 = ca.CampeaoSlot4;
        ultimaSlotCarta = 4;

    }

    @FXML
    void imageCartaUm(MouseEvent event) {
        EscolhaSlot2 = ca.CampeaoSlot2;
        ultimaSlotCarta = 2;
    }

    @FXML
    void imageCartaZero(MouseEvent event) {

        EscolhaSlot1 = ca.CampeaoSlot1;
        ultimaSlotCarta = 1;



    }



    @FXML
    void imageDeck(MouseEvent event) {
        ca.SorteioCartasInimigo();
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
