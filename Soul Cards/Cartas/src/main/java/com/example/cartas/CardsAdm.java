package com.example.cartas;

import java.util.Arrays;
import java.util.List;

public class CardsAdm {

    //CARTAS
    String Carta1 = "Carta1";
    String Carta2 = "Carta2";
    String Carta3 = "Carta3";
    String Carta4 = "Carta4";
    String Carta5 = "Carta5";
    String Carta6 = "Carta6";
    String Carta7 = "Carta7";
    String Carta8 = "Carta8";

    //ULTIMA CARTA JOGADA
    String ultimaCartaCampeao = null;
    String ultimaCartaInimigo = null;



    //SLOTS CAMPEAO
    String CampeaoSlot1 = "vazio";
    String CampeaoSlot2 = "vazio";
    String CampeaoSlot3 = "vazio";
    String CampeaoSlot4 = "vazio";
    String CampeaoSlot5 = "vazio";

    //MATRIZES CAMPEAO
    String[] cartas = {Carta1, Carta2, Carta3, Carta4, Carta5, Carta6, Carta7, Carta8};
    String[] maoCampeao0 = {CampeaoSlot1, CampeaoSlot2, CampeaoSlot3, CampeaoSlot4, CampeaoSlot5};
    List<String> maoCampeao = Arrays.asList();

    //SLOTS INIMIGO
    String InimigoSlot1 = "vazio";
    String InimigoSlot2 = "vazio";
    String InimigoSlot3 = "vazio";
    String InimigoSlot4 = "vazio";
    String InimigoSlot5 = "vazio";

    //MATRIZES INIMIGO
    String[] cartasInimigo = {Carta1, Carta2, Carta3, Carta4, Carta5, Carta6, Carta7, Carta8};

    String[] maoInimigo0 = {InimigoSlot1, InimigoSlot2, InimigoSlot3, InimigoSlot4, InimigoSlot5};

    List<String> maoInimigo = Arrays.asList(maoInimigo0);



    //METODO DE SORTEIO CARTAS DO CAMPEAO
    public void SorteioCartasCampeao() {

        if (CampeaoSlot1.equals("vazio")) {
            //Sorteio Cartas Campeao
            CampeaoSlot1 = cartas[(int) (Math.random() * 8)];
            CampeaoSlot2 = cartas[(int) (Math.random() * 8)];
            CampeaoSlot3 = cartas[(int) (Math.random() * 8)];
            CampeaoSlot4 = cartas[(int) (Math.random() * 8)];
            CampeaoSlot5 = cartas[(int) (Math.random() * 8)];
        }

        maoCampeao0 = new String[]{CampeaoSlot1, CampeaoSlot2, CampeaoSlot3, CampeaoSlot4, CampeaoSlot5};
        maoCampeao = Arrays.asList(maoCampeao0);
    }

    //REPOSICAO DE CARTAS DO CAMPEAO
    public void ReposicaoCampeao(){
        if (maoCampeao.contains("Sem carta")) {

            //Repor as cartas
            int reposicao = maoCampeao.indexOf("Sem carta");

            if (reposicao == 0) {
                CampeaoSlot1 = cartas[(int) (Math.random() * 8)];
            }
            if (reposicao == 1) {
                CampeaoSlot2 = cartas[(int) (Math.random() * 8)];
            }
            if (reposicao == 2) {
                CampeaoSlot3 = cartas[(int) (Math.random() * 8)];
            }
            if (reposicao == 3) {
                CampeaoSlot4 = cartas[(int) (Math.random() * 8)];
            }
            if (reposicao == 4) {
                CampeaoSlot5 = cartas[(int) (Math.random() * 8)];
            }
            maoCampeao0 = new String[]{CampeaoSlot1, CampeaoSlot2, CampeaoSlot3, CampeaoSlot4, CampeaoSlot5};
            maoCampeao = Arrays.asList(maoCampeao0);
        }
    }

    //METODO DE SORTEIO CARTAS DO INIMIGO
    public void SorteioCartasInimigo() {

        if (InimigoSlot1.equals("vazio")) {

            //Sorteio cartas inimigo
            InimigoSlot1 = cartasInimigo[(int) (Math.random() * 8)];
            InimigoSlot2 = cartasInimigo[(int) (Math.random() * 8)];
            InimigoSlot3 = cartasInimigo[(int) (Math.random() * 8)];
            InimigoSlot4 = cartasInimigo[(int) (Math.random() * 8)];
            InimigoSlot5 = cartasInimigo[(int) (Math.random() * 8)];
        }

        maoInimigo0 = new String[]{InimigoSlot1, InimigoSlot2, InimigoSlot3, InimigoSlot4, InimigoSlot5};
        maoInimigo = Arrays.asList(maoInimigo0);
    }

    //REPOSICAO DE CARTAS DO INIMIGO
    public void ReposicaoInimigo(){
        if (maoInimigo.contains("Sem carta")) {
            //Repor as cartas - INIMIGO
            int reposicaoInimigo = maoInimigo.indexOf("Sem carta");

            if (reposicaoInimigo == 0) {
                InimigoSlot1 = cartas[(int) (Math.random() * 8)];
            }
            if (reposicaoInimigo == 1) {
                InimigoSlot2 = cartas[(int) (Math.random() * 8)];
            }
            if (reposicaoInimigo == 2) {
                InimigoSlot3 = cartas[(int) (Math.random() * 8)];
            }
            if (reposicaoInimigo == 3) {
                InimigoSlot4 = cartas[(int) (Math.random() * 8)];
            }
            if (reposicaoInimigo == 4) {
                InimigoSlot5 = cartas[(int) (Math.random() * 8)];
            }

            maoInimigo0 = new String[]{InimigoSlot1, InimigoSlot2, InimigoSlot3, InimigoSlot4, InimigoSlot5};
            maoInimigo = Arrays.asList(maoInimigo0);
        }
    }
}
