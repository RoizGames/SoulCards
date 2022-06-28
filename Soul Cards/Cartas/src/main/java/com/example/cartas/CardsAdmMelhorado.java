package com.example.cartas;

import java.util.*;

public class CardsAdmMelhorado {

    public String hpCampeaoShow;
    public String hpInimigoShow;

    //CARTAS
    static Random carta = new Random();

    //ULTIMA CARTA JOGADA
    public static int ultimaCartaCampeao;
    public static int ultimaCartaInimigo;

    static List<Integer> maoCampeao;
    static List<Integer> maoInimigo;


    //MATRIZES CAMPEAO


    //SLOTS INIMIGO


    //MATRIZES INIMIGO


    static Campeao campeao = new Campeao();
    static Inimigo inimigo = new Inimigo();

    static CartaObjetos acao = new CartaObjetos();


    public static int Escolha;

    //METODO DE SORTEIO CARTAS DO CAMPEAO
    static Integer[] arr = new Integer[5];

    public static void SorteioCartasCampeao() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 17 + 1);

        }
        maoCampeao = Arrays.asList(arr);
    }

    //REPOSICAO DE CARTAS DO CAMPEAO
    public static void ReposicaoCampeao() {
        maoCampeao.set(maoCampeao.indexOf(0), (int) (Math.random() * 17+1));
    }

    //METODO DE SORTEIO CARTAS DO INIMIGO
    public void SorteioCartasInimigo() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 17 + 1);

        }
        maoInimigo = Arrays.asList(arr);
    }

    public static void DeleteCampeao(){
        maoCampeao.set(maoCampeao.indexOf(Escolha),0);
    }

    public static void DeleteInimigo(){
        maoInimigo.set(maoInimigo.indexOf(ultimaCartaInimigo),0);
    }

    //REPOSICAO DE CARTAS DO INIMIGO
    public void ReposicaoInimigo() {
        maoInimigo.set(maoInimigo.indexOf(0), (int) (Math.random() * 17+1));
    }

    public static void Batalha() {
        if(maoCampeao.contains(Escolha)) {
            switch (Escolha) {
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
            ultimaCartaCampeao = Escolha;
        }
    }
    public void AtaqueInimigo() {
        //NIVEIS DE HP
        boolean hpCampeaoBaixo = campeao.hp<=10;
        boolean hpCampeaoMedio = campeao.hp>=11 && campeao.hp<=19;
        boolean hpCampeaoAlto = campeao.hp>=20;

        boolean hpInimigoBaixo = Inimigo.hpInimigo<=10;
        boolean hpInimigoMedio = Inimigo.hpInimigo>=11 && Inimigo.hpInimigo<=19;
        boolean hpInimigoAlto = Inimigo.hpInimigo>=20;

        //HUMOR
        boolean raiva;
        boolean ansiedade;

        //ESTRATEGIA
        boolean estrategia1;
        boolean estrategia2;

        //NIVEIS DE ENERGIA
        boolean energiaBaixa = inimigo.getEnergiaEnemy()<=1;
        boolean energiaMedia = inimigo.getEnergiaEnemy()>1 && inimigo.getEnergiaEnemy()<=6;
        boolean energiaAlta = inimigo.getEnergiaEnemy()>7;

        if(energiaBaixa){

        }else if(energiaMedia){

        }else if(energiaAlta){

        }
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,11);

        System.out.println(inRange(list, 0, 10));
    }

    private static boolean inRange(List<Integer> list, int min, int max) {
        return list.stream().allMatch(i -> i >= min && i <= max);
    }

    }

