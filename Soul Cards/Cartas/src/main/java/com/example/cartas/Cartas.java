package com.example.cartas;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Cartas {
    int round = 0;
    public static void main(String[] args) {
        int hp = 20;
        int hpInimigo = 20;


        String Carta1 = "Carta1";
        String Carta2 = "Carta2";
        String Carta3 = "Carta3";
        String Carta4 = "Carta4";
        String Carta5 = "Carta5";
        String Carta6 = "Carta6";
        String Carta7 = "Carta7";
        String Carta8 = "Carta8";

        String ultimaCarta = null;
        String ultimaCartaInimigo = null;

        String[] cartas = {Carta1,Carta2,Carta3,Carta4,Carta5,Carta6,Carta7,Carta8};
        String[] cartasInimigo = {Carta1,Carta2,Carta3,Carta4,Carta5,Carta6,Carta7,Carta8};

        //CARTAS CAMPEAO
        String cartaCampeao1 = "vazio";
        String cartaCampeao2 = "vazio";
        String cartaCampeao3 = "vazio";
        String cartaCampeao4 = "vazio";
        String cartaCampeao5 = "vazio";

        //CARTAS INIMIGO
        String cartaInimigo1 = "vazio";
        String cartaInimigo2 = "vazio";
        String cartaInimigo3 = "vazio";
        String cartaInimigo4 = "vazio";
        String cartaInimigo5 = "vazio";





        while(hp>0&&hpInimigo>0) {
        if(cartaCampeao1.equals("vazio")) {
            //Sorteio Cartas Campeao
            cartaCampeao1 = cartas[(int) (Math.random() * 8)];
            cartaCampeao2 = cartas[(int) (Math.random() * 8)];
            cartaCampeao3 = cartas[(int) (Math.random() * 8)];
            cartaCampeao4 = cartas[(int) (Math.random() * 8)];
            cartaCampeao5 = cartas[(int) (Math.random() * 8)];
        }
        String[] maoCampeao0 = {cartaCampeao1,cartaCampeao2,cartaCampeao3,cartaCampeao4,cartaCampeao5};

        List<String> maoCampeao = Arrays.asList(maoCampeao0);

        if(cartaInimigo1.equals("vazio")) {

            //Sorteio cartas inimigo
            cartaInimigo1 = cartasInimigo[(int) (Math.random() * 8)];
            cartaInimigo2 = cartasInimigo[(int) (Math.random() * 8)];
            cartaInimigo3 = cartasInimigo[(int) (Math.random() * 8)];
            cartaInimigo4 = cartasInimigo[(int) (Math.random() * 8)];
            cartaInimigo5 = cartasInimigo[(int) (Math.random() * 8)];
        }

        String[] maoInimigo0 = {cartaInimigo1,cartaInimigo2,cartaInimigo3,cartaInimigo4,cartaInimigo5};

        List<String> maoInimigo = Arrays.asList(maoInimigo0);

            if(maoCampeao.contains("Sem carta")){
                //Repor as cartas
                int reposicao = maoCampeao.indexOf("Sem carta");

                if(reposicao==0){
                    cartaCampeao1 = cartas[(int) (Math.random() * 8)];
                    System.out.println("Você ganhou a carta: "+cartaCampeao1);
                }
                if(reposicao==1){
                    cartaCampeao2 = cartas[(int) (Math.random() * 8)];
                    System.out.println("Você ganhou a carta: "+cartaCampeao2);
                }
                if(reposicao==2){
                    cartaCampeao3 = cartas[(int) (Math.random() * 8)];
                    System.out.println("Você ganhou a carta: "+cartaCampeao3);
                }
                if(reposicao==3){
                    cartaCampeao4 = cartas[(int) (Math.random() * 8)];
                    System.out.println("Você ganhou a carta: "+cartaCampeao4);
                }
                if(reposicao==4){
                    cartaCampeao5 = cartas[(int) (Math.random() * 8)];
                    System.out.println("Você ganhou a carta: "+cartaCampeao5);
                }
                maoCampeao0 = new String[]{cartaCampeao1, cartaCampeao2, cartaCampeao3, cartaCampeao4, cartaCampeao5};
                maoCampeao = Arrays.asList(maoCampeao0);
                System.out.println("-------------------------------------------------------------------------------");
            }
            if(maoInimigo.contains("Sem carta")){
                //Repor as cartas - INIMIGO
                int reposicaoInimigo = maoInimigo.indexOf("Sem carta");

                if(reposicaoInimigo==0){
                    cartaInimigo1 = cartas[(int) (Math.random() * 8)];
                }
                if(reposicaoInimigo==1){
                    cartaInimigo2 = cartas[(int) (Math.random() * 8)];
                }
                if(reposicaoInimigo==2){
                    cartaInimigo3 = cartas[(int) (Math.random() * 8)];
                }
                if(reposicaoInimigo==3){
                    cartaInimigo4 = cartas[(int) (Math.random() * 8)];
                }
                if(reposicaoInimigo==4){
                    cartaInimigo5 = cartas[(int) (Math.random() * 8)];
                }
                maoInimigo0 = new String[]{cartaInimigo1, cartaInimigo2, cartaInimigo3, cartaInimigo4, cartaInimigo5};
                maoInimigo = Arrays.asList(maoInimigo0);

            }

            System.out.println("Suas Cartas são: "+maoCampeao);
            System.out.println("Digite sua carta a seguir:");
            Scanner cartaEscolha = new Scanner(System.in);

            String Escolha;
            int encontrado = 1;

            Escolha = cartaEscolha.nextLine();
            System.out.println("-------------------------------------------------------------------------------");
            if (maoCampeao.contains(Carta1) && (Escolha.equals(Carta1)) && (encontrado == 1)) {
                hpInimigo = hpInimigo - 1;
                System.out.println("Você deu 1 de dano no seu inimigo: HP inimigo:" + hpInimigo);
                encontrado = 0;

                ultimaCarta = Carta1;
            }
            if (maoCampeao.contains(Carta2) && (Escolha.equals(Carta2)) && (encontrado == 1)) {
                hpInimigo = hpInimigo - 2;
                System.out.println("Você deu 2 de dano no seu inimigo: HP inimigo:" + hpInimigo);
                encontrado = 0;

                ultimaCarta = Carta2;

            }
            if (maoCampeao.contains(Carta3) && (Escolha.equals(Carta3)) && (encontrado == 1)) {
                hpInimigo = hpInimigo - 3;
                System.out.println("Você deu 3 de dano no seu inimigo: HP inimigo:" + hpInimigo);
                encontrado = 0;

                ultimaCarta = Carta3;
            }
            if (maoCampeao.contains(Carta4) && (Escolha.equals(Carta4)) && (encontrado == 1)) {
                hpInimigo = hpInimigo - 4;
                System.out.println("Você deu 4 de dano no seu inimigo: HP inimigo:" + hpInimigo);
                encontrado = 0;

                ultimaCarta = Carta4;
            }
            if (maoCampeao.contains(Carta5) && (Escolha.equals(Carta5)) && (encontrado == 1)) {
                hpInimigo = hpInimigo - 5;
                System.out.println("Você deu 5 de dano no seu inimigo: HP inimigo:" + hpInimigo);
                encontrado = 0;

                ultimaCarta = Carta5;
            }
            if (maoCampeao.contains(Carta6) && (Escolha.equals(Carta6)) && (encontrado == 1)) {
                hpInimigo = hpInimigo - 6;
                System.out.println("Você deu 6 de dano no seu inimigo: HP inimigo:" + hpInimigo);
                encontrado = 0;

                ultimaCarta = Carta6;
            }
            if (maoCampeao.contains(Carta7) && (Escolha.equals(Carta7)) && (encontrado == 1)) {
                hpInimigo = hpInimigo - 7;
                System.out.println("Você deu 7 de dano no seu inimigo: HP inimigo:" + hpInimigo);
                encontrado = 0;

                ultimaCarta = Carta7;
            }
            if (maoCampeao.contains(Carta8) && (Escolha.equals(Carta8)) && (encontrado == 1)) {
                hpInimigo = hpInimigo - 8;
                System.out.println("Você deu 8 de dano no seu inimigo: HP inimigo:" + hpInimigo);
                encontrado = 0;

                ultimaCarta = Carta8;
            }
            if (encontrado == 1) {
                System.out.println("Carta inexistente.");
            }
            System.out.println("-------------------------------------------------------------------------------");
            //Resposta do inimigo
            if (Escolha.equals(Carta1) && (encontrado == 0)) {
                if (maoInimigo.contains(Carta1)) {
                    hp = hp - 1;
                    System.out.println("Inimigo usou a Carta1.");
                    System.out.println("Seu HP agora está em: " + hp);

                    ultimaCartaInimigo = Carta1;
                } else {
                    if (maoInimigo.contains(Carta2)) {
                        hp = hp - 2;
                        System.out.println("Inimigo usou a Carta2.");
                        System.out.println("Seu HP agora está em: " + hp);

                        ultimaCartaInimigo = Carta2;
                    } else {
                        if (maoInimigo.contains(Carta3)) {
                            hp = hp - 3;
                            System.out.println("Inimigo usou a Carta3.");
                            System.out.println("Seu HP agora está em: " + hp);

                            ultimaCartaInimigo = Carta3;
                        } else {
                            if (maoInimigo.contains(Carta4)) {
                                hp = hp - 4;
                                System.out.println("Inimigo usou a Carta4.");
                                System.out.println("Seu HP agora está em: " + hp);

                                ultimaCartaInimigo = Carta4;
                            } else {
                                if (maoInimigo.contains(Carta5)) {
                                    hp = hp - 5;
                                    System.out.println("Inimigo usou a Carta5.");
                                    System.out.println("Seu HP agora está em: " + hp);

                                    ultimaCartaInimigo = Carta5;
                                } else {
                                    if (maoInimigo.contains(Carta6)) {
                                        hp = hp - 6;
                                        System.out.println("Inimigo usou a Carta6.");
                                        System.out.println("Seu HP agora está em: " + hp);

                                        ultimaCartaInimigo = Carta6;
                                    } else {
                                        if (maoInimigo.contains(Carta7)) {
                                            hp = hp - 7;
                                            System.out.println("Inimigo usou a Carta7.");
                                            System.out.println("Seu HP agora está em: " + hp);

                                            ultimaCartaInimigo = Carta7;
                                        } else {
                                            if (maoInimigo.contains(Carta8)) {
                                                hp = hp - 8;
                                                System.out.println("Inimigo usou a Carta8.");
                                                System.out.println("Seu HP agora está em: " + hp);

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
                    hp = hp - 1;
                    System.out.println("Inimigo usou a Carta1.");
                    System.out.println("Seu HP agora está em: " + hp);

                    ultimaCartaInimigo = Carta1;
                } else {
                    if (maoInimigo.contains(Carta2)) {
                        hp = hp - 2;
                        System.out.println("Inimigo usou a Carta2.");
                        System.out.println("Seu HP agora está em: " + hp);

                        ultimaCartaInimigo = Carta2;
                    } else {
                        if (maoInimigo.contains(Carta3)) {
                            hp = hp - 3;
                            System.out.println("Inimigo usou a Carta3.");
                            System.out.println("Seu HP agora está em: " + hp);

                            ultimaCartaInimigo = Carta3;
                        } else {
                            if (maoInimigo.contains(Carta4)) {
                                hp = hp - 4;
                                System.out.println("Inimigo usou a Carta4.");
                                System.out.println("Seu HP agora está em: " + hp);

                                ultimaCartaInimigo = Carta4;
                            } else {
                                if (maoInimigo.contains(Carta5)) {
                                    hp = hp - 5;
                                    System.out.println("Inimigo usou a Carta5.");
                                    System.out.println("Seu HP agora está em: " + hp);

                                    ultimaCartaInimigo = Carta5;
                                } else {
                                    if (maoInimigo.contains(Carta6)) {
                                        hp = hp - 6;
                                        System.out.println("Inimigo usou a Carta6.");
                                        System.out.println("Seu HP agora está em: " + hp);

                                        ultimaCartaInimigo = Carta6;
                                    } else {
                                        if (maoInimigo.contains(Carta7)) {
                                            hp = hp - 7;
                                            System.out.println("Inimigo usou a Carta7.");
                                            System.out.println("Seu HP agora está em: " + hp);

                                            ultimaCartaInimigo = Carta7;
                                        } else {
                                            if (maoInimigo.contains(Carta8)) {
                                                hp = hp - 8;
                                                System.out.println("Inimigo usou a Carta8.");
                                                System.out.println("Seu HP agora está em: " + hp);

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
                    hp = hp - 1;
                    System.out.println("Inimigo usou a Carta1.");
                    System.out.println("Seu HP agora está em: " + hp);

                    ultimaCartaInimigo = Carta1;
                } else {
                    if (maoInimigo.contains(Carta2)) {
                        hp = hp - 2;
                        System.out.println("Inimigo usou a Carta2.");
                        System.out.println("Seu HP agora está em: " + hp);

                        ultimaCartaInimigo = Carta2;
                    } else {
                        if (maoInimigo.contains(Carta3)) {
                            hp = hp - 3;
                            System.out.println("Inimigo usou a Carta3.");
                            System.out.println("Seu HP agora está em: " + hp);

                            ultimaCartaInimigo = Carta3;
                        } else {
                            if (maoInimigo.contains(Carta4)) {
                                hp = hp - 4;
                                System.out.println("Inimigo usou a Carta4.");
                                System.out.println("Seu HP agora está em: " + hp);

                                ultimaCartaInimigo = Carta4;
                            } else {
                                if (maoInimigo.contains(Carta5)) {
                                    hp = hp - 5;
                                    System.out.println("Inimigo usou a Carta5.");
                                    System.out.println("Seu HP agora está em: " + hp);

                                    ultimaCartaInimigo = Carta5;
                                } else {
                                    if (maoInimigo.contains(Carta6)) {
                                        hp = hp - 6;
                                        System.out.println("Inimigo usou a Carta6.");
                                        System.out.println("Seu HP agora está em: " + hp);

                                        ultimaCartaInimigo = Carta6;
                                    } else {
                                        if (maoInimigo.contains(Carta7)) {
                                            hp = hp - 7;
                                            System.out.println("Inimigo usou a Carta7.");
                                            System.out.println("Seu HP agora está em: " + hp);

                                            ultimaCartaInimigo = Carta7;
                                        } else {
                                            if (maoInimigo.contains(Carta8)) {
                                                hp = hp - 8;
                                                System.out.println("Inimigo usou a Carta8.");
                                                System.out.println("Seu HP agora está em: " + hp);

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
                    hp = hp - 1;
                    System.out.println("Inimigo usou a Carta1.");
                    System.out.println("Seu HP agora está em: " + hp);

                    ultimaCartaInimigo = Carta1;
                } else {
                    if (maoInimigo.contains(Carta2)) {
                        hp = hp - 2;
                        System.out.println("Inimigo usou a Carta2.");
                        System.out.println("Seu HP agora está em: " + hp);

                        ultimaCartaInimigo = Carta2;
                    } else {
                        if (maoInimigo.contains(Carta3)) {
                            hp = hp - 3;
                            System.out.println("Inimigo usou a Carta3.");
                            System.out.println("Seu HP agora está em: " + hp);

                            ultimaCartaInimigo = Carta3;
                        } else {
                            if (maoInimigo.contains(Carta4)) {
                                hp = hp - 4;
                                System.out.println("Inimigo usou a Carta4.");
                                System.out.println("Seu HP agora está em: " + hp);

                                ultimaCartaInimigo = Carta4;
                            } else {
                                if (maoInimigo.contains(Carta5)) {
                                    hp = hp - 5;
                                    System.out.println("Inimigo usou a Carta5.");
                                    System.out.println("Seu HP agora está em: " + hp);

                                    ultimaCartaInimigo = Carta5;
                                } else {
                                    if (maoInimigo.contains(Carta6)) {
                                        hp = hp - 6;
                                        System.out.println("Inimigo usou a Carta6.");
                                        System.out.println("Seu HP agora está em: " + hp);

                                        ultimaCartaInimigo = Carta6;
                                    } else {
                                        if (maoInimigo.contains(Carta7)) {
                                            hp = hp - 7;
                                            System.out.println("Inimigo usou a Carta7.");
                                            System.out.println("Seu HP agora está em: " + hp);

                                            ultimaCartaInimigo = Carta7;
                                        } else {
                                            if (maoInimigo.contains(Carta8)) {
                                                hp = hp - 8;
                                                System.out.println("Inimigo usou a Carta8.");
                                                System.out.println("Seu HP agora está em: " + hp);

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
                    hp = hp - 1;
                    System.out.println("Inimigo usou a Carta1.");
                    System.out.println("Seu HP agora está em: " + hp);

                    ultimaCartaInimigo = Carta1;
                } else {
                    if (maoInimigo.contains(Carta2)) {
                        hp = hp - 2;
                        System.out.println("Inimigo usou a Carta2.");
                        System.out.println("Seu HP agora está em: " + hp);

                        ultimaCartaInimigo = Carta2;
                    } else {
                        if (maoInimigo.contains(Carta3)) {
                            hp = hp - 3;
                            System.out.println("Inimigo usou a Carta3.");
                            System.out.println("Seu HP agora está em: " + hp);

                            ultimaCartaInimigo = Carta3;
                        } else {
                            if (maoInimigo.contains(Carta4)) {
                                hp = hp - 4;
                                System.out.println("Inimigo usou a Carta4.");
                                System.out.println("Seu HP agora está em: " + hp);

                                ultimaCartaInimigo = Carta4;
                            } else {
                                if (maoInimigo.contains(Carta5)) {
                                    hp = hp - 5;
                                    System.out.println("Inimigo usou a Carta5.");
                                    System.out.println("Seu HP agora está em: " + hp);

                                    ultimaCartaInimigo = Carta5;
                                } else {
                                    if (maoInimigo.contains(Carta6)) {
                                        hp = hp - 6;
                                        System.out.println("Inimigo usou a Carta6.");
                                        System.out.println("Seu HP agora está em: " + hp);

                                        ultimaCartaInimigo = Carta6;
                                    } else {
                                        if (maoInimigo.contains(Carta7)) {
                                            hp = hp - 7;
                                            System.out.println("Inimigo usou a Carta7.");
                                            System.out.println("Seu HP agora está em: " + hp);

                                            ultimaCartaInimigo = Carta7;
                                        } else {
                                            if (maoInimigo.contains(Carta8)) {
                                                hp = hp - 8;
                                                System.out.println("Inimigo usou a Carta8.");
                                                System.out.println("Seu HP agora está em: " + hp);

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
                    hp = hp - 1;
                    System.out.println("Inimigo usou a Carta1.");
                    System.out.println("Seu HP agora está em: " + hp);

                    ultimaCartaInimigo = Carta1;
                } else {
                    if (maoInimigo.contains(Carta2)) {
                        hp = hp - 2;
                        System.out.println("Inimigo usou a Carta2.");
                        System.out.println("Seu HP agora está em: " + hp);

                        ultimaCartaInimigo = Carta2;
                    } else {
                        if (maoInimigo.contains(Carta3)) {
                            hp = hp - 3;
                            System.out.println("Inimigo usou a Carta3.");
                            System.out.println("Seu HP agora está em: " + hp);

                            ultimaCartaInimigo = Carta3;
                        } else {
                            if (maoInimigo.contains(Carta4)) {
                                hp = hp - 4;
                                System.out.println("Inimigo usou a Carta4.");
                                System.out.println("Seu HP agora está em: " + hp);

                                ultimaCartaInimigo = Carta4;
                            } else {
                                if (maoInimigo.contains(Carta5)) {
                                    hp = hp - 5;
                                    System.out.println("Inimigo usou a Carta5.");
                                    System.out.println("Seu HP agora está em: " + hp);

                                    ultimaCartaInimigo = Carta5;
                                } else {
                                    if (maoInimigo.contains(Carta6)) {
                                        hp = hp - 6;
                                        System.out.println("Inimigo usou a Carta6.");
                                        System.out.println("Seu HP agora está em: " + hp);

                                        ultimaCartaInimigo = Carta6;
                                    } else {
                                        if (maoInimigo.contains(Carta7)) {
                                            hp = hp - 7;
                                            System.out.println("Inimigo usou a Carta7.");
                                            System.out.println("Seu HP agora está em: " + hp);

                                            ultimaCartaInimigo = Carta7;
                                        } else {
                                            if (maoInimigo.contains(Carta8)) {
                                                hp = hp - 8;
                                                System.out.println("Inimigo usou a Carta8.");
                                                System.out.println("Seu HP agora está em: " + hp);

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
                    hp = hp - 1;
                    System.out.println("Inimigo usou a Carta1.");
                    System.out.println("Seu HP agora está em: " + hp);

                    ultimaCartaInimigo = Carta1;
                } else {
                    if (maoInimigo.contains(Carta2)) {
                        hp = hp - 2;
                        System.out.println("Inimigo usou a Carta2.");
                        System.out.println("Seu HP agora está em: " + hp);

                        ultimaCartaInimigo = Carta2;
                    } else {
                        if (maoInimigo.contains(Carta3)) {
                            hp = hp - 3;
                            System.out.println("Inimigo usou a Carta3.");
                            System.out.println("Seu HP agora está em: " + hp);

                            ultimaCartaInimigo = Carta3;
                        } else {
                            if (maoInimigo.contains(Carta4)) {
                                hp = hp - 4;
                                System.out.println("Inimigo usou a Carta4.");
                                System.out.println("Seu HP agora está em: " + hp);

                                ultimaCartaInimigo = Carta4;
                            } else {
                                if (maoInimigo.contains(Carta5)) {
                                    hp = hp - 5;
                                    System.out.println("Inimigo usou a Carta5.");
                                    System.out.println("Seu HP agora está em: " + hp);

                                    ultimaCartaInimigo = Carta5;
                                } else {
                                    if (maoInimigo.contains(Carta6)) {
                                        hp = hp - 6;
                                        System.out.println("Inimigo usou a Carta6.");
                                        System.out.println("Seu HP agora está em: " + hp);

                                        ultimaCartaInimigo = Carta6;
                                    } else {
                                        if (maoInimigo.contains(Carta7)) {
                                            hp = hp - 7;
                                            System.out.println("Inimigo usou a Carta7.");
                                            System.out.println("Seu HP agora está em: " + hp);

                                            ultimaCartaInimigo = Carta7;
                                        } else {
                                            if (maoInimigo.contains(Carta8)) {
                                                hp = hp - 8;
                                                System.out.println("Inimigo usou a Carta8.");
                                                System.out.println("Seu HP agora está em: " + hp);

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
                    hp = hp - 1;
                    System.out.println("Inimigo usou a Carta1.");
                    System.out.println("Seu HP agora está em: " + hp);

                    ultimaCartaInimigo = Carta1;
                } else {
                    if (maoInimigo.contains(Carta2)) {
                        hp = hp - 2;
                        System.out.println("Inimigo usou a Carta2.");
                        System.out.println("Seu HP agora está em: " + hp);

                        ultimaCartaInimigo = Carta2;
                    } else {
                        if (maoInimigo.contains(Carta3)) {
                            hp = hp - 3;
                            System.out.println("Inimigo usou a Carta3.");
                            System.out.println("Seu HP agora está em: " + hp);

                            ultimaCartaInimigo = Carta3;
                        } else {
                            if (maoInimigo.contains(Carta4)) {
                                hp = hp - 4;
                                System.out.println("Inimigo usou a Carta4.");
                                System.out.println("Seu HP agora está em: " + hp);

                                ultimaCartaInimigo = Carta4;
                            } else {
                                if (maoInimigo.contains(Carta5)) {
                                    hp = hp - 5;
                                    System.out.println("Inimigo usou a Carta5.");
                                    System.out.println("Seu HP agora está em: " + hp);

                                    ultimaCartaInimigo = Carta5;
                                } else {
                                    if (maoInimigo.contains(Carta6)) {
                                        hp = hp - 6;
                                        System.out.println("Inimigo usou a Carta6.");
                                        System.out.println("Seu HP agora está em: " + hp);

                                        ultimaCartaInimigo = Carta6;
                                    } else {
                                        if (maoInimigo.contains(Carta7)) {
                                            hp = hp - 7;
                                            System.out.println("Inimigo usou a Carta7.");
                                            System.out.println("Seu HP agora está em: " + hp);

                                            ultimaCartaInimigo = Carta7;
                                        } else {
                                            if (maoInimigo.contains(Carta8)) {
                                                hp = hp - 8;
                                                System.out.println("Inimigo usou a Carta8.");
                                                System.out.println("Seu HP agora está em: " + hp);

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
            System.out.println("-------------------------------------------------------------------------------");

            //Deletar a carta -CAMPEAO
            int delete = maoCampeao.indexOf(ultimaCarta);
            int deleteOk = 0;
            if(delete==0){
                cartaCampeao1 = "Sem carta";
                deleteOk = 1;
            }
            if(delete==1 &&  deleteOk == 0){
                cartaCampeao2 = "Sem carta";
                deleteOk = 1;
            }
            if(delete==2 &&  deleteOk == 0){
                cartaCampeao3 = "Sem carta";
                deleteOk = 1;
            }
            if(delete==3 &&  deleteOk == 0){
                cartaCampeao4 = "Sem carta";
                deleteOk = 1;
            }
            if(delete==4 &&  deleteOk == 0){
                cartaCampeao5 = "Sem carta";
            }

            //Deletar a carta -INIMIGO
            int deleteInimigo = maoInimigo.indexOf(ultimaCartaInimigo);

            if(deleteInimigo==0){
                cartaInimigo1 = "Sem carta";
            }
            if(deleteInimigo==1){
                cartaInimigo2 = "Sem carta";
            }
            if(deleteInimigo==2){
                cartaInimigo3 = "Sem carta";
            }
            if(deleteInimigo==3){
                cartaInimigo4 = "Sem carta";
            }
            if(deleteInimigo==4){
                cartaInimigo5 = "Sem carta";
            }

        }
        if(hp<=0) {
            System.out.printf("Você perdeu.");
        }else{
            System.out.printf("Você venceu.");
        }
}
}