package com.example.cartas;

import java.util.Arrays;
import java.util.List;

public class CardsAdm {

    public String hpCampeaoShow;
    public String hpInimigoShow;

    //CARTAS
    public String Carta1 = "Carta1";
    public String Carta2 = "Carta2";
    public String Carta3 = "Carta3";
    public String Carta4 = "Carta4";
    public String Carta5 = "Carta5";
    public String Carta6 = "Carta6";
    public String Carta7 = "Carta7";
    public String Carta8 = "Carta8";

    //ULTIMA CARTA JOGADA
    public String ultimaCartaCampeao = null;
    public String ultimaCartaInimigo = null;



    //SLOTS CAMPEAO
    public String CampeaoSlot1 = "vazio";
    public String CampeaoSlot2 = "vazio";
    public String CampeaoSlot3 = "vazio";
    public String CampeaoSlot4 = "vazio";
    public String CampeaoSlot5 = "vazio";

    public int[] dsa = {1 - 5};

    //MATRIZES CAMPEAO
    public String[] cartas = {Carta1, Carta2, Carta3, Carta4, Carta5, Carta6, Carta7, Carta8};
    public String[] maoCampeao0 = {CampeaoSlot1, CampeaoSlot2, CampeaoSlot3, CampeaoSlot4, CampeaoSlot5};
    public static List<String> maoCampeao = Arrays.asList();

    //SLOTS INIMIGO
    public String InimigoSlot1 = "vazio";
    public String InimigoSlot2 = "vazio";
    public String InimigoSlot3 = "vazio";
    public String InimigoSlot4 = "vazio";
    public String InimigoSlot5 = "vazio";

    //MATRIZES INIMIGO
    public String[] cartasInimigo = {Carta1, Carta2, Carta3, Carta4, Carta5, Carta6, Carta7, Carta8};

    public String[] maoInimigo0 = {InimigoSlot1, InimigoSlot2, InimigoSlot3, InimigoSlot4, InimigoSlot5};

    public List<String> maoInimigo = Arrays.asList(maoInimigo0);

    
    Campeao champ = new Campeao();
    Inimigo enemy = new Inimigo();


    public String Escolha;

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

