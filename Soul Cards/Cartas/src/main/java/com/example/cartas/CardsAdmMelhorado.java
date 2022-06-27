package com.example.cartas;

import java.lang.reflect.Array;
import java.util.*;

public class CardsAdmMelhorado {

    public String hpCampeaoShow;
    public String hpInimigoShow;

    //CARTAS
    static Random carta = new Random();

    //ULTIMA CARTA JOGADA
    public static String ultimaCartaCampeao = null;
    public String ultimaCartaInimigo = null;



    //SLOTS CAMPEAO
    public static int CampeaoSlot1 = 0;
    public static int CampeaoSlot2 = 0;
    public static int CampeaoSlot3 = 0;
    public static int CampeaoSlot4 = 0;
    public static int CampeaoSlot5 = 0;



    //MATRIZES CAMPEAO
    public static int[] maoCampeao0 = new int[18];

    public static List<int[]> maoCampeao = Arrays.asList();

    //SLOTS INIMIGO
    public static int InimigoSlot1 = 0;
    public static int InimigoSlot2 = 0;
    public static int InimigoSlot3 = 0;
    public static int InimigoSlot4 = 0;
    public static int InimigoSlot5 = 0;

    //MATRIZES INIMIGO

    public static int[] maoInimigo0 = {InimigoSlot1, InimigoSlot2, InimigoSlot3, InimigoSlot4, InimigoSlot5};

    public List<int[]> maoInimigo = Arrays.asList(maoInimigo0);

    
    Campeao champ = new Campeao();
    Inimigo enemy = new Inimigo();

    static CartaObjetos acao = new CartaObjetos();


    public static int Escolha;

    //METODO DE SORTEIO CARTAS DO CAMPEAO
    public static void SorteioCartasCampeao() {

        if (CampeaoSlot1 == 0) {
            //Sorteio Cartas Campeao

            CampeaoSlot1 = carta.nextInt(18);
            CampeaoSlot2 = carta.nextInt(18);
            CampeaoSlot3 = carta.nextInt(18);
            CampeaoSlot4 = carta.nextInt(18);
            CampeaoSlot5 = carta.nextInt(18);

        }

        maoCampeao0 = new int[]{CampeaoSlot1, CampeaoSlot2, CampeaoSlot3, CampeaoSlot4, CampeaoSlot5};
        maoCampeao = Arrays.asList(maoCampeao0);
    }

    //REPOSICAO DE CARTAS DO CAMPEAO
    public void ReposicaoCampeao(){
        if (maoCampeao.contains(0)) {

            //Repor as cartas
            int reposicao = maoCampeao.indexOf(0);

            if (reposicao == 0) {
                CampeaoSlot1 = carta.nextInt(18);
            }
            if (reposicao == 1) {
                CampeaoSlot2 = carta.nextInt(18);
            }
            if (reposicao == 2) {
                CampeaoSlot3 = carta.nextInt(18);
            }
            if (reposicao == 3) {
                CampeaoSlot4 = carta.nextInt(18);
            }
            if (reposicao == 4) {
                CampeaoSlot5 = carta.nextInt(18);
            }
            maoCampeao0 = new int[]{CampeaoSlot1, CampeaoSlot2, CampeaoSlot3, CampeaoSlot4, CampeaoSlot5};
            maoCampeao = Arrays.asList(maoCampeao0);
        }
    }

    //METODO DE SORTEIO CARTAS DO INIMIGO
    public void SorteioCartasInimigo() {

        if (InimigoSlot1 == (0)) {

            //Sorteio cartas inimigo
            InimigoSlot1 = carta.nextInt(18);
            InimigoSlot2 = carta.nextInt(18);
            InimigoSlot3 = carta.nextInt(18);
            InimigoSlot4 = carta.nextInt(18);
            InimigoSlot5 = carta.nextInt(18);

        }

        maoInimigo0 = new int[]{InimigoSlot1, InimigoSlot2, InimigoSlot3, InimigoSlot4, InimigoSlot5};
        maoInimigo = Arrays.asList(maoInimigo0);
    }

    //REPOSICAO DE CARTAS DO INIMIGO
    public void ReposicaoInimigo(){
        if (maoInimigo.contains("Sem carta")) {
            //Repor as cartas - INIMIGO
            int reposicaoInimigo = maoInimigo.indexOf("Sem carta");

            if (reposicaoInimigo == 0) {
                InimigoSlot1 = carta.nextInt(18);
            }
            if (reposicaoInimigo == 1) {
                InimigoSlot2 = carta.nextInt(18);
            }
            if (reposicaoInimigo == 2) {
                InimigoSlot3 = carta.nextInt(18);
            }
            if (reposicaoInimigo == 3) {
                InimigoSlot4 = carta.nextInt(18);
            }
            if (reposicaoInimigo == 4) {
                InimigoSlot5 = carta.nextInt(18);
            }

            maoInimigo0 = new int[]{InimigoSlot1, InimigoSlot2, InimigoSlot3, InimigoSlot4, InimigoSlot5};
            maoInimigo = Arrays.asList(maoInimigo0);
        }
    }

    public static void Batalha(){
        switch (Escolha){

            case 1:
                acao.NaturezaCobre.jogaCarta();
                break;
            case 2:
                acao.NaturezaAluminio.jogaCarta();
            break;
            case 3:
                acao.NaturezaFerro.jogaCarta();
                break;
            case 4:
                acao.NaturezaOuro.jogaCarta();
                break;
            case 5:
                acao.VazioCobre.jogaCarta();
                break;
            case 6:
                acao.VazioAluminio.jogaCarta();
                break;
            case 7:
                acao.VazioFerro.jogaCarta();
                break;
            case 8:
                acao.VazioOuro.jogaCarta();
                break;
            case 9:
                acao.LuzAluminio.jogaCarta();
                break;
            case 10:
                acao.LuzCobre.jogaCarta();
                break;
            case 11:
                acao.LuzFerro.jogaCarta();
                break;
            case 12:
                acao.LuzOuro.jogaCarta();
                break;
            case 13:
                acao.UniversoAluminio.jogaCarta();
                break;
            case 14:
                acao.UniversoCobre.jogaCarta();
                break;
            case 15:
                acao.UniversoFerro.jogaCarta();
                break;
            case 16:
                acao.UniversoOuro.jogaCarta();
                break;
            case 17:
                acao.VazioLuzCobre.jogaCarta();
                break;
            case 18:
                acao.VazioLuzAluminio.jogaCarta();
                break;
        }

    }

    public void AtaqueInimigo(){


                }

    public static void main(String[] args) {

        Integer[] arr = new Integer[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 17+1); // storing random integers in an array
            System.out.println(arr[i]); // printing each array element

        }
        List<Integer> maoInimigo = Arrays.asList(arr);
        System.out.println(maoInimigo);
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha sua carta de 1 a 18:");


        Escolha = sc.nextInt();

        if (maoInimigo.contains(Escolha)) {
            Batalha();
            System.out.println("Vida do campeão: " + acao.campeao.hp);
            System.out.println("Energia do campeão: " + acao.campeao.energia);
            System.out.println("Vida do inimigo: " + acao.inimigo.hpInimigo);
        }
        else {
            System.out.println("SDASD");
        }
    }
}
