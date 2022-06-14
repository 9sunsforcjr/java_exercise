package guessnumbergame.cx;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Mactavish
 */
public class Judge {

    static int judge(int personN, int computerN){
        int abs=Math.abs(personN-computerN);
        if(abs==0){
            return 1;
        }
        else if(abs<6){
            return 2;
        }
        else if(abs<11){
            return 3;
        }
        else if(abs<21){
            return 4;
        }
        return 5;
    }
    static int[] editScore(int flag,int personScore,int computerScore){
        switch (flag){
            case 1:
                personScore=personScore+10;
                computerScore=computerScore-10;
                break;
            case 2:
                personScore=personScore+5;
                computerScore=computerScore-5;
                break;
            case 3:
                break;
            case 4:
                personScore=personScore-5;
                computerScore=computerScore+5;
                break;
            case 5:
                personScore=personScore-10;
                computerScore=computerScore+10;
                break;                
        }
        int array[]=new int[2];
        array[0]=personScore;
        array[1]=computerScore;
        return array;
    }
}