    public void Batalha(){
        int encontrado = 1;
        if (maoCampeao.contains(Carta1) && (Escolha.equals(Carta1)) && (encontrado == 1)) {
            enemy.hpInimigo = enemy.hpInimigo - 1;
            encontrado = 0;

            ultimaCartaCampeao = Carta1;
        }
        if (maoCampeao.contains(Carta2) && (Escolha.equals(Carta2)) && (encontrado == 1)) {
            enemy.hpInimigo = enemy.hpInimigo - 2;
            encontrado = 0;

            ultimaCartaCampeao = Carta2;
        }
        if (maoCampeao.contains(Carta3) && (Escolha.equals(Carta3)) && (encontrado == 1)) {
            enemy.hpInimigo = enemy.hpInimigo - 3;
            encontrado = 0;

            ultimaCartaCampeao = Carta3;
        }
        if (maoCampeao.contains(Carta4) && (Escolha.equals(Carta4)) && (encontrado == 1)) {
            enemy.hpInimigo = enemy.hpInimigo - 4;
            encontrado = 0;

            ultimaCartaCampeao = Carta4;
        }
        if (maoCampeao.contains(Carta5) && (Escolha.equals(Carta5)) && (encontrado == 1)) {
            enemy.hpInimigo = enemy.hpInimigo - 5;
            encontrado = 0;

            ultimaCartaCampeao = Carta5;
        }
        if (maoCampeao.contains(Carta6) && (Escolha.equals(Carta6)) && (encontrado == 1)) {
            enemy.hpInimigo = enemy.hpInimigo - 6;
            encontrado = 0;

            ultimaCartaCampeao = Carta6;
        }
        if (maoCampeao.contains(Carta7) && (Escolha.equals(Carta7)) && (encontrado == 1)) {
            enemy.hpInimigo = enemy.hpInimigo - 7;
            encontrado = 0;

            ultimaCartaCampeao = Carta7;
        }
        if (maoCampeao.contains(Carta8) && (Escolha.equals(Carta8)) && (encontrado == 1)) {
            enemy.hpInimigo = enemy.hpInimigo - 8;
            encontrado = 0;

            ultimaCartaCampeao = Carta8;
        }
        if (encontrado == 1) {
            System.out.println("Carta inexistente.");
        }
        hpInimigoShow = String.valueOf(enemy.hpInimigo);

        int delete = maoCampeao.indexOf(ultimaCartaCampeao);
        int deleteOk = 0;
        if(delete==0){
            CampeaoSlot1 = "Sem carta";
            deleteOk = 1;
        }
        if(delete==1 &&  deleteOk == 0){
            CampeaoSlot2 = "Sem carta";
            deleteOk = 1;
        }
        if(delete==2 &&  deleteOk == 0){
            CampeaoSlot3 = "Sem carta";
            deleteOk = 1;
        }
        if(delete==3 &&  deleteOk == 0){
            CampeaoSlot4 = "Sem carta";
            deleteOk = 1;
        }
        if(delete==4 &&  deleteOk == 0){
            CampeaoSlot5 = "Sem carta";
        }
        maoCampeao0 = new String[]{CampeaoSlot1, CampeaoSlot2, CampeaoSlot3, CampeaoSlot4, CampeaoSlot5};
        maoCampeao = Arrays.asList(maoCampeao0);

    }
    public void AtaqueInimigo(){
        int encontrado = 0;
        if (Escolha.equals(Carta1) && (encontrado == 0)) {
            if (maoInimigo.contains(Carta1)) {
                champ.hp = champ.hp - 1;
                System.out.println("Inimigo usou a Carta1.");
                System.out.println("Seu champ.hp agora está em: " + champ.hp);

                ultimaCartaInimigo = Carta1;
            } else {
                if (maoInimigo.contains(Carta2)) {
                    champ.hp = champ.hp - 2;
                    System.out.println("Inimigo usou a Carta2.");
                    System.out.println("Seu champ.hp agora está em: " + champ.hp);

                    ultimaCartaInimigo = Carta2;
                } else {
                    if (maoInimigo.contains(Carta3)) {
                        champ.hp = champ.hp - 3;
                        System.out.println("Inimigo usou a Carta3.");
                        System.out.println("Seu champ.hp agora está em: " + champ.hp);

                        ultimaCartaInimigo = Carta3;
                    } else {
                        if (maoInimigo.contains(Carta4)) {
                            champ.hp = champ.hp - 4;
                            System.out.println("Inimigo usou a Carta4.");
                            System.out.println("Seu champ.hp agora está em: " + champ.hp);

                            ultimaCartaInimigo = Carta4;
                        } else {
                            if (maoInimigo.contains(Carta5)) {
                                champ.hp = champ.hp - 5;
                                System.out.println("Inimigo usou a Carta5.");
                                System.out.println("Seu champ.hp agora está em: " + champ.hp);

                                ultimaCartaInimigo = Carta5;
                            } else {
                                if (maoInimigo.contains(Carta6)) {
                                    champ.hp = champ.hp - 6;
                                    System.out.println("Inimigo usou a Carta6.");
                                    System.out.println("Seu champ.hp agora está em: " + champ.hp);

                                    ultimaCartaInimigo = Carta6;
                                } else {
                                    if (maoInimigo.contains(Carta7)) {
                                        champ.hp = champ.hp - 7;
                                        System.out.println("Inimigo usou a Carta7.");
                                        System.out.println("Seu champ.hp agora está em: " + champ.hp);

                                        ultimaCartaInimigo = Carta7;
                                    } else {
                                        if (maoInimigo.contains(Carta8)) {
                                            champ.hp = champ.hp - 8;
                                            System.out.println("Inimigo usou a Carta8.");
                                            System.out.println("Seu champ.hp agora está em: " + champ.hp);

                                            ultimaCartaInimigo = Carta8;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }


        }

        if (Escolha.equals(Carta2) && (encontrado == 0)) {
            if (maoInimigo.contains(Carta1)) {
                champ.hp = champ.hp - 1;
                System.out.println("Inimigo usou a Carta1.");
                System.out.println("Seu champ.hp agora está em: " + champ.hp);

                ultimaCartaInimigo = Carta1;
            } else {
                if (maoInimigo.contains(Carta2)) {
                    champ.hp = champ.hp - 2;
                    System.out.println("Inimigo usou a Carta2.");
                    System.out.println("Seu champ.hp agora está em: " + champ.hp);

                    ultimaCartaInimigo = Carta2;
                } else {
                    if (maoInimigo.contains(Carta3)) {
                        champ.hp = champ.hp - 3;
                        System.out.println("Inimigo usou a Carta3.");
                        System.out.println("Seu champ.hp agora está em: " + champ.hp);

                        ultimaCartaInimigo = Carta3;
                    } else {
                        if (maoInimigo.contains(Carta4)) {
                            champ.hp = champ.hp - 4;
                            System.out.println("Inimigo usou a Carta4.");
                            System.out.println("Seu champ.hp agora está em: " + champ.hp);

                            ultimaCartaInimigo = Carta4;
                        } else {
                            if (maoInimigo.contains(Carta5)) {
                                champ.hp = champ.hp - 5;
                                System.out.println("Inimigo usou a Carta5.");
                                System.out.println("Seu champ.hp agora está em: " + champ.hp);

                                ultimaCartaInimigo = Carta5;
                            } else {
                                if (maoInimigo.contains(Carta6)) {
                                    champ.hp = champ.hp - 6;
                                    System.out.println("Inimigo usou a Carta6.");
                                    System.out.println("Seu champ.hp agora está em: " + champ.hp);

                                    ultimaCartaInimigo = Carta6;
                                } else {
                                    if (maoInimigo.contains(Carta7)) {
                                        champ.hp = champ.hp - 7;
                                        System.out.println("Inimigo usou a Carta7.");
                                        System.out.println("Seu champ.hp agora está em: " + champ.hp);

                                        ultimaCartaInimigo = Carta7;
                                    } else {
                                        if (maoInimigo.contains(Carta8)) {
                                            champ.hp = champ.hp - 8;
                                            System.out.println("Inimigo usou a Carta8.");
                                            System.out.println("Seu champ.hp agora está em: " + champ.hp);

                                            ultimaCartaInimigo = Carta8;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (Escolha.equals(Carta3) && (encontrado == 0)) {
            if (maoInimigo.contains(Carta1)) {
                champ.hp = champ.hp - 1;
                System.out.println("Inimigo usou a Carta1.");
                System.out.println("Seu champ.hp agora está em: " + champ.hp);

                ultimaCartaInimigo = Carta1;
            } else {
                if (maoInimigo.contains(Carta2)) {
                    champ.hp = champ.hp - 2;
                    System.out.println("Inimigo usou a Carta2.");
                    System.out.println("Seu champ.hp agora está em: " + champ.hp);

                    ultimaCartaInimigo = Carta2;
                } else {
                    if (maoInimigo.contains(Carta3)) {
                        champ.hp = champ.hp - 3;
                        System.out.println("Inimigo usou a Carta3.");
                        System.out.println("Seu champ.hp agora está em: " + champ.hp);

                        ultimaCartaInimigo = Carta3;
                    } else {
                        if (maoInimigo.contains(Carta4)) {
                            champ.hp = champ.hp - 4;
                            System.out.println("Inimigo usou a Carta4.");
                            System.out.println("Seu champ.hp agora está em: " + champ.hp);

                            ultimaCartaInimigo = Carta4;
                        } else {
                            if (maoInimigo.contains(Carta5)) {
                                champ.hp = champ.hp - 5;
                                System.out.println("Inimigo usou a Carta5.");
                                System.out.println("Seu champ.hp agora está em: " + champ.hp);

                                ultimaCartaInimigo = Carta5;
                            } else {
                                if (maoInimigo.contains(Carta6)) {
                                    champ.hp = champ.hp - 6;
                                    System.out.println("Inimigo usou a Carta6.");
                                    System.out.println("Seu champ.hp agora está em: " + champ.hp);

                                    ultimaCartaInimigo = Carta6;
                                } else {
                                    if (maoInimigo.contains(Carta7)) {
                                        champ.hp = champ.hp - 7;
                                        System.out.println("Inimigo usou a Carta7.");
                                        System.out.println("Seu champ.hp agora está em: " + champ.hp);

                                        ultimaCartaInimigo = Carta7;
                                    } else {
                                        if (maoInimigo.contains(Carta8)) {
                                            champ.hp = champ.hp - 8;
                                            System.out.println("Inimigo usou a Carta8.");
                                            System.out.println("Seu champ.hp agora está em: " + champ.hp);

                                            ultimaCartaInimigo = Carta8;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (Escolha.equals(Carta4) && (encontrado == 0)) {
            if (maoInimigo.contains(Carta1)) {
                champ.hp = champ.hp - 1;
                System.out.println("Inimigo usou a Carta1.");
                System.out.println("Seu champ.hp agora está em: " + champ.hp);

                ultimaCartaInimigo = Carta1;
            } else {
                if (maoInimigo.contains(Carta2)) {
                    champ.hp = champ.hp - 2;
                    System.out.println("Inimigo usou a Carta2.");
                    System.out.println("Seu champ.hp agora está em: " + champ.hp);

                    ultimaCartaInimigo = Carta2;
                } else {
                    if (maoInimigo.contains(Carta3)) {
                        champ.hp = champ.hp - 3;
                        System.out.println("Inimigo usou a Carta3.");
                        System.out.println("Seu champ.hp agora está em: " + champ.hp);

                        ultimaCartaInimigo = Carta3;
                    } else {
                        if (maoInimigo.contains(Carta4)) {
                            champ.hp = champ.hp - 4;
                            System.out.println("Inimigo usou a Carta4.");
                            System.out.println("Seu champ.hp agora está em: " + champ.hp);

                            ultimaCartaInimigo = Carta4;
                        } else {
                            if (maoInimigo.contains(Carta5)) {
                                champ.hp = champ.hp - 5;
                                System.out.println("Inimigo usou a Carta5.");
                                System.out.println("Seu champ.hp agora está em: " + champ.hp);

                                ultimaCartaInimigo = Carta5;
                            } else {
                                if (maoInimigo.contains(Carta6)) {
                                    champ.hp = champ.hp - 6;
                                    System.out.println("Inimigo usou a Carta6.");
                                    System.out.println("Seu champ.hp agora está em: " + champ.hp);

                                    ultimaCartaInimigo = Carta6;
                                } else {
                                    if (maoInimigo.contains(Carta7)) {
                                        champ.hp = champ.hp - 7;
                                        System.out.println("Inimigo usou a Carta7.");
                                        System.out.println("Seu champ.hp agora está em: " + champ.hp);

                                        ultimaCartaInimigo = Carta7;
                                    } else {
                                        if (maoInimigo.contains(Carta8)) {
                                            champ.hp = champ.hp - 8;
                                            System.out.println("Inimigo usou a Carta8.");
                                            System.out.println("Seu champ.hp agora está em: " + champ.hp);

                                            ultimaCartaInimigo = Carta8;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (Escolha.equals(Carta5) && (encontrado == 0)) {
            if (maoInimigo.contains(Carta1)) {
                champ.hp = champ.hp - 1;
                System.out.println("Inimigo usou a Carta1.");
                System.out.println("Seu champ.hp agora está em: " + champ.hp);

                ultimaCartaInimigo = Carta1;
            } else {
                if (maoInimigo.contains(Carta2)) {
                    champ.hp = champ.hp - 2;
                    System.out.println("Inimigo usou a Carta2.");
                    System.out.println("Seu champ.hp agora está em: " + champ.hp);

                    ultimaCartaInimigo = Carta2;
                } else {
                    if (maoInimigo.contains(Carta3)) {
                        champ.hp = champ.hp - 3;
                        System.out.println("Inimigo usou a Carta3.");
                        System.out.println("Seu champ.hp agora está em: " + champ.hp);

                        ultimaCartaInimigo = Carta3;
                    } else {
                        if (maoInimigo.contains(Carta4)) {
                            champ.hp = champ.hp - 4;
                            System.out.println("Inimigo usou a Carta4.");
                            System.out.println("Seu champ.hp agora está em: " + champ.hp);

                            ultimaCartaInimigo = Carta4;
                        } else {
                            if (maoInimigo.contains(Carta5)) {
                                champ.hp = champ.hp - 5;
                                System.out.println("Inimigo usou a Carta5.");
                                System.out.println("Seu champ.hp agora está em: " + champ.hp);

                                ultimaCartaInimigo = Carta5;
                            } else {
                                if (maoInimigo.contains(Carta6)) {
                                    champ.hp = champ.hp - 6;
                                    System.out.println("Inimigo usou a Carta6.");
                                    System.out.println("Seu champ.hp agora está em: " + champ.hp);

                                    ultimaCartaInimigo = Carta6;
                                } else {
                                    if (maoInimigo.contains(Carta7)) {
                                        champ.hp = champ.hp - 7;
                                        System.out.println("Inimigo usou a Carta7.");
                                        System.out.println("Seu champ.hp agora está em: " + champ.hp);

                                        ultimaCartaInimigo = Carta7;
                                    } else {
                                        if (maoInimigo.contains(Carta8)) {
                                            champ.hp = champ.hp - 8;
                                            System.out.println("Inimigo usou a Carta8.");
                                            System.out.println("Seu champ.hp agora está em: " + champ.hp);

                                            ultimaCartaInimigo = Carta8;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (Escolha.equals(Carta6) && (encontrado == 0)) {
            if (maoInimigo.contains(Carta1)) {
                champ.hp = champ.hp - 1;
                System.out.println("Inimigo usou a Carta1.");
                System.out.println("Seu champ.hp agora está em: " + champ.hp);

                ultimaCartaInimigo = Carta1;
            } else {
                if (maoInimigo.contains(Carta2)) {
                    champ.hp = champ.hp - 2;
                    System.out.println("Inimigo usou a Carta2.");
                    System.out.println("Seu champ.hp agora está em: " + champ.hp);

                    ultimaCartaInimigo = Carta2;
                } else {
                    if (maoInimigo.contains(Carta3)) {
                        champ.hp = champ.hp - 3;
                        System.out.println("Inimigo usou a Carta3.");
                        System.out.println("Seu champ.hp agora está em: " + champ.hp);

                        ultimaCartaInimigo = Carta3;
                    } else {
                        if (maoInimigo.contains(Carta4)) {
                            champ.hp = champ.hp - 4;
                            System.out.println("Inimigo usou a Carta4.");
                            System.out.println("Seu champ.hp agora está em: " + champ.hp);

                            ultimaCartaInimigo = Carta4;
                        } else {
                            if (maoInimigo.contains(Carta5)) {
                                champ.hp = champ.hp - 5;
                                System.out.println("Inimigo usou a Carta5.");
                                System.out.println("Seu champ.hp agora está em: " + champ.hp);

                                ultimaCartaInimigo = Carta5;
                            } else {
                                if (maoInimigo.contains(Carta6)) {
                                    champ.hp = champ.hp - 6;
                                    System.out.println("Inimigo usou a Carta6.");
                                    System.out.println("Seu champ.hp agora está em: " + champ.hp);

                                    ultimaCartaInimigo = Carta6;
                                } else {
                                    if (maoInimigo.contains(Carta7)) {
                                        champ.hp = champ.hp - 7;
                                        System.out.println("Inimigo usou a Carta7.");
                                        System.out.println("Seu champ.hp agora está em: " + champ.hp);

                                        ultimaCartaInimigo = Carta7;
                                    } else {
                                        if (maoInimigo.contains(Carta8)) {
                                            champ.hp = champ.hp - 8;
                                            System.out.println("Inimigo usou a Carta8.");
                                            System.out.println("Seu champ.hp agora está em: " + champ.hp);

                                            ultimaCartaInimigo = Carta8;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (Escolha.equals(Carta7) && (encontrado == 0)) {
            if (maoInimigo.contains(Carta1)) {
                champ.hp = champ.hp - 1;
                System.out.println("Inimigo usou a Carta1.");
                System.out.println("Seu champ.hp agora está em: " + champ.hp);

                ultimaCartaInimigo = Carta1;
            } else {
                if (maoInimigo.contains(Carta2)) {
                    champ.hp = champ.hp - 2;
                    System.out.println("Inimigo usou a Carta2.");
                    System.out.println("Seu champ.hp agora está em: " + champ.hp);

                    ultimaCartaInimigo = Carta2;
                } else {
                    if (maoInimigo.contains(Carta3)) {
                        champ.hp = champ.hp - 3;
                        System.out.println("Inimigo usou a Carta3.");
                        System.out.println("Seu champ.hp agora está em: " + champ.hp);

                        ultimaCartaInimigo = Carta3;
                    } else {
                        if (maoInimigo.contains(Carta4)) {
                            champ.hp = champ.hp - 4;
                            System.out.println("Inimigo usou a Carta4.");
                            System.out.println("Seu champ.hp agora está em: " + champ.hp);

                            ultimaCartaInimigo = Carta4;
                        } else {
                            if (maoInimigo.contains(Carta5)) {
                                champ.hp = champ.hp - 5;
                                System.out.println("Inimigo usou a Carta5.");
                                System.out.println("Seu champ.hp agora está em: " + champ.hp);

                                ultimaCartaInimigo = Carta5;
                            } else {
                                if (maoInimigo.contains(Carta6)) {
                                    champ.hp = champ.hp - 6;
                                    System.out.println("Inimigo usou a Carta6.");
                                    System.out.println("Seu champ.hp agora está em: " + champ.hp);

                                    ultimaCartaInimigo = Carta6;
                                } else {
                                    if (maoInimigo.contains(Carta7)) {
                                        champ.hp = champ.hp - 7;
                                        System.out.println("Inimigo usou a Carta7.");
                                        System.out.println("Seu champ.hp agora está em: " + champ.hp);

                                        ultimaCartaInimigo = Carta7;
                                    } else {
                                        if (maoInimigo.contains(Carta8)) {
                                            champ.hp = champ.hp - 8;
                                            System.out.println("Inimigo usou a Carta8.");
                                            System.out.println("Seu champ.hp agora está em: " + champ.hp);

                                            ultimaCartaInimigo = Carta8;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (Escolha.equals(Carta8) && (encontrado == 0)) {
            if (maoInimigo.contains(Carta1)) {
                champ.hp = champ.hp - 1;
                System.out.println("Inimigo usou a Carta1.");
                System.out.println("Seu champ.hp agora está em: " + champ.hp);

                ultimaCartaInimigo = Carta1;
            } else {
                if (maoInimigo.contains(Carta2)) {
                    champ.hp = champ.hp - 2;
                    System.out.println("Inimigo usou a Carta2.");
                    System.out.println("Seu champ.hp agora está em: " + champ.hp);

                    ultimaCartaInimigo = Carta2;
                } else {
                    if (maoInimigo.contains(Carta3)) {
                        champ.hp = champ.hp - 3;
                        System.out.println("Inimigo usou a Carta3.");
                        System.out.println("Seu champ.hp agora está em: " + champ.hp);

                        ultimaCartaInimigo = Carta3;
                    } else {
                        if (maoInimigo.contains(Carta4)) {
                            champ.hp = champ.hp - 4;
                            System.out.println("Inimigo usou a Carta4.");
                            System.out.println("Seu champ.hp agora está em: " + champ.hp);

                            ultimaCartaInimigo = Carta4;
                        } else {
                            if (maoInimigo.contains(Carta5)) {
                                champ.hp = champ.hp - 5;
                                System.out.println("Inimigo usou a Carta5.");
                                System.out.println("Seu champ.hp agora está em: " + champ.hp);

                                ultimaCartaInimigo = Carta5;
                            } else {
                                if (maoInimigo.contains(Carta6)) {
                                    champ.hp = champ.hp - 6;
                                    System.out.println("Inimigo usou a Carta6.");
                                    System.out.println("Seu champ.hp agora está em: " + champ.hp);

                                    ultimaCartaInimigo = Carta6;
                                } else {
                                    if (maoInimigo.contains(Carta7)) {
                                        champ.hp = champ.hp - 7;
                                        System.out.println("Inimigo usou a Carta7.");
                                        System.out.println("Seu champ.hp agora está em: " + champ.hp);

                                        ultimaCartaInimigo = Carta7;
                                    } else {
                                        if (maoInimigo.contains(Carta8)) {
                                            champ.hp = champ.hp - 8;
                                            System.out.println("Inimigo usou a Carta8.");
                                            System.out.println("Seu champ.hp agora está em: " + champ.hp);

                                            ultimaCartaInimigo = Carta8;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        hpCampeaoShow = String.valueOf(champ.hp);

        int deleteInimigo = maoInimigo.indexOf(ultimaCartaInimigo);

        if(deleteInimigo==0){
            InimigoSlot1 = "Sem carta";
        }
        if(deleteInimigo==1){
            InimigoSlot2 = "Sem carta";
        }
        if(deleteInimigo==2){
            InimigoSlot3 = "Sem carta";
        }
        if(deleteInimigo==3){
            InimigoSlot4 = "Sem carta";
        }
        if(deleteInimigo==4){
            InimigoSlot5 = "Sem carta";
        }
    }
    public void AtaqueInimigo2(){
        String Escolha = "";
        int PosseCarta = 0;
        switch (Escolha) {
            case "Carta1":
                switch (PosseCarta){
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case 5:

                        break;
                    case 6:

                        break;
                    case 7:

                        break;
                    case 8:

                        break;

                }
        }

    }

}
